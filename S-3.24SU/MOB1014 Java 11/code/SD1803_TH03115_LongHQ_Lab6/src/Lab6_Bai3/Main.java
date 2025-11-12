/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Bai3;

import java.util.ArrayList;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> svlist = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("Nhap thogn tin sivi" + (i + 1));
            sv.nhap();
            svlist.add(sv);
        }

        System.out.println("Thong tin cac sivi");
        for (SinhVien sv : svlist) {
            sv.xuat();
        }
        
    }
}
