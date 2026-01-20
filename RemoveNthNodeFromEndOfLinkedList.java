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
}/**
class Solution{
    public ListNode removeNthNodeFromEndOflinkedList(ListNode head,int pos){
        int length = lengthOfLinkedList(head);
        int index = length - pos;
        ListNode temp = head;
        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = head;
        return temp;
    }
    public int  lengthOfLinkedList(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        return  length;
    }
}**/
class Solution {
    public ListNode removeNthNodeFromEndOflinkedList(ListNode head, int pos) {
        // Dummy node to handle edge cases like removing head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by pos steps
        for (int i = 0; i < pos; i++) {
            if (fast.next == null) return head; // invalid pos
            fast = fast.next;
        }

        // Move both until fast reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the node
        slow.next = slow.next.next;

        return dummy.next; // return new head
    }
}
class RemoveNthNodeFromEndOflinkedList{
     public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution obj = new Solution();
        ListNode temp = obj.removeNthNodeFromEndOflinkedList(head,2);
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     }
}