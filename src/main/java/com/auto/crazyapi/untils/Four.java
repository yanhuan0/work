package com.auto.crazyapi.untils;

public class Four {
    //循环输出200到300之间所有能被5整除，或能被2整除并且能被3整除的数
    public static void main(String[] args) {
        for (int i=200;i<=300;i++){
            if (i%5==0 || (i%2==0&&i%3==0)){
                System.out.println(i);
            }
        }
    }
}
