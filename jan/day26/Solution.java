package leetcode.jan.day26;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // Check if the lengths of pattern and words array are the same
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            // Check if the current character in pattern is already mapped to a word
            if (charToWord.containsKey(currentChar)) {
                // If the mapping is not consistent, return false
                if (!charToWord.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                // If the current word is already mapped to a character, return false
                if (wordToChar.containsKey(currentWord)) {
                    return false;
                }

                // Create a new mapping
                charToWord.put(currentChar, currentWord);
                wordToChar.put(currentWord, currentChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // Output: true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // Output: false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // Output: false
    }
}
