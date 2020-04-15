package com.example.lib;


//分发饼干

//贪心算法学习


import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode455 {


    public static int findContentChildren(int[] g, int[] s) {

        //贪心的思想是先对数据排序，用小饼干满足小孩子

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0 ;
        int pike = 0;


        while(child<g.length&&pike<s.length){
            //如果孩子的需求小于等于饼干，就换下个孩子
            if(g[child]<=s[pike]){
                child++;
            }

            //饼干只能用一次
            pike++;

        }

        return child;
    }


    public static void main(String[] args) {

        int []  childs =new int[]{1,2,3};
        int []  pikes = new int[]{1,1};

        int num = findContentChildren(childs,pikes);
        System.out.printf(num+"");
    }
}
