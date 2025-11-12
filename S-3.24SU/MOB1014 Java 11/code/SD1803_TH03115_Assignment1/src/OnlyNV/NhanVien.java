/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlyNV;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;

    public NhanVien() {
    }
    
    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap() {
        return luong;
    }
    
    public double getThueTN() {
        double thuNhap = getThuNhap();
        if (thuNhap < 9000000)
            return 0;
        else if (thuNhap <= 15000000)
            return thuNhap * 0.1;
        else
            return thuNhap * 0.12;
    }
    
    public void xuat() {
        System.out.println("");
        System.out.println("Ma: " + maNV);
        System.out.println("Ten: " + hoTen);
        System.out.println("Luong: " + luong);
        System.out.println("Thu nhap: " + getThuNhap());
        System.out.println("Thue thu nhap: " + getThueTN());
    }
        
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma: ");
        maNV = sc.nextLine();
        
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        
        System.out.print("Nhap luong: ");
        luong = Double.parseDouble(sc.nextLine());
    }
}