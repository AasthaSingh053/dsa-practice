//fp is pointer of first node
//sp is pointer of second node
class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
       this.data = data;
        next = null;
    }
}
class Solution{
    public ListNode getIntersectNode(ListNode headA,ListNode headB){
        int m = findListLength(headA);
        int n = findListLength(headB);
        ListNode fp = headA,sp = headB;
        if(m<n){
            int skip_time = n-m;
            for(int i = 0;i<skip_time;i++){
                sp = sp.next;
            }
        }
        else if(m>n){
            int skip_time = m-n;
            for(int i = 0;i<skip_time;i++){
                fp = fp.next;
            }
        }
        ListNode intersection_point = findSamenode(fp,sp);
        return intersection_point;

    }
    public int findListLength(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
         }
         private ListNode findSamenode(ListNode fp,ListNode sp){
            while(fp!=null && sp!= null){
                if(fp == sp){
                    return fp;
                }
                else{
                    fp = fp.next;
                    sp = sp.next;
                }

            }
            return null;
         }
}
public class Intersection_of_two_linkedlist {
    public static void main(String[] args) {
        // Create two linked lists with intersection
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // First list: 3 -> 7 -> 8 -> 10
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        // Second list: 99 -> 1 -> 8 -> 10
        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;

        Solution sol = new Solution();
        ListNode intersection = sol.getIntersectNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        }
         else {
            System.out.println("No intersection found.");
        }
    }
}
