package com.example.lib;


import java.lang.reflect.Array;

//输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

//结题思路:动态规划
public class LeetCode53 {


    public static void main(String[] args) {

        int [] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int max = maxSubArray(a,a.length);

        System.out.printf("最大子串和:"+max);

    }


//官方答案Kadane算法
//    public static int maxSubArray(int[] nums) {
//        if(nums.length==0||nums==null){
//             return 0;
//        }
//        int max = 0;
//        int sum = 0;
//
//        for(int num:nums){
//            max = Math.max(0,num+max);
//            sum = Math.max(sum,max);
//        }
//        return sum;
//    }


    public  static  int maxSubArray(int[] nums,int len){
        if(nums.length==0||nums==null){
            return 0;
        }
        int max = nums[0];
        int end = nums[0];

        for(int i=1;i<len;i++){
            end = Math.max(nums[i]+end,nums[i]);
            max = Math.max(end,max);
        }

        return  max;
    }









}
