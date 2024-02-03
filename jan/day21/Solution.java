package leetcode.jan.day21;

class Solution {
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("asada","sad"));
    }
}