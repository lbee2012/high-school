/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2bai2;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class DongVat {
    private String ma;
    private String ten;
    private double canNang;
    private int chieuCao;
    private String khuVucSong;

    public DongVat() {
    }

    public DongVat(String ma, String ten, double canNang, int chieuCao, String khuVucSong) {
        this.ma = ma;
        this.ten = ten;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.khuVucSong = khuVucSong;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getCanNang() {
        return canNang;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }
    
    public void xuat() {
        System.out.println("Ma dv la: " + this.ma);
        System.out.println("Ten cua dv la: " + this.ten);
        System.out.println("Can nang cua dv la: " + this.canNang);
        System.out.println("Chieu cao cua dv la: " + this.chieuCao);
        System.out.println("Khu vuc song cua dv la: " + this.khuVucSong);
    }
    
    public void nhap() {
        Scanner chu = new Scanner(System.in);
        Scanner so = new Scanner(System.in);
        
        System.out.print("Nhap ma cua dv: ");
        ma = chu.nextLine();
        System.out.print("Nhap ten cua dv: ");
        ten = chu.nextLine();
        System.out.print("Can nang cua dv: ");
        canNang = so.nextDouble();
        System.out.print("Chieu cao cua dv la: ");
        chieuCao = so.nextInt();
        System.out.print("Khu vuc song cua dv la: ");
        khuVucSong = chu.nextLine();
    }
}
