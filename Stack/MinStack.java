// Using in-built Stack
class MinStack {
    
    Stack <Integer> stack;
    Stack <Integer> minStack;
    public MinStack() {
        stack = new Stack <Integer> ();
        minStack = new Stack <Integer> ();
    }
    
    public void push(int val) {
        if (stack.isEmpty() || minStack.peek() >= val) {
            minStack.push (val);
        }
        
        stack.push (val);
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        
        if (minStack.peek().equals (stack.peek())) {
            minStack.pop();
        }
        
        stack.pop();
    }
    
    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        
        return stack.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        
        return minStack.peek();
    }
}

// Custom Stack
class MinStack {

    Node head;
    public MinStack() { }
    
    public void push(int val) {
        if (head == null) {
            head = new Node (val, val, null);
        }
        
        else {
            head = new Node (val, Math.min (val, head.min), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}

class Node {
    int data;
    int min;
    Node next;
    
    Node (int data, int min, Node next) {
        this.data = data;
        this.min = min;
        this.next = next;
    }
}