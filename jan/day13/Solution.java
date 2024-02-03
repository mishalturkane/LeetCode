package leetcode.jan.day13;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int rn = 0;

        // Reverse half of the number.
        while (x > rn) {
            rn = rn * 10 + x % 10;
            x /= 10;
        }

        // Compare original half with the reversed half of the number.
        return x == rn || x == rn / 10;
    }

    public static void main(String[] args) {

    }
}