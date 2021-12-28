package com.company.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=106&size=206&name=spring-boot";

        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);
    }
}
