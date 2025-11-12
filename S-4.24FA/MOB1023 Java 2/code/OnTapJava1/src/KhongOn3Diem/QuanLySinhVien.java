/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhongOn3Diem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class QuanLySinhVien {
    Scanner sc = new Scanner(System.in);
    
    public void nhapTT(ArrayList<SinhVien> sivi) {
        while (true) {
            System.out.print("Nhap ma sivi: ");
            String mssv = sc.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhap lop: ");
            String lop = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap gioi tinh: ");
            String gioiTinh = sc.nextLine();
            
            sivi.add(new SinhVien(mssv, hoTen, lop, tuoi, gioiTinh));
            
            System.out.println();
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            String nhap = sc.nextLine();
            if (nhap.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void xuatTT(ArrayList<SinhVien> sivi) {
        for (SinhVien sv : sivi) {
            sv.inThongTin();
        }
    }
    public void timTheoTen(ArrayList<SinhVien> sivi) {
        System.out.print("Nhap ten sivi muon tim: ");
        String hoTen = sc.nextLine();
        
        for (SinhVien sv : sivi) {
            if (sv.getHoTen().equalsIgnoreCase(hoTen)) {
                sv.inThongTin();
            } else {
                System.out.println("Khong tim duoc sivi nao co ten: " + hoTen);
            }
        }
    }
    public void timSD1803(ArrayList<SinhVien> sivi) {
        for (SinhVien sv : sivi) {
            if (sv.getLop().equalsIgnoreCase("SD1803")) {
                sv.inThongTin();
            } else {
                System.out.println("Khong tim duoc sivi nao trong lop SD1803");
            }
        }
    }
    public void timTheoMa(ArrayList<SinhVien> sivi) {
        System.out.print("Nhap ma sivi muon tim: ");
        String mssv = sc.nextLine();
        
        for (SinhVien sv : sivi) {
            if (sv.getMssv().equalsIgnoreCase(mssv)) {
                sv.inThongTin();
            } else {
                System.out.println("Khong tim duoc sivi nao co ma: " + mssv);
            }
        }
    }
    public void gioiTinhNam(ArrayList<SinhVien> sivi) {
        for (SinhVien sv : sivi) {
            if (sv.getGioiTinh().equalsIgnoreCase("nam")) {
                sv.inThongTin();
            } else {
                System.out.println("Khong tim duoc sivi nao gioi tinh nam");
            }
        }
    }
    public void lonHon15T(ArrayList<SinhVien> sivi) {
        for (SinhVien sv : sivi) {
            if (sv.getTuoi() > 15) {
                sv.inThongTin();
            } else {
                System.out.println("Khong tim duoc sivi nao lon hon 15 tuoi");
            }
        }
    }
    public void xoaTheoMa(ArrayList<SinhVien> sivi) {
        System.out.print("Nhap ma sivi muon xoa: ");
        String mssv = sc.nextLine();
        
        for (SinhVien sv : sivi) {
            if (sv.getMssv().equalsIgnoreCase(mssv)) {
                sivi.remove(sv);
            } else {
                System.out.println("Khogn tim duoc sivi nao co ma: " + mssv);
            }
        }
    }
    public void capNhatTheoMa(ArrayList<SinhVien> sivi) {
        System.out.print("Nhap ma sivi muon cap nhat thong tin: ");
        String mssv = sc.nextLine();
        
        for (SinhVien sv : sivi) {
            if (sv.getMssv().equalsIgnoreCase(mssv)) {
                
            } else {
                System.out.println("Khogn tim duoc sivi nao co ma: " + mssv);
            }
        }
    }
}
