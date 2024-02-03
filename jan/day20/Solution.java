package leetcode.jan.day20;

class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;

        for (int i = 0; i < prices.length; i++) {
            lsf = Math.min(lsf, prices[i]);
            op = Math.max(op, prices[i] - lsf);
        }

        return op;
    }
}