package leetcode.jan.day18;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        // Calculating array pair sum directly without the need for a separate loop
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}