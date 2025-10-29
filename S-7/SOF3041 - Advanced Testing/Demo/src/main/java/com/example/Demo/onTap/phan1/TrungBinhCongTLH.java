package com.example.Demo.onTap.phan1;

public class TrungBinhCongTLH {
    //tinh trung binh cong 3 mon toan ly hoa
    //kiem tra ngoai le khi chia cho 0
    public static double averager(int toan, int ly, int hoa) {
        if (toan < 0 || toan > 10) throw new IllegalArgumentException();
        if (ly < 0 || ly > 10) throw new IllegalArgumentException();
        if (hoa < 0 || hoa > 10) throw new IllegalArgumentException();
        int result = toan + ly + hoa;
        return result / 3;
    }
    public static int divide(int a, int b) {
        return a / b; //if b = 0; ArithmeticException se duoc tu dong tra ve
    }
}
