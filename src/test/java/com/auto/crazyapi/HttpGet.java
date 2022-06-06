package com.auto.crazyapi;

import com.sun.deploy.net.HttpResponse;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HttpGet {

    CloseableHttpClient client; //创建一个客户端对象
    HttpGet httpGet;
    HttpPost httpPost;
    CloseableHttpResponse response;


    @BeforeClass
    public void initClient(){
        client = HttpClients.createDefault(); //client对象初始化
    }

    @Test
    public void httpGetTest() throws IOException {
//        httpGet =new HttpGet("http://127.0.0.1");
//        response = client.execute(httpGet);
        System.out.println(response.getStatusLine());//这个是http响应的版本和响应状态码
        System.out.println(response.getStatusLine().getStatusCode());//响应状态码
        Assert.assertEquals(response.getStatusLine().getStatusCode(),200);
        String resBody =EntityUtils.toString(response.getEntity());//响应的body
        System.out.println(resBody);
        Assert.assertEquals(resBody.contains("\"code\":\"0\""),true);

    }
    @Test
    public void httpPost() throws Exception{
        httpPost=new HttpPost("http://127.0.0.1/api/sign");
        BasicNameValuePair username = new BasicNameValuePair("username", "sz_000001");//参数
        BasicNameValuePair password=new BasicNameValuePair("password","111111");//参数
        BasicNameValuePair action=new BasicNameValuePair("action","signin");
        List<BasicNameValuePair> params=new ArrayList<BasicNameValuePair>();//参数集合对象
        params.add(username);
        params.add(password);
        params.add(action);
        StringEntity entity= new UrlEncodedFormEntity(params);//将参数集合对象转换成httpEntity对象
        httpPost.setEntity(entity);//设置 post的Entity
        response =client.execute(httpPost);//发起请求
        System.out.println(response.getStatusLine());//这个是http响应的版本和响应状态码
        System.out.println(response.getStatusLine().getStatusCode());//响应状态码
        Assert.assertEquals(response.getStatusLine().getStatusCode(),200);
        String resBody =EntityUtils.toString(response.getEntity());//响应的body
        System.out.println("post"+resBody);
        Assert.assertEquals(resBody.contains("\"message\":\"success\""),true);
    }

    @Test
    public void upload() throws Exception {
        httpPost=new HttpPost("http://127.0.0.1");
        FileBody fileBody=new FileBody(new File("C:\\Users\\user\\Desktop\\json.txt"));
        HttpEntity httpEntity= MultipartEntityBuilder.create().addPart("file",fileBody).build();
        httpPost.setEntity(httpEntity);//设置 post的Entity
        httpPost.addHeader("Comtent-Type","multipart/form-data");
        response =client.execute(httpPost);//发起请求
        System.out.println(response.getStatusLine());//这个是http响应的版本和响应状态码
        System.out.println(response.getStatusLine().getStatusCode());//响应状态码
        Assert.assertEquals(response.getStatusLine().getStatusCode(),200);
        String resBody = EntityUtils.toString(response.getEntity());//响应的body
        System.out.println("post"+resBody);
        Assert.assertEquals(resBody.contains("\"massage\":\"上传成功\""),true);
    }

    @Test
    public void download() throws Exception {
//        httpGet=new HttpGet("");
//        response = client.execute(httpGet);
        System.out.println(response.getStatusLine());//这个是http响应的版本和响应状态码
        System.out.println(response.getStatusLine().getStatusCode());//响应状态码
        Assert.assertEquals(response.getStatusLine().getStatusCode(),200);
        String resBody =EntityUtils.toString(response.getEntity());//返回文件内容
        System.out.println(resBody);
//        Assert.assertEquals(resBody.contains("\"code\":\"0\""),true);
    }

    @Test
    public void login() throws Exception {
        httpPost = new HttpPost("http://127.0.0.1/api/sign");
        String json="{\"username\":\"sz_000001\",\"password\":\"111111\",\"action\":\"signin\"}";
        StringEntity entity=new StringEntity(json,"UTF-8");
        httpPost.setEntity(entity);
        httpPost.addHeader("Content-Type","application/json");
        response = client.execute(httpPost);
        System.out.println(response.getStatusLine());//这个是http响应的版本和响应状态码
        System.out.println(response.getStatusLine().getStatusCode());//响应状态码
        Assert.assertEquals(response.getStatusLine().getStatusCode(),200);
        String resBody =EntityUtils.toString(response.getEntity());//响应的body
        System.out.println("post"+resBody);
//        Assert.assertEquals(resBody.contains("登录成功"),true);

    }
    @Test
    public void sentXML() throws Exception {
        httpPost=new HttpPost("https://www.ip138.com/mobile.asp?mobile=15210999577&action=mobile");
        String xml="xml格式信息";
        httpPost.addHeader("Content-Type","text/xml;charset=utf-8");
//        Header[] headers = httpPost.getAllHeaders();
//        for (Header h:headers){
//            System.out.println(h.toString());
//        }
        StringEntity xmlEntity=new StringEntity(xml,"UTF-8");
        httpPost.setEntity(xmlEntity);
        response=client.execute(httpPost);
        System.out.println(response.getStatusLine());//这个是http响应的版本和响应状态码
        System.out.println(response.getStatusLine().getStatusCode());//响应状态码
        Assert.assertEquals(response.getStatusLine().getStatusCode(),200);
        String resBody =EntityUtils.toString(response.getEntity());//响应的body
        System.out.println("post"+resBody);
        Assert.assertEquals(resBody.contains("返回值包含内容"),true);
    }

    @Test
    public void httpsTest() throws IOException {
        httpPost=new HttpPost("https://127.0.0.1");
        response=client.execute(httpPost);
        System.out.println(response.getStatusLine());//这个是http响应的版本和响应状态码
        System.out.println(response.getStatusLine().getStatusCode());//响应状态码
        Assert.assertEquals(response.getStatusLine().getStatusCode(),200);
        String resBody =EntityUtils.toString(response.getEntity());//响应的body
        System.out.println("post"+resBody);
    }

}
