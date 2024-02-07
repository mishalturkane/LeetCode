package leetcode.feb.linkedlist;

public class OrderList {
    public void reorderList(ListNode head)
    {
        if(head == null || head.next == null)
            return ;

        ListNode mid = getMid(head);
        ListNode hSecond = reverse(mid);
        ListNode hFirst = head;


        while(hFirst != null && hSecond != null)
        {
            ListNode temp = hFirst.next;
            hFirst.next = hSecond;
            hFirst = temp;
            temp = hSecond.next;
            hSecond.next = hFirst;
            hSecond = temp;

        }
        if(hFirst != null)
            hFirst.next = null;
    }
    public ListNode getMid(ListNode node)
    {
        ListNode fast = node;
        ListNode slow = node;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode mid)
    {
        ListNode prev = null;
        ListNode present = mid;
        ListNode then = present.next;
        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = then;
            if(then != null)
                then = then.next;

        }
        return prev;
    }
}
