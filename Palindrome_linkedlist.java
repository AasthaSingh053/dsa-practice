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
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Reverse the second half
        ListNode secondHalf = reverseSecondHalf(head);

        // Step 2: Compare halves
        ListNode first = head;
        ListNode second = secondHalf;
        boolean palindrome = true;
        while (second != null) {
            if (first.data != second.data) {
                palindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        // Step 3 (optional): Restore the list
        reverse(secondHalf);

        return palindrome;
    }

    // Reverse helper
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
}
class Palindrome_linkedlist{
    public static void main(String args[]){
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        ListNode head = node1;
        Solution obj = new Solution();
        boolean isPalindrome = obj.isPalindrome(head);
        System.out.println(isPalindrome);
    }
}