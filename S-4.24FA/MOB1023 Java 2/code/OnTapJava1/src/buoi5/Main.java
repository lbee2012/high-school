/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

import buoi5.service.QuanLySinhVien;
import buoi5.model.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> sivi = new ArrayList<>();
        QuanLySinhVien qlsv = new QuanLySinhVien();
        
        int menu;
        
        System.out.println("MENU");
        System.out.println("1. Hien thi thong tin 5 sinh vien mac dinh");
        System.out.println("2. Nhap vao mot sinh vien");
        System.out.println("3. Nhap vao 1 so nguyen, hien thi sinh vien o vi tri do");
        System.out.println("4. Su dung sap xep noi bot, sap xep theo ma sinh vien tang dan");
        System.out.println("5. Loc sinh vien co trang thai hoc lai");
        System.out.println("6. Nhap ten sinh vien va hien thi thong tin cua sinh vien");
        System.out.println("7. In thong tin danh sach sivi");
        System.out.println();
        System.out.println("0. Thoat chuong trinh");
        
        do {
            System.out.println();
            System.out.print("Moi ban chon: ");
            menu = Integer.parseInt(sc.nextLine());
            
            switch (menu) {
                case 1:
                    ArrayList<SinhVien> hien = qlsv.getDanhSach();
                    break;
                case 2:
                    System.out.println("2. Nhap vao mot sinh vien");
                    qlsv.nhapThongTin(sivi);
                    break;
                case 3:
                    System.out.println("3. Nhap vao 1 so nguyen, hien thi sinh vien o vi tri do");
                    System.out.print("Nhap vi tri so nguyen bat ki: ");
                    int viTri = Integer.parseInt(sc.nextLine());
                    
                    break;
                case 4:
                    System.out.println("4. Su dung sap xep noi bot, sap xep theo ma sinh vien tang dan");
                    qlsv.sapXepTangDan(sivi);
                    break;
                case 5:
                    System.out.println("5. Loc sinh vien co trang thai hoc lai");
                    qlsv.hocLai(sivi);
                    break;
                case 6:
                    System.out.println("6. Nhap ten sinh vien va hien thi thong tin cua sinh vien");
                    System.out.print("Nhap vao ho ten cua sinh vien muon tim kiem: ");
                    String hoTen = sc.nextLine();
                    qlsv.timTheoTen(sivi, hoTen);
                    break;
                case 7:
                    System.out.println("7. In thong tin danh sach sivi");
                    qlsv.inThongTin(sivi);
                case 0:
                    System.out.println("Thoat chuong trinh thanh cong!");
                    break;
                default:
                    System.out.println("Ban chon sai phim chuc nang, vui long chon lai!");
                    break;
            }
        } while (menu != 0);
    }
}
