package com.auto.crazyapi.untils;

import java.util.Random;

public class Nine {
//    计算机随机生成[5,13]之间的随机数，如果这个数是奇数则提示“生成了一直公猪”，如果这个数是偶数则提示“生成了一只母猪”

    public static int START=5;
    public static int END=13;
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(END - START + 1)+START;
        System.out.println(number);

        if (number%2==1){
            System.out.println("郭智欣是一只公猪");
        }else{
            System.out.println("郭智欣是一只母猪");
        }

    }
}
