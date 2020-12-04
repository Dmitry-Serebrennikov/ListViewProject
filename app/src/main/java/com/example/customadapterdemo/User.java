package com.example.customadapterdemo;

public class User {
    String name, phone;
    Sex sex;
    String gender;

    public User(String name, String phoneNumber, Sex sex) {
        this.name = name;
        this.phone = phoneNumber;
        this.sex = sex;
    }
    String getName(){return name;}
    String getPhone(){return phone;}
    Sex getSex(){return sex;}
}
