package com.auto.crazyapi.untils;

public class One {
    //九九乘法表

    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){

                int b=j*i;

                System.out.print(j+"*"+i + "=" + b +" ");

            }
            System.out.println();

        }
    }

}
