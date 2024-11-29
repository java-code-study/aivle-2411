package com.chap09;

import java.net.MalformedURLException;
import java.net.URL;

public class MalformedURLExceptionExample {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("htp://www.example.com");
            System.out.println("프로토콜 :" + url.getProtocol());
        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL 형식입니다." + e.getMessage());
        }
    }
}
