package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public User(){
        this.name = null;
        this.age =0;
    }

    public User DefaultUser(){
        return new User("default",0,"010-111-2222");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age, String phoneNumber){
        this.name=name;
        this.age = age;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
