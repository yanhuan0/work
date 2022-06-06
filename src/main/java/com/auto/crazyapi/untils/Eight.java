package com.auto.crazyapi.untils;

import java.util.Scanner;

public class Eight {
    //    来做个石头剪子布的小游戏：
//    当前系统0表示石头，1表示剪刀，2表示布
//    每个回合系统生成一个随机数（0或者1或者2）
//    用户输入0或者1或者2
//    并判定输赢并提示（你输了/你赢了/平手）
    public static void main(String[] args) {

        String s = new String("yes");
        while (s.equals("yes") || s.equals("YES") || s.equals("Y") || s.equals("y") || s.equals("是")) {
            int a = (int) (Math.random() * 3);
            System.out.println("系统随机数：" + a);

            System.out.println("用户输入0或者1或者2：");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();

            if(b>2){
                System.out.println("输入有误");
            }else if (b > a) {
                System.out.println("你赢了");
            } else if (b < a) {
                System.out.println("你输了");
            } else {
                System.out.println("平手");
            }
            System.out.println("是否继续");
                Scanner sc1 = new Scanner(System.in);
                s = sc1.nextLine();
            }
        }
    }
