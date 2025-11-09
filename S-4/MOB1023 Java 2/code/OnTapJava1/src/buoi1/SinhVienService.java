/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class SinhVienService {
    Scanner sc = new Scanner(System.in);
    ArrayList <SinhVien> sv = new ArrayList<>();
    
    public void nhap() {
        while (true) {
            System.out.print("Nhap ma sivi: ");
            String maSinhVien = sc.nextLine();
            
            System.out.print("Nhap ten sivi: ");
            String tenSinhVien = sc.nextLine();
            
            System.out.print("Nhap nam sinh sivi: ");
            int namSinh = sc.nextInt();
            
            System.out.print("Nhap dia chi sivi: ");
            String diaChi = sc.nextLine();
            
            System.out.print("Nhap gioi tinh sivi: ");
            String gioiTinh = sc.nextLine();
            
            sv.add(new SinhVien(maSinhVien, tenSinhVien, namSinh, diaChi, gioiTinh));
            
            System.out.println("");
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            String yn = sc.nextLine();
            
            if (yn.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuat() {
        for (SinhVien sinhVien : sv) {
            sinhVien.inThongTin();
        }
    }
    
    public void cn1() {
        
    }
    
    public void cn2() {
        
    }
    
    public void cn3() {
        
    }
    
    public void cn4() {
        
    }
}
