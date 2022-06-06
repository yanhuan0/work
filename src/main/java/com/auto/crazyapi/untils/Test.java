package com.auto.crazyapi.untils;

import java.util.Scanner;

//生成一个随机数
//键盘输入获取以猜得数
//判断我猜得随机数等于、小于还是大于
//加个循环，如果等于退出，如果大于或小于，循环5次退出
public class Test {

    public void method1() {
        int i = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println(i);
        for (int j = 0; j < 5; j++) {
            System.out.println("请输入你猜的随机数：");
            int guessnum = sc.nextInt();

            if (guessnum < i) {
                System.out.println("你猜的数小于随机数");
            } else if (guessnum > i) {
                System.out.println("你猜的数小于随机数");
            } else if (guessnum == i) {
                System.out.println("你猜对了，退出吧");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int i = (int) (Math.random() * 100);
        System.out.println(i);
        int j=0;
        while (j<5) {
            j++;
            System.out.println(j);
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你猜的数");
            int guessnum=sc.nextInt();
            if (guessnum<i){
                System.out.println("小了");
            }
            else if(guessnum>i){
                System.out.println("大了");
            }
            else{
                System.out.println("对了，退吧");
                break;
            }
        }
    }
}





