package com.example.lib;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by Android Studio.
 * User: Sunbo
 * Date: 2019/11/4
 * Time: 15:28
 */


/*
删除排序数组中的重复项

* 给定 nums = [0,0,1,1,1,2,2,3,3,4],
函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
你不需要考虑数组中超出新长度后面的元素。
*
* */

public class LeetCode26 {

    /*用快慢指针*/

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int cur = 0;

        for (int pre = 0; pre < nums.length; pre++) {
            if (nums[cur] != nums[pre]) {
                cur++;
                nums[cur] = nums[pre];
            }
        }

        return ++cur;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int len = removeDuplicates(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[" + i + "]=" + arr[i] + "\n");
        }

        System.out.printf("arr.length =" + len);
    }

}
