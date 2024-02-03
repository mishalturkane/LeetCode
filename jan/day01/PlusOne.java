package leetcode.jan.day01;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne1(int[] digits) {
            int x=digits.length-1;
            int size=digits.length;
            for(int i=0;i<size;i++){
                if(i==x){
                    if(digits[i]==9){
                        digits=new int[2];
                        digits[i]=1;
                        digits[i+1]=0;
                        return digits;
                    }
                    digits[x]=digits[x]+1;
                }
            }
            return digits;
    }
    public static int[] plusOne2(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int arr[]={9,9};
        System.out.println(Arrays.toString(plusOne2(arr)));
    }
}
