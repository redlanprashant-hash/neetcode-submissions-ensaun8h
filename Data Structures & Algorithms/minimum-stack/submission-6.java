class MinStack {

    private Node head;


    public MinStack() {
        
    }
    
    public void push(int val) {
        if(head == null){
            head = new Node(val,val,null);
        }else{
            head = new Node(Math.min(head.min,val),val,head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
       return head.val; 
    }
    
    public int getMin() {
        return head.min;
    }

    private class Node{
        int min;
        int val;
        Node next;

        Node(int min, int val, Node next){
            this.min = min;
            this.val = val;
            this.next = next;
        }
    }
}
