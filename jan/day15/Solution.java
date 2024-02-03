package leetcode.jan.day15;

class Solution {
    public static void moveZeroes(int[] nums) {
        // Initialize a variable to keep track of the position to insert non-zero elements
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int num : nums) {
            // If the current element is non-zero, move it to the front and update the index
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        // Print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}