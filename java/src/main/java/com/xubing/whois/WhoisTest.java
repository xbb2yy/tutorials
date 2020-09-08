package com.xubing.whois;

import org.apache.commons.net.whois.WhoisClient;
import org.junit.Test;

import java.io.IOException;

public class WhoisTest {

    @Test
    public void test() {
        WhoisClient client = new WhoisClient();
        try {
            client.connect("whois.crsnic.net");
            System.out.println(client.query("3421.com"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
