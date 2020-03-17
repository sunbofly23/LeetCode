package com.example.lib;


//实现 int sqrt(int x) 函数。
//计算并返回 x 的平方根，其中 x 是非负整数。
//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//假设 x的平方等于y,已知y,求x;
//公式:x=(x+y/x)/2;
public class LeetCode69 {

    public static void main(String[] args) {

       int num = mySqrt(50);
        System.out.printf(""+num);
    }

    public  static  int mySqrt(int x) {
        double g=x;
        while(Math.abs(g*g-x)>0.000001)
        {
            g=(g+x/g)/2;
        }
        return (int)g;
    }
}
