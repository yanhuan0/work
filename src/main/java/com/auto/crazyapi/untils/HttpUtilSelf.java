package com.auto.crazyapi.untils;

import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.util.Map;

public class HttpUtilSelf {
    public static String getQueryParam(Map<String,String> params){
        String s ="?";
        StringBuffer sb = new StringBuffer(s);
        for (Map.Entry<String,String> entry:params.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
            sb.append(entry.getKey()+"="+entry.getValue());
        }
        return sb.toString();

    }

}
