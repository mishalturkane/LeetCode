package leetcode.jan.day23;

class Solution {
    public static int lengthOfLastWord(String s) {
        return s.trim().substring(s.trim().lastIndexOf(" ")+1,s.trim().length()).length();
    }


    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(lengthOfLastWord(str));
    }
}
