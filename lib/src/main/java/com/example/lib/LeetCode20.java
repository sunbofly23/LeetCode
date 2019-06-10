package com.example.lib;

import java.util.HashMap;
import java.util.Stack;

/**
 * Create by bo.sun on 2019/6/10.
 */

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.请注意，空字符串也是有效的
* Input: "()[]{}"
  Output: true
  Input: "(]"
  Output: false
  Input: "([)]"
  Output: false
* */

public class LeetCode20 {

    private    HashMap<Character,Character> map;

    public LeetCode20() {
        this.map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
    }

    public  boolean  isValid(String s){
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                char mTopElement = stack.isEmpty() ? '#': stack.pop();
                if(mTopElement != map.get(c))
                    return false;
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        LeetCode20 test = new LeetCode20();
        boolean result = test.isValid("()[]{}");
        System.out.printf(result+"");
    }

}
