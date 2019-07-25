package com.xubingbing;

import org.apache.http.HttpHost;
import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.*;
import org.brunocvcunha.instagram4j.requests.payload.*;
import org.jsoup.nodes.Document;

import java.io.File;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws Exception {


        String proxyHost = "127.0.0.1";
        String proxyPort = "1080";
        System.setProperty("http.proxyHost", proxyHost);
        System.setProperty("http.proxyPort", proxyPort);
// 对https也开启代理
        System.setProperty("https.proxyHost", proxyHost);
        System.setProperty("https.proxyPort", proxyPort);
        String instaImage = "https://www.instagram.com/p/B0LRw_zDsVo/";
        String instaVideo = "https://www.instagram.com/p/BtT2UomAH9l/";
        String directory = "./";

        InstagramDownloader instagram = new InstagramDownloader();

        String s = instagram.downloadImage(instaImage, directory);
        File file = new File(s);
        System.out.println(file.exists());
        System.out.println(s);

    }


}
