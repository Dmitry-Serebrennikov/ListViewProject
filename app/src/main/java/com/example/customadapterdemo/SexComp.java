package com.example.customadapterdemo;

import java.util.Comparator;

public class SexComp implements Comparator<User> {
    private Integer cmp(User u) {
        int imp = 0;
        if (u.getSex() == Sex.MAN) {
            imp = 2;
            return imp;
        }
        else if (u.getSex() == Sex.WOMAN){
            imp = 1;
        }
        else
            imp = 0;
        return imp;
    }
    @Override
    public int compare(User u1, User u2) {
        return cmp(u1).compareTo(cmp(u2));
    }
}
