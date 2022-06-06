package com.auto.crazyapi.untils;

import com.sun.deploy.net.HttpUtils;
import org.apache.commons.httpclient.HttpClient;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;

public class CrazyHttpClient {
    private static final String HTTP="http";
    private static final String HTTPS="https";
    private static SSLConnectionSocketFactory sslsf =null;
    private static PoolingHttpClientConnectionManager cm =null;
    private static SSLContextBuilder builder=null;
    private static CloseableHttpClient client;
    private static HttpGet httpGet;
    private static HttpPost httpPost;

    //使用的静态代码块，优势：随着当前类加载而加载的，这部分是最先执行。
    static {
            //创建SSL对象
        try {
            builder = new SSLContextBuilder();
            //全部信任不做身份鉴定
            builder.loadTrustMaterial(null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                    return false;
                }
            });
            //对象里信任多种("SSLv2Hello","SSLv3","TLSv1","TLSv1.2")https协议的规责
            sslsf = new SSLConnectionSocketFactory(builder.build(),
                    new String[]{"SSLv2Hello","SSLv3","TLSv1","TLSv1.2"},null, NoopHostnameVerifier.INSTANCE);
            //把它们注册到http、https中去
            Registry<ConnectionSocketFactory> registry=RegistryBuilder.<ConnectionSocketFactory>create()
                    .register(HTTP,new PlainConnectionSocketFactory()).register(HTTPS,sslsf).build();
            cm = new PoolingHttpClientConnectionManager(registry);
            cm.setMaxTotal(200); //max connection
            client = HttpClients.custom().setSSLSocketFactory(sslsf).setConnectionManager(cm)
                    .setConnectionManagerShared(true).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装几种请求
//    public static String sendGet(String url, Map<String,String> headers,Map<String,String> params) throws Exception {
//        String queryParam = HttpUtilSelf.getQueryParam(params);//HttpUtil.getQueryParam(params);
//
//        HttpGet httpGet=new HttpGet(url+queryParam);
//        if (!headers.isEmpty()){
//            for (Map.Entry<String,String>entry: headers.entrySet()){
//                httpGet.addHeader(entry.getKey(),entry.getValue());
//            }
//        }
//        HttpResponse response=client.execute(httpGet);
//        return EntityUtils.toString(response.getEntity());
//    }
//    public static String sendGet(String url, Map<String,String> headers,Map<String,String> params) throws Exception {
//        UrlEncodedFormEntity formEntity=HttpUtilSelf.getFormEntity(params);
//        HttpPost httpPost=new HttpPost(url);
//        if (!headers.isEmpty()){
//            for (Map.Entry<String,String>entry: headers.entrySet()){
//                httpPost.addHeader(entry.getKey(),entry.getValue());
//            }
//        }
//        HttpResponse response=client.execute(httpPost);
//        return EntityUtils.toString(response.getEntity());
//    }

}
