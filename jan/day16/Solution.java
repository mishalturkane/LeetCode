package leetcode.jan.day16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Create a map to store original indices of scores
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(score[i], i);
        }

        // Sort the scores in descending order
        Arrays.sort(score);
        for (int i = n - 1; i >= 0; i--) {
            int originalIndex = indexMap.get(score[i]);
            if (i == n - 1) {
                result[originalIndex] = "Gold Medal";
            } else if (i == n - 2) {
                result[originalIndex] = "Silver Medal";
            } else if (i == n - 3) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = Integer.toString(n - i);
            }
        }

        return result;
    }
}