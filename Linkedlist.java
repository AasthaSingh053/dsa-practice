import java.util.*;
//implement linkedlist
class Node{
        private int data;
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
    }
class Linkedlist{
    public static void main(String[] args) {
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node forty = new Node(40);
        Node fifty = new Node(50);
        Node head = ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);
        printLinkedList(head);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int data = sc.nextInt();
        insert_at_first(head,data);
        printLinkedList(head);
        del_from_front(head);
        System.out.println("after deletion");
        printLinkedList(head);
        }
//iterate and print linkedlist
        public static void printLinkedList(Node head){
            Node temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    public  static void insert_at_first(Node head,int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
        newnode.setNext(head);
        head = newnode;
        }

}
public static void del_from_front(Node head){
     Node temp = head;
     if(head == null){
        System.out.println("No elements to be deleted");
     }
     else{
    head = head.getNext();
     }
}

}

