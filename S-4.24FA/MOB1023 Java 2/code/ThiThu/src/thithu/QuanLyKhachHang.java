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
public class QuanLyKhachHang {
    Scanner sc = new Scanner(System.in);
    
    public void nhapTT(ArrayList<KhachHang> kh) {
        System.out.print("Nhap ID KH: ");
        String id = sc.nextLine();
        System.out.print("Nhap ho ten KH: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap sdt KH: ");
        String sdt = sc.nextLine();
        System.out.print("Nhap gioi tinh KH: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap nam sinh KH: ");
        int namSinh = Integer.parseInt(sc.nextLine());
        
        kh.add(new KhachHang(id, hoTen, sdt, gioiTinh, namSinh));
        System.out.println("Them mot khach hang moi thanh cong!");
    }
    
    public void inTT(ArrayList<KhachHang> kh) {
        for (KhachHang khachHang : kh) {
            khachHang.inThongTin();
        }
    }
    
    public void xoaTheoMa(ArrayList<KhachHang> kh) {
        System.out.print("Nhap vao ma KH muon xoa: ");
        String id = sc.nextLine();
        
        for (KhachHang khachHang : kh) {
            if (khachHang.getId().equalsIgnoreCase(id)) {
                kh.remove(id);
                System.out.println("Xoa KH co ID: " + id + " thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim duoc khach hang nao co ID: " + id);
    }
}
