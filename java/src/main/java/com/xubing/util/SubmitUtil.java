package com.xubing.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class SubmitUtil {

    public static boolean submitLink(String url) throws Exception {

        StringEntity entity = new StringEntity(url, ContentType.create("text/plain", "UTF-8"));
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://data.zz.baidu.com/urls?site=www.166157.com&token=pbwFE2XGFXwMgLBI");
        post.setEntity(entity);
        CloseableHttpResponse response = httpclient.execute(post);
        System.out.println(EntityUtils.toString(response.getEntity()));

        return true;
    }

    public static void main(String[] args) throws Exception {
        submitLink("https://www.166157.com/java/java%E4%B8%AD%E5%A6%82%E4%BD%95%E5%88%A4%E6%96%AD%E4%B8%80%E4%B8%AAstring%E6%98%AF%E4%B8%8D%E6%98%AF%E4%BB%A3%E8%A1%A8%E4%B8%80%E4%B8%AA%E6%95%B0%E5%AD%97%E7%9A%84%E6%9C%80%E4%BD%B3%E6%96%B9%E5%BC%8F/");
    }
}
