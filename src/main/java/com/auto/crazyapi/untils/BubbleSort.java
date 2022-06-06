package com.auto.crazyapi.untils;

import java.util.Scanner;

/**
 * 冒泡排序：
 * abc123def --->   123abcdef
 */
public class BubbleSort {

     public  static void print(char[] c){
         System.out.println("转换结果：");
         for(int i =0 ;i <c.length;i++){
             System.out.print(c[i]);
         }
         System.out.println();
     }

     public static String iput(){
         System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String ipt = sc.nextLine();
        return ipt;
     }
    public static void main(String[] args) {
//         StringBuffer conti = new StringBuffer("yes");
        String conti = new String("yes");

         while (conti.toString().equals("是")||conti.toString().equals("yes")||conti.toString().equals("YES")||conti.toString().equals("y")||conti.toString().equals("Y")){
             String input = iput();
             char[] c = input.toCharArray();
             char tmp ;

             for(int i =0 ;i< c.length-1 ;i++){
                 for(int j = 0; j< c.length-1-i ; j++){
                     char left = c[j];
                     char  right = c[j+1];
                     if(left > right){
                         tmp = c[j];
                         c[j] = c[j+1];
                         c[j+1] = tmp;
                     }
                 }
             }
             print(c);

             System.out.println("是否继续？");
             Scanner sc = new Scanner(System.in);
//             conti = new StringBuffer(sc.nextLine());
             conti = sc.nextLine();
         }

    }
}
