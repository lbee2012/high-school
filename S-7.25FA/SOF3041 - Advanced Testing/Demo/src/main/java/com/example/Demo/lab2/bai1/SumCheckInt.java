package com.example.Demo.lab2.bai1;

public class SumCheckInt {
    public Integer sum(String stra, String strb) {
        int inta = Integer.parseInt(stra);
        int intb = Integer.parseInt(strb);
        int sum = 0;

        if (inta % 1 == 0) {
            System.out.println("a la so nguyen");
            if (intb % 1 == 0) {
                System.out.println("b la so nguyen");
                if (inta >= 4 && inta <= 10) {
                    System.out.println("a hop le trong khoang 4-10");
                    if (intb >= 4 && intb <= 10) {
                        System.out.println("b hop le trong khoang 4-10");
                        sum = inta + intb;
                        return sum;
                    } else {
                        throw new IllegalArgumentException("b khong hop le trong khoang 4-10");
                    }
                } else {
                    throw new IllegalArgumentException("a khong hop le trong khoang 4-10");
                }
            } else {
                throw new IllegalArgumentException("b khong la so nguyen");
            }
        } else {
            throw new IllegalArgumentException("a khong la so nguyen");
        }
    }
}
