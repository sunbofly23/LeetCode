package com.example.lib;


//青蛙上台阶问题。可以上1层，也可以上2层，问一百节台阶有多少上法。

public class Jump100Ladder {

    public static void main(String[] args) {

       int programme =  jump(100);
        System.out.printf("一共有"+programme+"方案");
    }


    public  static int jump(int n){
        System.out.printf("当前"+n+"\n");
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return jump(n-1)+(n-2);
    }




}
