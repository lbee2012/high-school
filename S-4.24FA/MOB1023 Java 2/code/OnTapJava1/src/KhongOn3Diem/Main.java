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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien qlsv = new QuanLySinhVien();
        ArrayList<SinhVien> sivi = new ArrayList<>();
        
        int menu;
        
        System.out.println("\n\nMENU");
        System.out.println("1. Nhap thong tin sivi moi");
        System.out.println("2. In thong tin sivi");
        System.out.println("3. Cap nhat thong tin sivi theo ma");
        System.out.println("4. Tim sivi theo ma");
        System.out.println("5. Hien thi sivi co tuoi lon hon 15");
        System.out.println("6. Tim sivi co gioi tinh nam");
        System.out.println("7. Tim kiem sivi hoc lop \"SD1803\"");
        System.out.println("8. Tim kiem sivi theo ten");
        System.out.println();
        System.out.println("0. Thoat MENU");
        do {
            System.out.println();
            System.out.print("Moi ban chon chuc nang: ");
            menu = Integer.parseInt(sc.nextLine());
            
            switch (menu) {
                case 1:
                    System.out.println("1. Nhap thong tin sivi moi");
                    qlsv.nhapTT(sivi);
                    break;
                case 2:
                    System.out.println("2. In thong tin sivi");
                    qlsv.xuatTT(sivi);
                    break;
                case 3:
                    System.out.println("3. Cap nhat thong tin sivi theo ma");
                    break;
                case 4:
                    System.out.println("4. Tim sivi theo ma");
                    qlsv.timTheoMa(sivi);
                    break;
                case 5:
                    System.out.println("5. Hien thi sivi co tuoi lon hon 15");
                    qlsv.lonHon15T(sivi);
                    break;
                case 6:
                    System.out.println("6. Tim sivi co gioi tinh nam");
                    qlsv.gioiTinhNam(sivi);
                    break;
                case 7:
                    System.out.println("7. Tim kiem sivi hoc lop SD1803");
                    qlsv.timSD1803(sivi);
                    break;
                case 8:
                    System.out.println("8. Tim kiem sivi theo ten");
                    qlsv.timTheoTen(sivi);
                    break;
                case 0:
                    System.out.println("Thoat MENU thanh cong!");
                    break;
                default:
                    System.out.println("Ban chon sai phim chuc nang, vui long chon lai!");
                    break;
            }
        } while (menu != 0);
    }
}
