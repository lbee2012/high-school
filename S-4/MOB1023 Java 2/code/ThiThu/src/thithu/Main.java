/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thithu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> kh = new ArrayList<>();
        QuanLyKhachHang qlkh = new QuanLyKhachHang();
        
        int menu;
        System.out.println("\n\nMENU");
        System.out.println("1. Hien thi mac dinh 5 khach hang");
        System.out.println("2. Nhap moi 1 khach hang");
        System.out.println("3. Xoa khach hang theo ma nhap vao");
        System.out.println("4. In danh sach khach hang");
        System.out.println();
        System.out.println("0. Thoat chuong trinh");
        System.out.println();
        do {
            System.out.print("Moi nhap vao lua chon cua ban: ");
            menu = Integer.parseInt(sc.nextLine());
            
            switch (menu) {
                case 1:
                    System.out.println("1. Hien thi mac dinh 5 khach hang");
                    kh.add(new KhachHang("KH11", "Duong Gia Minh", "0965616580", "nam", 2007));
                    kh.add(new KhachHang("KH12", "Nguyen Khanh Minh", "0961319231", "nu", 2007));
                    kh.add(new KhachHang("KH13", "Pham Ha Anh", "0987654321", "nu", 2007));
                    kh.add(new KhachHang("KH14", "Ta Quang The Dan", "0123456789", "nam", 2007));
                    kh.add(new KhachHang("KH15", "Nguyen Tien Thanh", "0918273645", "nam", 2007));
                    qlkh.inTT(kh);
                    break;
                case 2:
                    System.out.println("2. Nhap moi 1 khach hang");
                    qlkh.nhapTT(kh);
                    break;
                case 3:
                    System.out.println("3. Xoa khach hang theo ma nhap vao");
                    qlkh.xoaTheoMa(kh);
                    break;
                case 4:
                    System.out.println("4. In danh sach khach hang");
                    qlkh.inTT(kh);
                    break;
                case 0:
                    System.out.println("0. Thoat chuong trinh thanh cong!");
                    break;
                default:
                    System.out.println("Ban chon sai phim chuc nang!");
                    break;
            }
        } while (menu != 0);
    }
}
