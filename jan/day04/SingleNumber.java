package leetcode.jan.day04;

public class SingleNumber {
    public static  int singleNumber(int[] nums) {
        int result = 0;
        for (int x : nums) {
            result =result^ x;

          //  System.out.println(x);
        }
        return result;

    }
    public static void main(String[] args) {
            int [] arr={2,2,1};
      //System.out.println(  singleNumber(arr));
        System.out.println(9^2);


    }
}
