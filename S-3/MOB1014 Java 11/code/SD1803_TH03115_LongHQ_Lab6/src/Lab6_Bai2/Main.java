/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> sanPhamList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ":");
            sp.nhap();
            sanPhamList.add(sp);
        }

        System.out.println("\nCác sản phẩm có hãng là Nokia:");
        for (SanPham sp : sanPhamList) {
            if ("Nokia".equalsIgnoreCase(sp.getHang())) {
                sp.xuat();
            }
        }
    }
}