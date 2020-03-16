package com.example.lib;


import java.util.Arrays;

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
//你可以假设除了整数 0 之外，这个整数不会以零开头。
//输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
//输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
public class LeetCode66 {



    //特殊情况:末位为9进位情况，
    //进位后，数组长度不够情况，比如[9,9,9,9]
    public static void main(String[] args) {

        int[] array  = new int[]{1,9};

        int[] souf =  plusOne(array);

        System.out.printf(Arrays.toString(souf));

    }


    public static int[] plusOne(int[] digits) {

        int len = digits.length ;
        int count = 1;

        for (int i = len-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                break;
            } else {//末位加1置0 进位
                count++;
                digits[i] = 0;
                continue;//结束本次循环 进入下一次
            }
        }
        //进位后，数组长度不够情况，比如[9,9,9,9]
        if (count > len) {
            int[] enough = new int[len+1];
            for (int j = 0; j < count; j++) {
                if (j == 0)
                    enough[j] = 1;
                else
                    enough[j] = 0;
            }

            digits = enough;
        }
        return digits;
    }
}
