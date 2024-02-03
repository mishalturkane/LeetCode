package leetcode.jan.day27;

class Solution {
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (char c : columnTitle.toCharArray()) {
            // Convert character to its corresponding ASCII value
            // and subtract the ASCII value of 'A' to get the relative position
            int value = c - 'A' + 1;

            // Update the result by multiplying it by 26 (number of letters in the alphabet)
            // and adding the value of the current character
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}