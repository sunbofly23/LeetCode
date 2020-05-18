package com.example.lib;


import java.util.Stack;

//树的深度优先遍历，使用栈实现
public class TreeDFS {

    public void DFS(LeetCode104.TreeNode root){
        Stack<LeetCode104.TreeNode> stack =  new Stack<>();

        stack.add(root);

        while (!stack.isEmpty()){

           LeetCode104.TreeNode treeNode =  stack.pop();

           //先右后左
            if(treeNode.right!=null)
                stack.add(treeNode.right);

            if(treeNode.left!=null)
                stack.add(treeNode.left);

        }

    }



}
