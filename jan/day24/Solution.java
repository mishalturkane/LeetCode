package leetcode.jan.day24;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        // Use two pointers to compare characters from the start and end
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}