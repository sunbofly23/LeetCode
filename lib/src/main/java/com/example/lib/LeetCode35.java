package com.example.lib;



//Given a sorted array and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//You may assume no duplicates in the array.

//Input: [1,3,5,6], 5
//Output: 2
//Input: [1,3,5,6], 2
//Output: 1
//Input: [1,3,5,6], 7
//Output: 4
//Input: [1,3,5,6], 0
//Output: 0


public class LeetCode35 {

    public static int searchInsert(int[] nums, int target) {

        int size = 0;

        if(nums==null){
            return size;
        }else if(target>nums[nums.length-1]) {
            size = nums.length;
        }else{
            for(int i=0;i<nums.length;i++) {
                if (target <= nums[i]) {
                    size = i;
                    break;
                }
            }
        }
         return size;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6};
        int i = searchInsert(array,5);
        System.out.printf(""+i);
    }



}
