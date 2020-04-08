package com.example.lib;


//
//示例：
//给定二叉树 [3,9,20,null,null,15,7]，
//
//         3
//        / \
//       9  20
//       /   \
//      15   7
//返回它的最大深度 3 。
public class LeetCode104 {
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
        LeetCode104.TreeNode left;
        LeetCode104.TreeNode right;
        TreeNode(int x) { val = x; }
    }




    //先对左子树递归求值，再对右子树递归求值，取最大然后加根
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right) +1 ;
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

        right.left = null;
        right.right = right_right;

        int deep = maxDepth(root);

        System.out.printf(""+deep);

    }

}
