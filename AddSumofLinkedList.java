 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     ListNode(ListNode next) { this.next = next; }
 }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode f = l1;
        ListNode s = l2;
        ListNode head = null,last = null;
        int carry = 0;
        int sum = 0;
        while(f!=null || s!=null){
            sum = carry;
            if(f != null){
                sum += f.val;
                f = f.next;
            }
             if(s != null){
                sum += s.val;
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
}public class AddSumofLinkedList {
    public static void main(String args[]){
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(3);
         ListNode head2 = new ListNode(4);
        head2.next = new ListNode(3);
        Solution obj = new Solution();
        ListNode head = obj.addTwoNumbers(head1, head2);
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val);
            temp = temp.next;
        }

    }
}
