/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Bai2;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class SanPham {
    private String tenSp;
    private double donGia;
    private String hang;
    
    public SanPham() {
    }
    
    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void xuat() {
        System.out.println("Ten sp la: " + this.tenSp);
        System.out.println("Gia sp la: " + this.donGia);
        System.out.println("Hang sp la: " + this.hang);
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Nhập hãng: ");
        hang = sc.nextLine();
    }
}
