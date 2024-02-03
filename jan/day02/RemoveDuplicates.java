package leetcode.jan.day02;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array is empty, return 0.
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize the pointer k to 1 as the first element is always unique.
        int k = 1;

        // Iterate through the array starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous element,
            // update the k-th element with the current element and increment k.
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Return k, which represents the count of unique elements.
        return k;
    }
    public static void main(String[] args) {

    }
}
