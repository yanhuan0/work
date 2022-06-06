package com.auto.crazyapi.untils;

import cn.hutool.core.util.EscapeUtil;
import jdk.nashorn.internal.ir.WhileNode;

import java.awt.*;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        //循环输入字符串，将这些输入的字符串都连接起来，至到输入的字符串为“Esc”就结束循环，最后显示连接起来的字符串
        String s = new String();
        StringBuilder s1 = new StringBuilder();

        do{System.out.println("请输入字符串：");
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();

            if (!s.equals("Esc")) {
                s1.append(s);
                System.out.println(s1);
            }

        }while(!s.toString().equals("Esc"));
        System.out.println("您输入的字符串为Esc,程序结束");
        System.out.println("字符串显示:" + s1);

        //while(Esc退出)

//        String s = new String();
//        StringBuilder s1 = new StringBuilder();
//
//        while (!s.toString().equals("Esc")) {
//
//            System.out.println("请输入字符串：");
//            Scanner sc = new Scanner(System.in);
//            s = sc.nextLine();
//
//            if (!s.equals("Esc")) {
//                s1.append(s);
//                System.out.println(s1);
//            }
//        }
//        System.out.println("您输入的字符串为Esc,程序结束");
//        System.out.println("字符串显示:" + s1);


        //do while循环
//        StringBuilder s = new StringBuilder();
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入字符串：");
//            String a = sc.nextLine();
//
//            if (a.equals("Esc")) {
//                System.out.println("您输入的字符串为Esc,程序结束.");
//                System.out.println("字符串显示:" + s);
//                break;
//            } else {
//                s.append(a);
//                System.out.println(s);
//            }
//        } while (true) ;

//while循环
//        StringBuilder s=new StringBuilder();
//        while(true){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入字符串：");
//        String a=sc.nextLine();
//
//        if(a.equals("Esc")){
//            System.out.println("您输入的字符串为Esc,程序结束.");
//            System.out.println("字符串显示:"+s);
//            break;
//        }else{
//
//            s.append(a);
//            System.out.println(s);
//        }
//
//        }

    }
}
