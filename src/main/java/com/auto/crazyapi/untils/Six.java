package com.auto.crazyapi.untils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Six {
//    当前有个系统：
//    要求输入今天日期(月/日都用两位数字表示）
//            要求输入客户生日(月/日都用两位数字表示）
//            判断是否是当天生日，如果是提示：生日快乐
//            并提示是否继续（y/n)
//    如果是重复以上步骤，否则退出程序

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        Date d=new Date();
        String str =sdf.format(d);
        System.out.println("今天日期："+str);
        //Scanner sc = new Scanner(System.in);
//        System.out.println("请输入今天日期：");
//        String a=sc.nextLine();
//        Date d =sdf.parse(a);

        String s = new String("y");
        while ( s.toString().equals("Y") || s.toString().equals("y") ) {
            System.out.println("请输入客户生日：");
            Scanner sc1=new Scanner(System.in);
            String b=sc1.nextLine();
            Date d1 =sdf.parse(b);

            if (str.equals(b)){
                System.out.println("生日快乐");
            }else{
                System.out.println("生日不快乐");
            }
            System.out.println("是否继续(y/n)：");
            Scanner sc2 = new Scanner(System.in);
            s=sc2.nextLine();
        }
        }
    }
