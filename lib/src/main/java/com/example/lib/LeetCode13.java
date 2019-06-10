package com.example.lib;


/**
 *
Symbol       Value
 I             1
 V             5
 X             10
 L             50
 C             100
 D             500
 M             1000

 Input: "III"
 Output: 3


 Input: "IX"
 Output: 9


 Input: "LVIII"
 Output: 58
 Explanation: L = 50, V= 5, III = 3.

 */

public class LeetCode13 {
    public  static int RomanToInt(String s){
      String S = s.toUpperCase();
      char[] array = S.toCharArray();
      int len  = array.length;
      int [] arr = new int[len];
      int result = 0;

      for(int i=0;i<len;i++){
          switch (array[i]){
              case 'I':
                  arr[i]=1;
                  break;
              case 'V':
                  arr[i]=5;
                  break;
              case 'X':
                  arr[i]=10;
                  break;
              case 'L':
                  arr[i]=50;
                  break;
              case 'C':
                  arr[i]=100;
                  break;
              case  'D':
                  arr[i]=500;
                  break;
              case  'M':
                  arr[i]=1000;
                  break;
              default:
                      break;
          }
      }

       for(int j = 0;j<len-1;j++){
          if(arr[j]<arr[j+1]){
              result-=arr[j];
          }else {
              result += arr[j];
          }
       }
         result+=arr[len-1];
        return result;
    }

    public static void main(String[] args) {
        System.out.printf(RomanToInt("VXXX")+"");
    }



}
