package com.example.customadapterdemo;

import java.util.Comparator;

public class NameComp implements Comparator<User> {
    @Override
    public int compare(User u1, User u2){
        return u1.getName().compareTo(u2.getName());
    }
}