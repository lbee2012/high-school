/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Menu {
    private ArrayList <BangDiem> listDiem = new ArrayList<>();
    BangDiem bd = new BangDiem();
    Scanner sc = new Scanner(System.in);
    
    public void menu() {
        
        int menu;
        
        do {
            System.out.println("\n\n--------------------------------Menu--------------------------------\n");
            
            System.out.println("1. Nhap diem");
            System.out.println("2. Hien thi bang diem");
            System.out.println("3. Hien thi bang diem Java");
            System.out.println("4. Hien thi bang diem Web");
            System.out.println("5. Diem cao nhat mon Java");
            System.out.println("6. Diem cao nhat mon Web");
            
            System.out.println("\n0. Thoat chuong trinh");
            System.out.println("-------------------------------------------------------------------------");
            
            System.out.print("\nVui long nhap vao lua chon");
            
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap lua chon la mot so nguyen.");
                menu = -1; // Đặt giá trị không hợp lệ để vòng lặp tiếp tục
                continue;
            }
            
            switch (menu) {
                case 1:
                    System.out.println("Ban da chon chuc nang 1");
                    nhapDiem();
                    break;
                case 2:
                    System.out.println("Ban da chon chuc nang 2");
                    break;
                case 3:
                    System.out.println("Ban da chon chuc nang 3");
                    break;
                case 4:
                    System.out.println("Ban da chon chuc nang 4");
                    break;
                case 5:
                    System.out.println("Ban da chon chuc nang 5");
                    break;
                case 6:
                    System.out.println("Ban da chon chuc nang 6");
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh");
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai, vui long nhap lai");
                    break;
            }
        } while (menu != 0);
    }
    
    public void nhapDiem() {
        bd.nhapDiem();
    }
}
