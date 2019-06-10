package com.example.lib;

/**
 * Created by sunbo on 2019/5/3.
 */

/**
 * Input: 123
 Output: 321

 Input: -123
 Output: -321

 Input: 120
 Output: 21
 */

public class LeetCode7 {
    private static int reverse(int x) {
        int m=0;
        int temp = 0;
        while(x!=0){
            m=m*10+x%10;
            if(temp != m/10) {	/*根据补码运算规则,如果发生了 溢出那么temp和m/10的值一定不相等*/
                return 0;
            }
            temp = m;
            x=x/10;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.printf(""+reverse(-1123));
    }






}
