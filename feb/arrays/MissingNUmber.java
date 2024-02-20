package leetcode.feb.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNUmber {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the sum of all numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        // Calculate the sum of the numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}
