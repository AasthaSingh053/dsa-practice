import java.util.*;
//implement Doubly linkedlist
class Node{
        private int data;
        private Node prev;
        private Node next;
        public Node(int data){
            this.data =  data;
        }
        public int getData(){
            return data;
        }
        public void setdata(){
            this.data = data;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next = next;
        }
        public Node getPrev(){
            return prev;
        }
        public void setPrev(Node prev){
            this.prev = prev;
        }
    }
class Doubly_linkedlist{
    public static void main(String[] args) {
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node forty = new Node(40);
        Node fifty = new Node(50);
        Node head = ten;
        Node tail = fifty;
        ten.setNext(twenty);
        ten.setPrev(null);
        twenty.setNext(thirty);
        twenty.setPrev(ten);
        thirty.setNext(forty);
        thirty.setPrev(twenty);
        forty.setNext(fifty);
        forty.setPrev(thirty);
        fifty.setPrev(forty);
        fifty.setNext(null);
        printLinkedList(head);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int data = sc.nextInt();
        printLinkedList(head);
        System.out.println("aftre reversing");
        printLinkedList_reverse(tail);
        }
//iterate and print linkedlist
        public static void printLinkedList(Node head){
            Node temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
        //iterate and print linkedlist in reverse order
        public static void printLinkedList_reverse(Node tail){
            Node temp = tail;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getPrev();
        }
    }
}
   