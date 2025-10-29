package com.example.Demo.onTap.phan1;

public class StringManipulator {
    public static String manipulate(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new NullPointerException();
        }
        return s1 + s2;
    }
}
