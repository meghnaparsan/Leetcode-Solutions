class MyCircularQueue {

    Node head;
    Node rear;
    int size;
    int length;
    
    public MyCircularQueue(int k) {
        size = 0;
        length = k;
    }
    
    public boolean enQueue(int value) {
        
        //Queue is full
        if (isFull()) {
            return false;
        }
        
        Node newNode = new Node (value, null);

        //First Node 
        if (head == null) {
            head = newNode;
            rear = newNode;
            head.next = head;
            size++;
            return true;
        }
        
        rear.next = newNode;
        rear = newNode;
        newNode.next = head;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        
        //Queue is Empty
        if (isEmpty()) {
            return false;
        }
        
        if (size == 1) {
            head = null;
            rear = null;
            size--;
            return true;
        }
        
        head = head.next;
        rear.next = head;
        size--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : head.value;
    }
    
    public int Rear() {
        return isEmpty() ? -1 : rear.value;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == length;
    }
}

class Node {
    int value;
    Node next;
    
    Node (int value, Node next) {
        this.value = value;
        this.next = next;
    }
}