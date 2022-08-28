class MyLinkedList {
    Node head;
    
    public MyLinkedList() {}
    
    public int get(int index) {
        
        Node temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        
        if (temp == null) {
            return -1;
        }
        
        return temp.data;
    }
    
    public void addAtHead(int val) {
        
        Node temp = new Node (val, null, null);
        
        //First Node
        if (head == null) {
            head = temp;
        }
        
        else {
            Node headTemp = head;
            head.previous = temp;
            temp.next = headTemp;
            head = temp;
        }
    }
    
    public void addAtTail(int val) {
        
        //First Node
        if (head == null) {
            addAtHead (val);
        }
        
        else {
            Node temp = new Node (val, null, null);
            Node tail = head;
            
            //Get the last Node
            while (tail.next != null) {
                tail = tail.next;
            }
            
            tail.next = temp;
            temp.previous = tail;
        }
    }
    
    public void addAtIndex(int index, int val) {
        
        //Add at head
        if (index == 0) {
            addAtHead (val);
            return;
        }
        
        int i = 0;
        Node temp = head;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        
        // Invalid Index
        if (temp == null && i < index) {
            return;
        }
        
        //Index equals length of the list
        if (temp == null && i <= index) {
            addAtTail (val);
            return;
        }
        
        Node newNode = new Node (val, null, null);
        temp.previous.next = newNode;
        newNode.previous = temp.previous;
        temp.previous = newNode;
        newNode.next = temp;
    }
    
    public void deleteAtIndex(int index) {
        
        int i = 0;
        Node temp = head;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        
        // Invalid Index
        if (temp == null && i <= index) {
            return;
        }
        
        // Only one is present
        if (temp.previous == null && temp.next == null) {
            head = null;
            return;
        }
        
        //head
        if (temp.previous == null) {
            Node headTemp = head;
            temp.next.previous = null;
            head = headTemp.next;
            return;
        }
        

        //tail
        if (temp.next == null) {
            temp.previous.next = null;
            return;
        }
        
        //middle
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
    }
}

class Node {
    int data;
    Node next;
    Node previous;
    
    Node () {}
    
    Node (int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}