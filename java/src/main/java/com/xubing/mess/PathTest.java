package com.xubing.mess;

import java.net.URL;

public class PathTest {

    public static void main(String[] args) {
        URL url = PathTest.class.getResource("/");
        System.out.println(url.getPath());

        URL url1 = PathTest.class.getResource("");
        System.out.println(url1.getPath());
    }
}
