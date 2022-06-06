package com.auto.crazyapi.untils;

import java.util.Scanner;

public class Test3 {


    public static String push(){
        System.out.println("请输入字符串：");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        return a;
    }

    public static char[] deal(String a){
                    char s[]=a.toCharArray();
                for (int m=0;m<s.length-1;m++){
                    for (int n=0;n< s.length-1-m;n++){

                        if(s[n]>s[n+1]){
                            char temp=s[n];
                            s[n]=s[n+1];
                            s[n+1]=temp;
                        }
                    }
                }
                return s;
    }

    public static void print(char s[]){
        for (int i=0;i<s.length;i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String ctn=new String("yes");

        while(ctn.toString().equals("yes")||ctn.toString().equals("YES")||ctn.toString().equals("Y")||ctn.toString().equals("y")){

            String a=push();//接收一个字符串

//            char s[]=a.toCharArray();
//                for (int m=0;m<s.length-1;m++){
//                    for (int n=0;n< s.length-1-m;n++){
//
//                        if(s[n]>s[n+1]){
//                            char temp=s[n];
//                            s[n]=s[n+1];
//                            s[n+1]=temp;
//                        }
//                    }
//                }
            char s[]= deal(a);//处理字符串
            print(s);

            System.out.println("是否继续？");
            Scanner sc1=new Scanner(System.in);
            ctn=sc1.nextLine();

        }
    }
}
