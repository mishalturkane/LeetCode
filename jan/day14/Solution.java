package leetcode.jan.day14;

class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n;

        // XOR all the numbers from 0 to n and XOR all the numbers in the array
        for (int i = 0; i < n; i++) {
            result ^= i;
            result ^= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,3,4,5,5,4};
        System.out.println(missingNumber(arr));
    }
}