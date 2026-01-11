//Use floyds cycle detection algorithm
import java.util.*;
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
    }
    public ListNode(int data,ListNode next){
        this.data = data;
        this.next = next;
    }
}
/**class Solution{
    public ListNode middleOfLinkedlist(ListNode head){
        ListNode temp = head;
        int count = 0;
        int mid = 0;
        while(temp!= null){
            temp = temp.next;
            count++;
        }
        System.out.println("Count = "+count);
        temp = head;
        mid = count/2;
        for(int i = 0;i<mid;i++){
                temp = temp.next;
            }
        return temp;
    }
}**/
class Solution{
    public ListNode middleOfLinkedlist(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
class MiddleOfLinkedList{
    public static void main(String args[]){
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        Solution obj = new Solution();
        ListNode temp = obj.middleOfLinkedlist(head);
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     }
}
