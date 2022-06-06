package com.auto.crazyapi.untils;

public class Ten {

    public static void main(String[] args) {
        String a="*";

        StringBuilder s=new StringBuilder();

        for (int i=6;i>=0;i--){
            for (int n=6;n>i;n--){
                System.out.print(" ");
            }
            for (int j=0;j<(2*i+1);j++){
                s.append(a);
            System.out.print(a);
             }
            System.out.println();
        }
    }
}
