package com.example.lib;

import java.util.ArrayList;

import javax.xml.stream.events.Characters;

public class LeetCode234 {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

    public static boolean isPalindrome(ListNode head) {

        ListNode cur;

        cur = head;


        ArrayList<Integer>list = new ArrayList<>();



         while (cur!=null){
             list.add(cur.val);
             cur = cur.next;
         }


          int pre = 0;
          int last = list.size()-1;


          while (pre<last){
              if(!list.get(pre).equals(list.get(last)))
                  return false;
               pre++;
               last--;
          }


          return true;
    }

    public static void main(String[] args) {
          ListNode head = new ListNode(-12);
          ListNode node1 = new ListNode(-129);
          ListNode node2 = new ListNode(-129);
          ListNode node3 = new ListNode(12);
          head.next  = node1;
          node1.next =node2;
          node2.next = node3;
          node3.next = null;

        boolean ispalindrome =   isPalindrome(head);

        System.out.printf(""+ispalindrome);

    }

}
