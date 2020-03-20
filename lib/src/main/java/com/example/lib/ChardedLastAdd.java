package com.example.lib;




//字符串去重末位加上重复的数
//比如"aaabbcdddd" 返回 a3b2c1d4

//思路就是前后比较字符，用StringBuilder的固定位置插入字符更高效

public class ChardedLastAdd {

    public static void main(String[] args) {
        String str = "aaabvvddd";
        System.out.printf(chardedLast(str));
    }

    private static String chardedLast(String str){

        if(str==null||str.isEmpty()){
            return "不可以输入空串";
        }
        int count = 1;
        StringBuilder stringBuilder  = new StringBuilder(str);
        for(int i=0;i<stringBuilder.length();i++){
            System.out.printf(i+""+stringBuilder.length()+""+stringBuilder.charAt(i)+"\n");
            //末位判斷
            if(i+1==stringBuilder.length()){
                stringBuilder.append(count);
                break;
            }else{//前后比较
                if(stringBuilder.charAt(i)==stringBuilder.charAt(i+1)){
                    count++;
                }else{
                    stringBuilder.insert(i+1,count+"");
                    //重置count
                    count = 1;
                    //跳过count字符
                    i++;
                }
            }
        }

        return stringBuilder.toString();
    }


}
