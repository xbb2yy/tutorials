package com.xubingbing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class JsoupTest {

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.parse(new File("H:\\workspace\\tutorials\\CA\\src\\main\\resources\\t.html"), "utf-8");

        System.out.println(Helpers.getUrls(document).size());

    }
}
