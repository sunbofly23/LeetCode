package com.example.lib;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//树的广度优先搜索，使用队列完成
public class TreeBFS {


    public void BFD(LeetCode104.TreeNode root){

        Queue<LeetCode104.TreeNode> queue = new LinkedList<>();


        queue.add(root);


        while (!queue.isEmpty()){
            LeetCode104.TreeNode node =  queue.remove();

            if(node.left!=null)
                queue.add(node.left);

            if(node.right!=null)
                queue.add(node.right);

        }

    }




}



