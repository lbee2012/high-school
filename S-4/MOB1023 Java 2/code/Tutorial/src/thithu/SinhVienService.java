/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class SinhVienService {
    Scanner sc = new Scanner(System.in);
    
    public void nhapDSsivi(ArrayList <SinhVien> sv) {
        while (true) {
            System.out.print("Nhap ma sivi: ");
            String maSV = sc.nextLine();
            
            System.out.print("Nhap ten sivi: ");
            String hoTen = sc.nextLine();
            
            System.out.print("Nhap chuyen nganh sivi: ");
            String chuyenNganh = sc.nextLine();
            
            sv.add(new SinhVien(maSV, hoTen, chuyenNganh));
            
            System.out.println("");
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            String yn = sc.nextLine();
            
            if (yn.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuatDSsivi(ArrayList <SinhVien> sv) {
        for (SinhVien sinhVien : sv) {
            sinhVien.inThongTin();
        }
    }
    
    public void timSVtheoma(ArrayList <SinhVien> sv) {
        System.out.print("Nhap vao ma sivi muon tim: ");
        String maSV = sc.nextLine();
        
        for (SinhVien sinhVien : sv) {
            if (sinhVien.getMaSV().equalsIgnoreCase(maSV)) {
                sinhVien.inThongTin();
                break;
            } else {
                System.out.println("Khong co sivi nao co ma: " + maSV);
            }
        }
    }
    
    public void sapXepTheoChuyenNganh(ArrayList <SinhVien> sv) {
        
    }
    
    public void SiViPoly(ArrayList <SinhVien> sv, SinhVienPoly svp) {
        svp.inThongTin();
    }
}
