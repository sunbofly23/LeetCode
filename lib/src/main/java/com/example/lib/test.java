package com.example.lib;

public class test {

    public static void main(String[] args) {
        test();
    }


    private static  void test(){
        String a = "babbcbb";
        String b = "bb";
        String c = "dd";

        while (a.contains(b)){
//            System.out.printf(a.contains(b)+"");
            int start=a.indexOf(b);
            int end = start+c.length();
            String newa = a.substring(0,start);
            String newb = a.substring(end,a.length());
            a = newa+c+newb;

        }
        System.out.printf(a);
    }



}
