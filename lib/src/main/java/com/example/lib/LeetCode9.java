package com.example.lib;

/**
 * Created by sunbo on 2019/5/3.
 */


import java.util.Collections;

/**
 * Input: 121
 Output: true

 Input: -121
 Output: false

 Input: 10
 Output: false
 */
public class LeetCode9 {
    private static  boolean isPalindrome(int x) {
        StringBuffer str = new StringBuffer();

        str.append(String.valueOf(x));
        String ori = str.toString();

        str=str.reverse();

        String end = str.toString();
        return ori.compareTo(end) == 0;
    }


    public static void main(String[] args) {
        System.out.printf(""+isPalindrome(121));
    }
}
