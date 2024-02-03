package leetcode.jan.day17;

class NumArray {
    private int[] cumulativeSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        cumulativeSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            cumulativeSum[i + 1] = cumulativeSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return cumulativeSum[right + 1] - cumulativeSum[left];
    }
}