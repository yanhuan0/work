package com.auto.crazyapi;


import com.auto.crazyapi.untils.CrazyHttpClient;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HttpTests {
    @Test
    public void test1(){
        Map<String,String> params=new HashMap<String, String>();
        params.put("_","1650457997522");
//        String response = CrazyHttpClient.sendGet("hhttps://127.0.0.1/adminapi/get-global-config",new HashMap<String, String>(),params);
//        System.out.println(response);
    }

}
