package com.example.lib;


//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
//
//如果不存在最后一个单词，请返回 0 。
//
//说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
//
//输入: "Hello World"
//输出: 5
public class LeetCode58 {

    public static void main(String[] args) {
        int num = lengthOfLastWord("a");
        System.out.printf(num+"");
    }

    public static int lengthOfLastWord(String s) {
       if(s.contains(" ")){
           String [] str = s.split(" ");
           String newstr = "";
           if(str.length>=1){  //这里需要注意判断数组越界
               newstr = str[str.length-1];
           }
           return newstr.length();
       }else {
           return s.length();   //这里应该返回不存在空格情况下的字符串长度，不能直接返回0
       }
    }
}
