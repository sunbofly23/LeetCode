package com.example.lib;

/**
 * Create by bo.sun on 2019/6/11.
 */

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
input 1-2-4 , 1-3-4
output 1-1-2-3-4-4
 */

public class LeetCode21 {

public static LinkNode mergeTwoLists(LinkNode l1,LinkNode l2){
    if(l1==null)
        return l2;
    if(l2==null)
        return l1;
    if(l1.val<l2.val){
        l1.next = mergeTwoLists(l1.next,l2);
        return l1;
    }else{
        l2.next = mergeTwoLists(l1,l2.next);
        return l2;
    }
}

public static class LinkNode{
    int val;
    LinkNode next;
     public LinkNode(int x) {
         this.val = x;
     }
 }

    public static void main(String[] args) {

        LinkNode h1 = new LinkNode(1);
        LinkNode l2 = new LinkNode(2);
        LinkNode l3  = new LinkNode(3);
        h1.next = l2;
        l2.next = l3;
        l3.next = null;

        LinkNode h2 = new LinkNode(1);
        LinkNode l5 = new LinkNode(3);
        LinkNode l6  = new LinkNode(4);
        h2.next = l5;
        l5.next = l6;
        l6.next = null;

       LinkNode result =  mergeTwoLists(h1,h2);
       while (result!=null){
           System.out.printf(result.val+"");
           result = result.next;
       }

    }


}
