/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Buoi1 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        
        int menu;
        
        do
        {
            System.out.println("\n\nMENU\n");
            
            System.out.println("1. Ten, tuoi, mssv, dtb, nganh, dchi, que, truong");
            System.out.println("2. Ktra so nguyen N la chan hay le");
            System.out.println("3. Nhap N, tinh tong 1 - N");
            System.out.println("4. Ktra so nguyen N, le va chia het cho 5");
            System.out.println("5. Tinh: tong hieu tich thuong cua A va B");
            System.out.println("6. Nhap N (0 < N < 20) tinh tong cac so chan");
            System.out.println("7. Tinh tong cac so le tu 1 - N");
            System.out.println("8. Nhap thang, nam. In ra so ngay cua thang cua nam do");
            
            System.out.println("");
            
            System.out.println("0. Ket thuc MENU");
            
            System.out.println("");
            
            System.out.print("Moi nhap vao lua chon: ");
            menu = ali.nextInt();
            
            switch (menu)
            {
                case 1:
                    mot();
                    break;
                case 2:
                    hai();
                    break;
                case 3:
                    ba();
                    break;
                case 4:
                    bon();
                    break;
                case 5:
                    nam();
                    break;
                case 0:
                    System.out.println("Thoat MENU thanh cong!");
                    break;
                default:
                    System.out.println("Nhap sai chuc nang!");
                    break;
            }
        }
        while (menu != 0);
    }
    
    public static void mot() {
        Scanner chu = new Scanner(System.in);
        Scanner so = new Scanner(System.in);
        
        System.out.print("Ho ten: ");
        String ten = chu.nextLine();
        
        System.out.print("Tuoi: ");
        int tuoi = so.nextInt();
        
        System.out.print("MSSV: ");
        String mssv = chu.nextLine();
        
        System.out.print("DTB: ");
        double dtb = so.nextDouble();
        
        System.out.print("Nganh hoc: ");
        String nganh = chu.nextLine();
        
        System.out.print("Dia chi nha: ");
        String dchi = chu.nextLine();
        
        System.out.print("Que quan: ");
        String que = chu.nextLine();
        
        System.out.print("Truong hoc: ");
        String truong = chu.nextLine();
        
        System.out.println(ten);
        System.out.println(tuoi);
        System.out.println(mssv);
        System.out.println(dtb);
        System.out.println(nganh);
        System.out.println(dchi);
        System.out.println(que);
        System.out.println(truong);
    }
    public static void hai() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen N: ");
        int n = sc.nextInt();
        
        if (n % 2 == 0)
            System.out.println("So chan");
        else
            System.out.println("So le");
    }
    public static void ba() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        
        int tong = 0;
        
        for (int i = 1; i <= n; i++) {
            tong = tong + i;
        }
        System.out.println("Tong tu 1 - N la: " + tong);
    }
    public static void bon() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        
        if (n % 2 != 0)
        {
            if (n % 5 == 0)
                System.out.println("N la so le chia het cho 5");
            else
                System.out.println("N chi la so le khong chia het cho 5");
        }
        else
            System.out.println("N la so chan");
    }
    public static void nam() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;
        
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
    }
    public static void sau() {
        Scanner sc = new Scanner(System.in);
        
        int tong = 0;
        
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0)
                tong = tong + i;
        }
        
        System.out.println("Tong ");
    }
    public static void bay() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
    }
    public static void tam() {
        
    }
}
