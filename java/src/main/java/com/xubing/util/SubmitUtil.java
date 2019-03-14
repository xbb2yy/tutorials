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
        submitLink("https://www.166157.com/java8/java-8-stream-skip/");
    }
}
