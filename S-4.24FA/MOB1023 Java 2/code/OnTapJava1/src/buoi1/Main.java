/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> sv = new ArrayList<>();
        SinhVienService svs = new SinhVienService();
        
        int menu;
        
        do {
            System.out.println("\n\n");
            System.out.println("----------MENU----------");
            System.out.println("1. Them 1 sv vao danh sach");
            System.out.println("2. Cap nhat thong tin cua 1 sv");
            System.out.println("3. Hien thi sv co tuoi > 20");
            System.out.println("4. Hien thi danh sach sv nam");

            System.out.println("");
            System.out.println("0. Thoat Menu");
            System.out.println("");

            System.out.print("Moi chon chuc nang: ");
            
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so nguyen");
                menu = -10;
            }
            
            switch (menu) {
                case 1:
                    svs.cn1();
                    break;
                case 2:
                    svs.cn2();
                    break;
                case 3:
                    svs.cn3();
                    break;
                case 4:
                    svs.cn4();
                    break;
                case 0:
                    System.out.println("Thoat MENU thanh cong");
                    break;
                default:
                    System.out.println("Ban chon sai phim chuc nang");
                    break;
            }
        } while (menu != 0);
    }
}
