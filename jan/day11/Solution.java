package leetcode.jan.day11;

class Solution {
    public  static int[] twoSum(int[] nums, int target) {

        int result[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1+i;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int numbers[]={2,7,11,15};
         int [] s=twoSum(numbers,9);
         for(int x:s){
             System.out.print(x+" ");
         }
    }
}