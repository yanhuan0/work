package com.auto.crazyapi.untils;

import cn.hutool.json.JSONUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dd1 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        Date d = new Date();
        String str=sdf.format(d);
        System.out.println(str);
    }

}
