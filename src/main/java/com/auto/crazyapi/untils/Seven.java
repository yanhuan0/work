package com.auto.crazyapi.untils;

import java.util.Scanner;

//循环输入大于0的数字进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果
public class Seven {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        int b = 0;
        while(true){
            System.out.println("请输入大于0的数字：");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();


            if(a==0){
                System.out.println("您输入的数字为0，结束循环");
                break;
            }else if (a>0){
                b+=a;
                System.out.println(b);
            }else{
                System.out.println("输入错误");
            }

        }
    }
}
