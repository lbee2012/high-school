/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <ThucVat> tv = new ArrayList<>();
        Menu menu = new Menu();
        
        int nhap;
        
        do {
            System.out.println("\n\nMENU");
            System.out.println("");
            System.out.println("1. Them thuc vat");
            System.out.println("2. Hien thi danh sach thuc vat");
            System.out.println("3. Tim kiem ten thuc vat bat dau bang chu 't'");
            System.out.println("4. Hien thi danh sach cac thuc vat o vi tri chan");
            System.out.println("5. Sap xep tang dan theo ten");
            System.out.println("6. Sap xep giam dan theo khoi luong");
            System.out.println("7. Xoa thuc vat theo vi tri");
            System.out.println("8. Xoa thuc vat theo ma");
            System.out.println("9. Tim kiem thuc vat trong khoang khoi luong");
            System.out.println("10. Nhap thong tin cay an qua");
            System.out.println("");
            System.out.println("0. Thoat MENU");
            System.out.println("");
            System.out.print("Vui long nhap lua chon: ");
            
            try {
                nhap = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap lai mot so nguyen");
                nhap = -1; // Đặt giá trị không hợp lệ để vòng lặp tiếp tục
                continue;
            }
        } while (nhap != 0);
        
        switch (nhap) {
            case 1:
                menu.add(tv);
                break;
            case 2:
                menu.ds(tv);
                break;
            case 3:
                menu.timT(tv);
                break;
            case 4:
                menu.dsChan(tv);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.print("Nhap vi tri muon xoa: ");
                int vitri = Integer.parseInt(sc.nextLine());
                
                menu.del(tv, vitri);
                
                System.out.println("Danh sach sau khi xoa: ");
                System.out.println("");
                menu.ds(tv);
                break;
            case 8:
                System.out.print("Nhap ma thuc vat muon xoa: ");
                String ma = sc.nextLine();
                
                menu.delMa(tv, ma);
                
                System.out.println("Danh sach sau khi xoa: ");
                System.out.println("");
                menu.ds(tv);
                break;
            case 9:
                System.out.print("Nhap min cua khoang khoi luong: ");
                int min = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap max cua khoang khoi luong: ");
                int max = Integer.parseInt(sc.nextLine());
                
                menu.khoangKL(tv, min, max);
                break;
            case 10:
                break;
            case 0:
                System.out.println("Thoat MENU thanh cong!");
                break;
            default:
                System.out.println("Nhap sai phim chuc nang!");
                break;
        }
    }
}
