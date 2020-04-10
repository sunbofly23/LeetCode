package com.example.lib;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
//        例如：
//        给定二叉树 [3,9,20,null,null,15,7],
//
//         3
//        / \
//       9  20
//       /  \
//      15   7
//
//        [
//        [15,7],
//        [9,20],
//        [3]
//        ]
public class LeetCode107 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static List<List<Integer>> items = new ArrayList<List<Integer>>();

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        orderBottom(root,0);

        Collections.reverse(items);
        return items;
    }



    public static void orderBottom(TreeNode root,int step) {

        if(root==null)
            return ;

        if(items.size()<=step)
            items.add(new ArrayList<>());

        orderBottom(root.left,step+1);
        orderBottom(root.right,step+1);

        items.get(step).add(root.val);


    }




    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);

        TreeNode left_left = new TreeNode(15);
        TreeNode right_right = new TreeNode(7);


        root.left = left;
        root.right = right;

        left.left = left_left ;
        left.right = null;

        right.left = right_right;
        right.right = null ;

        List<List<Integer>> lists = levelOrderBottom(root);




        System.out.printf(""+ lists);


    }




}
