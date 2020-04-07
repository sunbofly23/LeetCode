package com.example.lib;

//给定两个二叉树，编写一个函数来检验它们是否相同。
//
//如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

//输入:     1         1
//        / \       / \
//       2   3     2   3
//
//        [1,2,3],   [1,2,3]
//        输出: true

public class LeetCode100 {

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

      //递归解法
      public static boolean isSameTree(TreeNode p, TreeNode q) {

          if (p == null && q == null)
              return true;
          if (p == null || q == null)
              return false;
          if (p.val == q.val)
              return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

          return false;
      }

    public static void main(String[] args) {

//        不相等例子:
        //树1
        TreeNode root = new TreeNode(1);
        root.left =new TreeNode(2);
        root.left = new TreeNode(3);
        //树2
        TreeNode root2 = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root2.left=left;
        root2.right =null;
        left.left = null;
        left.right = right;

//        相等例子:
          //树1
//        TreeNode root = new TreeNode(1);
//        root.left =new TreeNode(2);
//        root.left = new TreeNode(3);
//        //树2
//        TreeNode root2 = new TreeNode(1);
//        root2.left = new TreeNode(2);
//        root2.right = new TreeNode(3);

        boolean identical = isSameTree(root,root2);

        System.out.printf("这两棵树是否相等"+identical);

    }

}
