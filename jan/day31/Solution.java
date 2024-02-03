package leetcode.jan.day31;

class Solution {
    public String reverseVowels(String s) {
        // Convert the  string to a character array for easier manipulation
        char[] chars = s.toCharArray();

        // Initialize two pointers, left and right, for swapping vowels
        int left = 0, right = chars.length - 1;

        // Continue swapping vowels until the left pointer is less than the right pointer
        while (left < right) {
            // Move the left pointer to the next non-vowel character
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            // Move the right pointer to the next non-vowel character
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap the vowels at the left and right pointers
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        // Convert the character array back to a string and return the result
        return new String(chars);
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
