 class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
        next = null;
    }
}
class Solution{
    public ListNode mergeTwoList(ListNode list1,ListNode list2){
        ListNode fp = list1;
        ListNode sp = list2;
        ListNode temp = null,head = null,tail = null;
        while(fp!=null || sp!=null){
            if(fp!=null && sp!=null){
                if(fp.data<=sp.data){
                    temp  = fp;
                    fp = fp.next;
                }
             else{
                    temp = sp;
                    sp = sp.next;
        }
    }
    else if(fp!= null){
        temp = fp;
        fp = fp.next;
    }
    else{
        temp = sp;
        sp = sp.next;
    }
    tail = insertAtEnd(tail,temp.data);
    if(head == null){
        head = tail;
    }
}
    return head;
    }
       private ListNode insertAtEnd(ListNode tail,int data){
        ListNode newnode = new ListNode(data);
        if(tail != null){
            tail.next = newnode;
            tail = newnode;
            return tail;
        }
        else{
            return newnode;
        }
    }
}
class Merge_two_linkedlist{
    public static void main(String args[]){
        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(10);
        list1.next.next = new ListNode(15);
        list1.next.next.next = new ListNode(20);
        ListNode list2 = new ListNode(100);
        list2.next = new ListNode(105);
        list2.next.next = new ListNode(116);
        list2.next.next.next = new ListNode(128);
        list2.next.next.next.next = new ListNode(209) ;
        Solution obj = new Solution();
        ListNode mergedNode = null;
        System.out.println("The Merged node is");
       mergedNode =  obj.mergeTwoList(list1,list2);
       while(mergedNode != null){
       System.out.println(mergedNode.data);
        mergedNode = mergedNode.next;
    }
}
}