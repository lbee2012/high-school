/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <MayTinh> mt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        MayTinhService mts = new MayTinhService();
        
        int menu;
        
        do {
            System.out.println("\n\nMENU");
            System.out.println();
            System.out.println("1. Nhap thong tin may tinh");
            System.out.println("2. Hien thi danh sach may tinh");
            System.out.println("3. Tim kiem theo ten may tinh");
            System.out.println("4. Laptop");
            System.out.println();
            System.out.println("0. Thoat MENU");
            System.out.println();
            
            System.out.print("Vui long nhap vao phim chuc nang: ");
            
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so nguyen!");
                menu = -1;
            }
            
            switch (menu) {
                case 1:
                    mts.nhapTT(mt);
                    break;
                case 2:
                    mts.xuatTT(mt);
                    break;
                case 3:
                    mts.timTheoTen(mt);
                    break;
                case 4:
                    mts.laptop(mt);
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
