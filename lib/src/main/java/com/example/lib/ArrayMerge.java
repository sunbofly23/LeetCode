package com.example.lib;




import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//给两个非空数组，要求找到这两个数组里重复的元素，合并返回一个新的数组
//数组的去重 过滤
public class ArrayMerge {

    public static void main(String[] args) {
            int []a ={0,0,1,5,6,8,7};
            int []b ={0,2,7,5,8,9,11};

           int[] arr = arrayMerge(a,b);

           //数组去重方法一：有序不重复的哈希链表
        LinkedHashSet<Integer> temp = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            temp.add(arr[i]);
        }

        for(int i:temp){
            System.out.printf(""+i);
        }


          //数组去重方法二:Set集合的不重复
//        Set set = new HashSet<>();
//        for(int i=0;i<arr.length;i++){
//            set.add(arr[i]);
//        }
//        Object[] arr1 = set.toArray();
//        System.out.printf(Arrays.toString(arr1));


    }



    private static int[] arrayMerge(int a[],int b[]){
        int[] arr;
        if(a.length<=b.length){
            arr = new int[a.length];
            for(int i =0;i<a.length;i++){
                for(int j=0;j<b.length;j++){
                    if(a[i]==b[j]){
                        arr[i]=a[i];
                        break;
                    }
                }
            }

        }else{
             arr = new int[b.length];
            for(int i =0;i<b.length;i++){
                for(int j=0;j<a.length;j++){
                    if(b[i]==a[j]){
                        arr[i]=b[i];
                        break;
                    }
                }
            }

        }

        return arr;


    }

}
