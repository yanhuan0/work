package com.auto.crazyapi.untils;

import java.util.Date;

public class Test4 {
    //创建日期对象
    public static void main(String[] args) {
//        Date d1=new Date();
//        System.out.println("当前时间："+d1);
//
//        Date d2=new Date(5000);
//        System.out.println("1970年1月1日 早上8点0分0秒 开始经历了5s的时间");
//        System.out.println(d2);

        //getTime
//        Date now=new Date();
//        System.out.println("当前时间："+now.toString());
//
//        System.out.println("当前时间getTime()返回的值是"+now.getTime());
//
//        Date zero=new Date(0);
//        System.out.println("用0作为构造方法，得到的日期是"+zero);

        //System.currentTimeMillis()  当前日期的毫秒数
        Date now=new Date();
        //当前日期毫秒数
        System.out.println("Date.getTime() \t\t\t返回值: "+now.getTime());

        //通过System.currentTimeMillis()获取当前日期的毫秒数
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());
    }

}
