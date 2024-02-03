package leetcode.jan.day18;

import java.util.Arrays;

public class SecondLargest {
    
    public static int secLarge(int [] arr){
        int min= Integer.MIN_VALUE;
        Arrays.sort(arr);
        if(arr[arr.length-2]==arr[arr.length-1])
            return min;
        return arr[arr.length-2];
    }
    public static int secLargeOptimised(int [] arr){
        int max,secMax;
        max=secMax=Integer.MIN_VALUE;
        for(int x: arr){
            if(x>max){
                secMax=max;
                max=x;
            }else {
                if(x>secMax && x!=max){
                    secMax=x;
                }
            }
        }
        return secMax;
    }


    public static void main(String[] args) {
        int [] arr={6,8,4,9,2};
        System.out.println(secLargeOptimised(arr));
    }
    
}
