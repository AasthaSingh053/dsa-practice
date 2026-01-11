class  Node{
     int data;
    Node next = null;
    public  Node(int data){
        this.data = data;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return next;
    }
}
class Solution{
    private Node newHead;
    public Node reverse_head(Node head){
        if(head == null){
            return null;
        }
        Node last = reverse_node(head);
        last.setNext(null);
        head = newHead;
        return head;
    }
    public Node reverse_node(Node node){
        Node last;
        if(node.getNext()==null){
            newHead = node;
            return node;
        }
        else{
           last = reverse_node(node.getNext());
           last.setNext(node);
           return node;
        }
    }
}