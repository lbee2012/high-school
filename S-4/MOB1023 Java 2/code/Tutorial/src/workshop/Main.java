/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DongHoService dhs = new DongHoService();
        ArrayList<DongHo> list = new ArrayList<DongHo>();
        
        int menu;
        

        while (true) {
            System.out.print("Nhap vao phim chuc nang: ");
            menu = Integer.valueOf(sc.nextLine());
            
            switch (menu) {
                case 1:
                    System.out.println("Chuc nang 1: ");
                    dhs.mot(list);
                    break;
                case 2:
                    System.out.println("Chuc nang 2: ");
                    dhs.hai(list);
                    break;
                case 3:
                    System.out.println("Chuc nang 3: ");
                    dhs.ba(list);
                    break;
                case 0:
                    System.out.println("Thoat MENU thanh cong");
                    break;
                default:
                    System.out.println("Nhap sai phim chuc nang");
                    break;
            }
        }
    }
}
