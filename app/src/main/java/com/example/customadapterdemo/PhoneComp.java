package com.example.customadapterdemo;

import java.util.Comparator;

public class PhoneComp implements Comparator<User> {

    @Override
    public int compare(User u1, User u2){
        return u1.getPhone().compareTo(u2.getPhone());
    }
}

