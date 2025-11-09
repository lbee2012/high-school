/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <PhuongTien> pt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        PhuongTienService pts = new PhuongTienService();
        
        int menu;
        
        do {
            System.out.println("\n\nMENU");
            System.out.println();
            System.out.println("1. Nhap thong tin phuong tien");
            System.out.println("2. Hien thi danh sach phuong tien");
            System.out.println("3. Tim kiem trong khoang gia tien");
            System.out.println("4. Xe may");
            System.out.println();
            System.out.println("0. Thoat MENU");
            System.out.println();
            
            System.out.print("Vui long nhap vao chuc nang: ");
            
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so nguyen");
                menu = -1;
            }
            
            switch (menu) {
                case 1:
                    pts.nhapTT(pt);
                    break;
                case 2:
                    pts.xuatTT(pt);
                    break;
                case 3:
                    pts.timTheoGia(pt);
                    break;
                case 4:
                    pts.xeMay(pt);
                    break;
                case 0:
                    System.out.println("Thoat MENU thanh cong!");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai phim chuc nang!");
                    break;
            }
        } while (menu != 0);
    }
}
