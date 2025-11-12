/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <MonHoc> mh = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        MonHocService mhs = new MonHocService();
        
        int menu;
        
        do {
            System.out.println("\n\nMENU");
            System.out.println();
            System.out.println("1. Nhap thong tin mon hoc");
            System.out.println("2. Hien thi danh sach mon hoc");
            System.out.println("3. Mon hoc Online");
            System.out.println();
            System.out.println("0. Thoat MENU");
            System.out.println();
            
            System.out.print("Vui long chon chuc nang: ");
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap vao mot so nguyen");
                menu = -1;
            }
            
            switch (menu) {
                case 1:
                    mhs.nhapTT(mh);
                    break;
                case 2:
                    mhs.xuatTT(mh);
                    break;
                case 3:
                    mhs.KeThua(mh);
                    break;
                case 0:
                    System.out.println("Thoat MENU thanh cong!");
                    break;
                default:
                    System.out.println("Chon sai phim chuc nang!");
                    break;
            }
        } while (menu != 0);
    }
}
