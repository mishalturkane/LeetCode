package leetcode.jan.day30;

class Solution {
    public static int countBinarySubstrings(String s) {
        int result = 0, prevGroup = 0, currentGroup = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                currentGroup++;
            } else {
                result += Math.min(prevGroup, currentGroup);
                prevGroup = currentGroup;
                currentGroup = 1;
            }
        }

        return result + Math.min(prevGroup, currentGroup);
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("mishalturkane"));
    }
}