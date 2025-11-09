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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        int menu;
        
        System.out.println("\n\nNhap thong tin danh sach nhan vien");
        System.out.println("1. Nhap thong tin danh sach");
        System.out.println("2. In thong tin danh sach");
        System.out.println("3. Xoa nhan vien theo ma");
        System.out.println("4. Cap nhat thong tin theo ma");
        System.out.println("5. Hien thi danh sach nhan vien co tuoi tren 20");
        System.out.println("6. Hien thi danh sach sinh vien nam");
        System.out.println("7. Tim kiem nhan vien theo dia chi");
        System.out.println("8. Tim kiem nhan vien theo ten");
        System.out.println("");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("");
        
        do {
            System.out.print("Moi ban chon phim chuc nang: ");
            menu = Integer.parseInt(sc.nextLine());
            
            switch (menu) {
                case 1:
                    System.out.println("Nhap thong tin nhan vien");
//                    ArrayList<NhanVien> dsnv = qlnv.getDanhSach();
//                    hienThi(dsnv);
                    qlnv.nhapThongtin();
                    break;
                case 2:
                    System.out.println("In thong tin danh sach nhan vien");
                    qlnv.inThongtin();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Hien thi danh sach nhan vien nam");
                    qlnv.hienThiNam();
                    break;
                case 7:
                    System.out.println("Tim kiem nhan vien o Ha Noi");
                    qlnv.timKiemTheoDiaChi();
                    break;
                case 8:
                    System.out.println("Tim kiem nhan vien theo ten");
                    System.out.print("Nhap ten can tim: ");
                    String name = sc.nextLine();
                    ArrayList<NhanVien> kqTimKiem = qlnv.timKiemTheoTen(name);
                    hienThi(kqTimKiem);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh thanh cong!");
                    break;
                default:
                    System.out.println("Ban chon sai phim chuc nang, vui long chon lai!");
                    break;
                
            }
        } while (menu != 0);
    }
    
    public static void hienThi(ArrayList<NhanVien> dsnv) {
        for (NhanVien nv : dsnv) {
            nv.inThongTin();
        }
    }
}
