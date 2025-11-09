/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    public SanPham() {
    } //goij ra de nhap

    public String getTenSP() {
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public double getThueNhapKhau() {
        return donGia * 10 / 100; //0.1
    }
    
    public void xuat() {
        System.out.println("Ten sp la: " + tenSP);
        System.out.println("Don gia sp la: " + donGia);
        System.out.println("Giam gia sp la: " + giamGia);
        System.out.println("Thue NK sp la: " + getThueNhapKhau());
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten sp: ");
        tenSP = sc.nextLine();
        
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
}
