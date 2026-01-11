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
class Solution{
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode f = l1;
        ListNode s = l2;
        ListNode head = null,last = null;
        int carry = 0;
        int sum = 0;
        while(f!=null || s!=null){
            sum = carry;
            if(f != null){
                sum += f.data;
                f = f.next;
            }
             if(s != null){
                sum += s.data;
                s = s.next;
            }
            int val = sum%10;
            carry = sum/10;
            if(head == null){
                head = new ListNode(val);
                last = head;
            }
            else{
                last.next = new ListNode(val);
                last = last.next;
            }
        }
        if(carry > 0){
                last.next = new ListNode(carry);
                last = last.next;
            }
        return head;
    }
}

   public class AddTwoNumbers {
    public static void main(String args[]){
        ListNode head1 = new ListNode(8);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(6);
        Solution obj = new Solution();
        ListNode temp = obj.addTwoNumbers(head1,head2);
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     }
}
