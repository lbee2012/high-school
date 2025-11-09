/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <DongVat> dv = new ArrayList<>();
        DongVatService sv = new DongVatService();
        Scanner sc = new Scanner(System.in);
        
        int menu;
        
        do {
            System.out.println("\n\nMENU");
            System.out.println("");
            System.out.println("1. Nhap thong tin doi tuong");
            System.out.println("2. Hien thi danh sach doi tuong");
            System.out.println("3. Tim kiem trong khoang can nang");
            System.out.println("4. Meo");
            System.out.println("");
            System.out.println("0. Thoat MENU");
            System.out.println("");
            
            System.out.println("Vui long nhap vao lua chon");
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap vao mot so nguyen");
                menu = -1;
            }
            
            switch (menu) {
                case 1:
                    sv.nhapTTDoiTuong();
                    break;
                case 2:
                    sv.xuatDSDoiTuong();
                    break;
                case 3:
                    sv.khoangCanNang();
                    break;
                case 4:
                    sv.meo();
                    break;
                case 0:
                    System.out.println("Thoat MENU thanh cong");
                    break;
                default:
                    System.out.println("Nhap sai phim chuc nang");
                    break;
            }
        } while (menu != 0);
    }
}
