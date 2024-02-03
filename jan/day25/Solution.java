package leetcode.jan.day25;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust to make it 0-based
            char currentChar = (char) ('A' + columnNumber % 26);
            result.insert(0, currentChar);
            columnNumber /= 26;
        }

        return result.toString();
    }
}
