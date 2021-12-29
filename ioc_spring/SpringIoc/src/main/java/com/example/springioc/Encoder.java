package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Base64;

public class Encoder {
    private IEncoder iEncoder;

    public Encoder(@Qualifier("base74Enocder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder=iEncoder;
    }

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
