package com.example.lib;



//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//注意：给定 n 是一个正整数。
public class LeetCode70 {

    public static void main(String[] args) {
       int rank =  climbStairs(45);
        System.out.printf(rank+"");
    }


    public static int climbStairs(int n) {
        int result = 1;
        if (n == 1)
            return result;
        else if (n == 2) {
            result = 2;
            return result;
        } else {
            int x = 1;
            int y = 2;
            for (int i = 3; i <= n; i++) {
                result = x + y;
                x = y;
                y = result;
            }
        }
        return result;
    }


}
