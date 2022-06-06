package com.auto.crazyapi.untils;

import java.util.Scanner;

public class Two {

    //模拟用户登录，如果用户名和密码正确，则登录成功，否则登录失败

    public static String input(){
        String username = "admin";
        String password = "123456";

        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("请输入密码：");
        String s2 = sc.nextLine();

        if (s1.equals(username) && s2.equals(password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名密码错误");
        }
        return s1;
    }


    public static void main(String[] args) {


        String s = new String("yes");

        while (s.toString().equals("yes")||s.toString().equals("YES")||s.toString().equals("Y")||s.toString().equals("y")||s.toString().equals("是")) {

            String ipt=input();

            System.out.println("是否继续？");
            Scanner sc=new Scanner(System.in);
            s=sc.nextLine();
        }
    }
}