package com.example.lib;


//给定两个二进制字符串，返回他们的和（用二进制表示）。
//输入为非空字符串且只包含数字 1 和 0。
//输入: a = "11", b = "1"
//输出: "100"
//输入: a = "1010", b = "1011"
//输出: "10101"


public class leetcode67 {
    public static void main(String[] args) {
        String str  =  addBinary("1010","1011");
        System.out.printf(str);
    }

//转10进制，然后加，然后转2 会超出int范围。不行
//特殊情况
//10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101
//int的最大范围 2147483647 = 1111111111111111111111111111111
    public static String addBinary(String a, String b) {
        int a_10 = Integer.parseInt(a, 2);
        int b_10 = Integer.parseInt(b, 2);
        int c = a_10 + b_10;
        return Integer.toBinaryString(c);
    }

}
