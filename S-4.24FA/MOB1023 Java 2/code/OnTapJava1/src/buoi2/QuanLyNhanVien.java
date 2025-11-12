/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> dsnv = new ArrayList<>();
    
    public ArrayList<NhanVien> getDanhSach() {
        return dsnv;
    }
    
    public void nhapThongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma NV:");
        String maNhanVien = sc.nextLine();
        System.out.print("Nhap ten:");
        String hoten = sc.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh:");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi:");
        String diaChi = sc.nextLine();
        NhanVien nv = new NhanVien(maNhanVien, hoten, tuoi, diaChi, gioiTinh);
        dsnv.add(nv);
        System.out.println("Them mot nhan vien thanh cong");
    }
    
    public void inThongtin() {
        for(NhanVien nv : dsnv){
            nv.inThongTin();
        }
    }
    
    public void hienThiNam() {
        Scanner sc = new Scanner (System.in);
        for (NhanVien nv : dsnv) {
            if (nv.getGioiTinh().equalsIgnoreCase("nam")) {
                nv.inThongTin();
            }
        }
    }
    
    public void timKiemTheoDiaChi() {
        for (NhanVien nv : dsnv) {
            if (nv.getDiaChi().equalsIgnoreCase("Ha Noi")) {
                nv.inThongTin();
            }
        }
    }
    
//    public void timKiemTheoTen(String name) {
//        System.out.println("Ten can tim la: " + name);
//        for (NhanVien nv : dsnv) {
//            if (nv.getHoTen().contains(name)) {
//                nv.inThongTin();
//            }
//        }
//    }
    
    public ArrayList<NhanVien> timKiemTheoTen(String name) {
        ArrayList<NhanVien> kq = new ArrayList<>();
        for (NhanVien nv : dsnv) {
            if (nv.getHoTen().contains(name)) {
                kq.add(nv);
            }
        }
        if (kq.isEmpty()) {
            System.out.println("Khong tim duoc nhan vien nao co ten la: " + name);
        }
        return kq;
    }
}
