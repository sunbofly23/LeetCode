package com.example.lib;


import java.util.List;

//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次
//输入: 1->1->2
//输出: 1->2
//输入: 1->1->2->3->3
//输出: 1->2->3
public class LeetCode80 {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        ListNode result = deleteDuplicates(node0);

        System.out.printf(result.val + "");

        while (result.next != null) {
            result = result.next;
            System.out.printf(result.val + "");
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

}
