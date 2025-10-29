package com.example.testcustom.buoi2;

public class BaiTapService {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Khong duoc chia cho 0");
        }
        return a / b;
    }
    public double average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("ArrayList rong");
        }
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
    public boolean isEven(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Khong kiem tra so am");
        }
        return n % 2 == 0;
    }
    public int calculateAge(int birthYear) {
        if (birthYear > 2025) {
            throw new IllegalArgumentException("Ban chua duoc sinh ra");
        } else if (birthYear <= 1900) {
            throw new IllegalArgumentException("Ban da chet");
        }
        return 2025 - birthYear;
    }
}
