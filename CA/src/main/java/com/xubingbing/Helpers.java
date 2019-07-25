package com.xubingbing;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class Helpers {

    public static void validateURL(String url) {
        if (url.startsWith("www.") || url.startsWith("instagram.com")) {
            throw new IllegalArgumentException("URL must start with https://");
        }

        if (!(url.startsWith("https://") || url.startsWith("http://"))) {
            throw new IllegalArgumentException("Invalid instagram URL");
        }

        if (!url.contains("instagram.com/p/") && !url.contains("instagram.com/tv/")) {
            throw new IllegalArgumentException("Invalid instagram URL");
        }

        if (url.length() <= 0) {
            throw new IllegalArgumentException("URL parameter cannot be empty");
        }

    }

    public static String mediaType(String fileName) {
        if (fileName.endsWith(".mp4")) {
            return "video";
        } else if (fileName.endsWith(".png") || fileName.endsWith(".jpg")) {
            return "image";
        } else {
            return "media type not found";
        }
    }

    public static List<String> getUrls(Document document) {

        Elements script = document.getElementsByTag("script");
        List<String> list = new ArrayList<>();

        for (Element element : script) {
            if (element.data().startsWith("window._sharedData")) {
                String s = element.data().replaceAll("window._sharedData =", "");
                String json = new StringBuilder(s).deleteCharAt(s.length() - 1).toString();
                System.out.println(json);
                JSONArray jsonArray = JSON.parseObject(json).getJSONObject("entry_data").getJSONArray("PostPage")
                        .getJSONObject(0).getJSONObject("graphql").getJSONObject("shortcode_media")
                        .getJSONObject("edge_sidecar_to_children").getJSONArray("edges");

                for (int i = 0; i < jsonArray.size(); i++) {
                    String string = jsonArray.getJSONObject(i).getJSONObject("node").getString("display_url");
                    list.add(string);
                }

            }
        }
        return list;
    }

}