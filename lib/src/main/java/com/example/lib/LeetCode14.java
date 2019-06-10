package com.example.lib;

/**
 * Created by sunbo on 2019/5/4.
 */


/**
 * Input: ["flower","flow","flight"]
   Output: "fl"

 Input: ["dog","racecar","car"]
 Output: ""

 */


public class LeetCode14 {

    public static void main(String[] args) {
        String[] strs ={"string","strobg","strimg"};
        System.out.printf(longestCommonPrefix(strs));
    }



    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        String str = strs[0];

        for(int i=0;i<str.length();i++){
            char c  = str.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=c)
                    return str.substring(0,i);
            }
        }
        return str;
    }

}
