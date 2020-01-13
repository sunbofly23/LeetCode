package com.example.lib;



//Input: haystack = "hello", needle = "ll"
//Output: 2

//Input: haystack = "aaaaa", needle = "bba"
//Output: -1


public class LeetCode28 {

    public static int strStr(String haystack, String needle) {
        int size = -1;
        if (needle == null||haystack==null) {
           return 0;
        }else{
            size=haystack.indexOf(needle);
        }

        return size;
    }


    public static void main(String[] args) {
        String str = "aaaaa";
        String sub = "bba";
        int i = strStr(str,sub);
        System.out.printf(i+"");
    }

}
