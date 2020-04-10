package com.example.lib;


//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//        说明：
//
//        你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
//        示例 1:
//
//        输入: [2,2,1]
//        输出: 1

import java.util.LinkedList;

public class LeetCode136 {

    //时间复杂度n，用相同数做减法思路
//    public static int singleNumber(int[] nums) {
//
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        int sum = 0;
//
//        for(int i=0;i<nums.length;i++){
//            if(linkedList.contains(nums[i])){
//                linkedList.add(nums[i]);
//                sum-=nums[i];
//            }else{
//                linkedList.add(nums[i]);
//                sum+=linkedList.get(i);
//            }
//        }
//
//        return sum;
//    }


    //时间复杂度为n,用异或运算 相同为0，不同为1

    public static int singleNumber(int[] nums) {

      int num = 0;

      for(int i=0;i<nums.length;i++){
          num = num^nums[i];
      }

        return num;
    }


    public static void main(String[] args) {

        int a[] = new int[]{-2,-2,2};
        int num = singleNumber(a);
        System.out.printf(""+num);


    }

}
