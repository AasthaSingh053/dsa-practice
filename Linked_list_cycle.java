//Cycle in Linked list:
//- A cycle exists in a linked list if a node’s .next pointer eventually points back to a previously visited node instead of null.
//- This creates an infinite loop when traversing the list, because you’ll keep revisiting the same nodes endlessly.
//- In a proper singly linked list, the last node’s .next should be null. If it isn’t, and instead points to an earlier node, that’s a cycle.
//efficient algo:Floyd warshal algo or Hare and Tortoise algo
import java.util.*;
class Node{
    int data;
    Node next = null;
    public Node(int data){
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
//fast will iterate by 2 pointer until fast and fast.next.next is null
//slow will iterate by 1 pointer
//if fast == slow then cycle is detected
class Solution{
        public void detect_Cycle_in_linkedlist(Node head){
            Node fast = head;
            Node slow = head;
            boolean hascycle = false;
            while(fast != null && fast.getNext() != null)
{
                fast = fast.getNext().getNext();
                slow = slow.getNext();
                if(fast == slow){
                    hascycle = true;
                    break;
                }
                }
            if(hascycle==true){
                System.out.println("Cycle is detected");
            }
            else{
                 System.out.println("Cycle is not detected");
            }
        }
}
class Linked_list_cycle{
    public static void main(String[] args) {
         int choice = 1;
         Node head = null,temp = null,tail = null;
         Node next = null;
         Scanner sc = new Scanner(System.in);
            while(choice == 1){
            System.out.println("Enter the data");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            if(head==null){
                head = temp=newnode;
            }
            else{
                temp.setNext(newnode);
                temp = newnode; 
            }
            

            System.out.println("Do you wish to continue(0/1)");
            choice = sc.nextInt();
    }
            tail = head;
            while(tail.getNext()!=null){
                tail = tail.getNext();
                }
                tail.setNext(head.getNext().getNext());8
            Solution obj1 = new Solution();
            obj1.detect_Cycle_in_linkedlist(head);
    }
    public void printList(Node head){
        Node temp = head;
        while(temp != null ){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}