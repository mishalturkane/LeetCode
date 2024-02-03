package leetcode.jan.day06;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer to maintain non-equal elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

    }
}