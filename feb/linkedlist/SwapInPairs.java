package leetcode.feb.linkedlist;

public class SwapInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode point=dummy;
        while (point.next!=null && point.next.next!=null){
            ListNode swap1=point.next;
            ListNode swap2=point.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;

            point.next=swap2;
            point=swap1;

        }
        return dummy.next;
    }
}
