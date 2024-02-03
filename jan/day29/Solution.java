package leetcode.jan.day29;

class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128]; // Assuming ASCII characters

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int palindromeLength = 0;
        boolean hasOddFreq = false;

        // Calculate the length of the palindrome
        for (int count : charCount) {
            palindromeLength += count / 2 * 2; // Count pairs of characters
            if (count % 2 == 1) {
                hasOddFreq = true;
            }
        }

        // If there is any character with odd frequency, add 1 for the middle character
        if (hasOddFreq) {
            palindromeLength += 1;
        }

        return palindromeLength;
    }
}
