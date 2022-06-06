package com.auto.crazyapi.untils;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {


        System.out.println("输入字符串：");
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        //定义字符串
//         String a = "abc123456defg";

         //转换成数组
        char s[] =a.toCharArray();//['a','b','c'.....'6'...]
//        for (int i=0;i<s.length;i++) {
//            System.out.print(s[i]);
//        }
        StringBuffer sb=new StringBuffer("yes");
        while(sb.toString().equals("yes")||sb.toString().equals("YES")||sb.toString().equals("Y")||sb.toString().equals("y")||sb.toString().equals("是")){

        }

        for (int m=0;m<s.length-1;m++){
            for (int n=0;n< s.length-1-m;n++){

               if(s[n]>s[n+1]){
                   char temp=s[n];
                   s[n]=s[n+1];
                   s[n+1]=temp;
               }
            }
        }

        for (int i=0;i<s.length;i++) {
            System.out.print(s[i]);
        }


         //字母和数字对比，如果数字在字母前，交换位置，


    }
}
