package com.example.lib;


//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 num1 成为一个有序数组。
//说明:
//初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
//你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
public class LeetCode88 {

    public static void main(String[] args) {
        int[]num1 = {1,2,3,0,0,0};
        int[]num2 = {2,5,6};
        int []result =merge(num1,num1.length,num2,num2.length);
        for(int i:result){
            System.out.printf(i+",");
        }
    }


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i =0;i<n;i++){
            nums1[m-n+i] = nums2[i];
        }

        int temp;

        for (int j = 0; j < m; j++) {
            for (int k = j + 1; k < m; k++) {
                if (nums1[j] >= nums1[k]) {
                    temp = nums1[k];
                    nums1[k] = nums1[j];
                    nums1[j] = temp;
                }
            }

        }

        return nums1;

    }
}
