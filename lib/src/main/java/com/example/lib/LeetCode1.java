package com.example.lib;

/**
 * Created by sunbo on 2019/5/3.
 */

/**
 *  Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
 */


public class LeetCode1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] b=new int[2];
        boolean k = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    b[0]=i;
                    b[1]=j;
                    k=true;
                    break;
                }
            }
            if(k)
                break;
        }
        return b;
    }


    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        for (int i=0;i<twoSum(nums,9).length;i++){
            System.out.printf(""+twoSum(nums,9)[i]+" ");
        }
    }
}
