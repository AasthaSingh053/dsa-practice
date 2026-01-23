import java.util.*;
class ListNode{
    int val;
    ListNode next;
    public ListNode(int data,ListNode next){
        this.val = val;
        this.next = next;
    }
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(ListNode next){
        this.next = next;
    }
    
}
class Solution{
    public ListNode add(ListNode head,int val){
        ListNode temp = head;
        ListNode newNode = new ListNode(val);
        newNode.next = null;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public ListNode remove(ListNode head){
        head = head.next;
        return head;
    }
    public int front(ListNode head){
        return head.val;
    }
    public void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
public class QueueImplementation {
    public static void main(String args[]){
        Solution obj = new Solution();
        ListNode queue = new ListNode(5);
        queue.next = new ListNode(3);
        ListNode newQueue = obj.add(queue,5);
        obj.display(newQueue);

    }
}
