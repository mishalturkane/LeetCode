package leetcode.jan.day28;

class Solution {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char [] arr={'h','e','l','l','o'};
        reverseString(arr);
        for(char x:arr){
            System.out.print(x+" ");
        }
    }
}