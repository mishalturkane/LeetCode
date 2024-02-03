package leetcode.jan.day05;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> st=new HashSet<>();

        for(int i=0;i< nums.length; i++){
            if(st.contains(nums[i]))
                return true;
            st.add(nums[i]);
        }
        return false;

    }

    public  static  void show(){
        Stack<Integer> st=new Stack<>();
        st.peek();
        st.push(10);
        System.out.println( "Popped:"+st.pop());
        st.push(20);
        st.peek();
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,1};
    //    System.out.println(containsDuplicate(arr));
        show();
    }
}