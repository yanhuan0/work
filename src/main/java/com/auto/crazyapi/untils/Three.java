package com.auto.crazyapi.untils;

public class Three {

    //循环输出1到100之间所有能被3或能被4整除的数
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i% 4 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}