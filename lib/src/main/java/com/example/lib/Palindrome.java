package com.example.lib;

/**
 * Create by bo.sun on 2019/10/8.
 */
/*
* 判断一个字符串是否为回文串，
*
*For example,
*"A man, a plan, a canal: Panama" is a palindrome.
*"race a car" is not a palindrome.
*
* */


public class Palindrome {

    public boolean isPalindrome(String s){
        //如果是空字符串认为不是回文串
        if(s==null||s.length()==0)
            return false;
        //定义一个头指针
        int i = 0;
        //定义一个尾指针
        int j = s.length()-1;
        //头指针向后遍历，尾指针向前遍历，当他们两相等的时候，循环结束。
        while (i<j){
            //从前往后判断每一个字符，如果不是数字又不是字母就跳过
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            //从后往前判断每一个字符，如果不是数字又不是字母就跳过
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return  true;
    }

    //项目当时解析json
//public static void  sort(){
//    String [] srr = new String[10];
//    String str = "[1000,2000,3000,5000,8000,10000,15000,20000,25000,30000]";
//    if (!str.isEmpty()) {
//        str = str.substring(1,str.length()-1);
//        srr = str.split(","); // 用,分割
//        if(!srr[0].isEmpty())
//        System.out.printf(Integer.parseInt(srr[0])+"");
//        for (String i:srr
//             ) {
//            System.out.printf(i+"\n");
//        }
//    }
//}
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        Palindrome palindrome = new Palindrome();
        boolean flag = palindrome.isPalindrome(str);
        System.out.printf(flag+"");
//        sort();
    }






}
