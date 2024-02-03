package leetcode.jan.day10;

import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
            char [] arr=s.toCharArray();
            Stack<Character>st =new Stack<>();
            for(char ch:arr){
                if(ch=='(' || ch=='{' ||ch=='['){
                            st.push(ch);
                }else {
                    if(st.empty()){
                        return  false;
                    }
                    char top=st.pop();
                    switch (ch){
                        case ')':
                            if(top!='(')
                                return false;
                            break;
                        case '}':
                            if(top!='{')
                                return false;
                            break;
                        case ']':
                            if(top!='[')
                                return false;
                            break;
                    }
                }
            }
            return st.empty();
    }

    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
}