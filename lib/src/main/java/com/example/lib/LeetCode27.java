package com.example.lib;


//Given nums = [0,1,2,2,3,0,4,2], val = 2,
//Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
//Note that the order of those five elements can be arbitrary.
//It doesn't matter what values are set beyond the returned length.

public class LeetCode27 {

    public static int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int length = removeElement(nums,0);
        for(int i=0;i<length;i++){
            System.out.printf("nums["+i+"]="+nums[i]+"\n");
        }
    }
}
