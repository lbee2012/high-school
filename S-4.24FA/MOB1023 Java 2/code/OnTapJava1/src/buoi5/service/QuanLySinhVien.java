/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5.service;

import buoi5.model.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class QuanLySinhVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> dssv = new ArrayList<>();
    
    public ArrayList<SinhVien> getDanhSach() {
        return dssv;
    }

    public QuanLySinhVien() {
        dssv.add(new SinhVien(1,"Duong Gia Minh","Ha Noi","Nam","Hoc lai"));
        dssv.add(new SinhVien(2,"Nguyen Khanh Minh","Ha Noi","Nu","Qua mon"));
        dssv.add(new SinhVien(3,"Ta Quang The Dan","Ha Noi","Nam","Hoc lai"));
        dssv.add(new SinhVien(4,"Pham Ha Anh","Ha Noi","Nu","Qua mon"));
        dssv.add(new SinhVien(5,"Nguyen Tien Thanh","Ha Noi","Nam","Hoc lai"));
    }
    
    public void nhapThongTin(ArrayList<SinhVien> sivi) {
        System.out.print("Nhap ID: ");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap trang thai: ");
        String trangThai = sc.nextLine();
        
        sivi.add(new SinhVien(ID, hoTen, diaChi, gioiTinh, trangThai));
        System.out.println("Them mot sinh vien moi thanh cong!");
    }
    public void inThongTin(ArrayList<SinhVien> sivi) {
        for (SinhVien sv : sivi) {
            sv.inThongTin();
        }
    }
    public void sapXepTangDan(ArrayList<SinhVien> sivi) {
        sivi.sort((o1, o2)-> {
        return Integer.compare(o1.getID(), o2.getID());
    });
        System.out.println("Danh sach sau khi sap xep theo thu tu tang dan");
        for (SinhVien sv : sivi) {
            sv.inThongTin();
        }
    }
    public void viTriSoNguyen(ArrayList<SinhVien> sivi, int viTri) {
        for (SinhVien sv : sivi) {
//            if (sivi.indexOf(viTri)) {
//                
//            }
        }
    }
    public void hocLai(ArrayList<SinhVien> sivi) {
        for (SinhVien sv : sivi) {
            if (sv.getTrangThai().equalsIgnoreCase("Hoc lai")) {
                sv.inThongTin();
            } else {
                System.out.println("Khong co sivi nao phai hoc lai");
            }
        }
    }
    public void timTheoTen(ArrayList<SinhVien> sivi, String hoTen) {
        for (SinhVien sv : sivi) {
            if (sv.getHoTen().equalsIgnoreCase(hoTen)) {
                sv.inThongTin();
                break;
            } else {
                System.out.println("Khong tim thay sinh vien nao");
            }
        }
    }
    
}
