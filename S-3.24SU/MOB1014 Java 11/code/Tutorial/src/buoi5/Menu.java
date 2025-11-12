/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Menu {
    private ArrayList <DongVat> listSV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void menu() {
        int menu;
        
        do {
            System.out.println("\n\nMENU\n");
            
            System.out.println("1. Them sv");
            System.out.println("2. Danh sach sv");
            System.out.println("3. Danh sach sv co ten");
            System.out.println("4. Danh sach sv nang trong khoang min max");
            System.out.println("");
            System.out.println("0. Thoat MENU");
            
            System.out.println("");
            System.out.print("Vui long nhap vao lua chon: ");
            
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap lua chon la mot so nguyen.");
                menu = -1; // Đặt giá trị không hợp lệ để vòng lặp tiếp tục
                continue;
            }
        } while (menu != 0);
    }
    
    public void meomeo
}
