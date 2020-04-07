package com.example.lib;



//给定一个二叉树，检查它是否是镜像对称的。
//
//例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3

import sun.reflect.generics.tree.Tree;

public class LeetCode101 {
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
          TreeNode(int x) { val = x; }
      }

      //左树的左孩子和右树的右孩子，左树的右孩子和右树的左孩子相等，则对称

    public static boolean isSymmetric(TreeNode root) {
          return LeftAndRightTreeisSymmetric(root,root);
    }

    public static boolean LeftAndRightTreeisSymmetric(TreeNode q,TreeNode p){
          if(q==null&&p==null)
              return true;
          if(q==null||p==null)
              return false;
          if(q.val==p.val){
              return LeftAndRightTreeisSymmetric(q.left,p.right)&&LeftAndRightTreeisSymmetric(q.right,p.left);
          }

        return false;
    }



    public static void main(String[] args) {


          TreeNode root = new TreeNode(1);

          TreeNode left1 = new TreeNode(2);
          TreeNode right1 = new TreeNode(2);

          TreeNode left_left12 = new TreeNode(3);
          TreeNode left_right12 = new TreeNode(4);

          TreeNode right_left12 = new TreeNode(4);
          TreeNode right_right12 = new TreeNode(3);


          root.left = left1;
          root.right = right1;

          left1.left = left_left12;
          left1.right = left_right12;

          right1.left = right_left12;
          right1.right = right_right12;


         boolean symmetric = isSymmetric(root);

        System.out.printf(""+symmetric);

    }

}
