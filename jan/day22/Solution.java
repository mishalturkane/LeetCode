package leetcode.jan.day22;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        // Iterate through the array and negate the value at the corresponding index
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                // If the value at the index is already negative, it means it's a duplicate
                result[0] = Math.abs(nums[i]);
            }
        }

        // Find the missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
}