//find middle node of linkedlist
//reverse the second half
//
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
public class ReorderLinkedList {
    public ListNode findmiddleOfLinkedlist(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
     }
     private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // Reverse second half starting from middle
    private ListNode reverseSecondHalf(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return reverse(slow);
    }
    public ListNode reorderList(ListNode head){
        ListNode mid = findmiddleOfLinkedlist(head);
        ListNode
    }
    }
