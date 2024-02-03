package leetcode.jan.day09;

class Solution {

    //Binary Search in array
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }

    public static void main(String[] args) {
        int [] arr={3,6,7,8,10};
        System.out.println(searchInsert(arr,5));
    }
}