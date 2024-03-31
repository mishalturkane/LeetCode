/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        if(head.next==null)
        {
            return 1;
        }
        boolean bool=false;
        int cnt=nums.length;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,null);
        }
        while(head!=null)
        {
            if(map.containsKey(head.val))
            {
                if(bool)
                {
                    cnt--;//agar bool true h toh length decrease karo otherwise true banao usko
                }
                else
                {
                    bool=true;
                }
            }
            else
            {
                bool=false;
            }
            head=head.next;
        }
        return cnt;
    }
}
