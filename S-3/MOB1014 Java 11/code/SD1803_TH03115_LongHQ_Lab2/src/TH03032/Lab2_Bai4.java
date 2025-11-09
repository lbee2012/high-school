/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03032;

import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class Lab2_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("+---------------------------------------------------+");
        System.out.println("|1. Giai phuong trinh bac nhat                      |");
        System.out.println("|2. Giai phuong trinh bac hai                       |");
        System.out.println("|3. Tinh tien dien                                  |");
        System.out.println("|                                                   |");
        System.out.println("|0. Ket thuc MENU                                   |");
        System.out.println("+---------------------------------------------------+");
        
        System.out.println("");
        
        System.out.print("Chon chuc nang: ");
        int menu = sc.nextInt();
        
        switch (menu)
        {
            case 1:
                PTBacNhat();
                break;
            case 2:
                PTBacHai();
                break;
            case 3:
                TienDien();
                break;
            default:
                System.out.println("Ban nhap sai phim chuc nang (1,2,3)!");
                break;
        }
    } //main main
    
    public static void PTBacNhat() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhap vao b: ");
        double b = sc.nextDouble();
        
        if (a == 0)
        {
            if (b == 0)
            {
                System.out.println("Vo so nghiem");
            }
            else
            {
                System.out.println("Vo nghiem");
            }
        }
        else
        {
            double x = (double) -b / a;
            System.out.println("PT co nghiem X = " + x);
        }
    } //main case1
    
    public static void PTBacHai() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhap vao b: ");
        double b = sc.nextDouble();
        
        System.out.print("Nhap vao c: ");
        double c = sc.nextDouble();
        
        if (a == 0)
            if (b == 0)
                if (c == 0)
                    System.out.println("PT vo nghiem");
                else
                    System.out.println("PT vo so nghiem");
            else
            {
                double x = -b / a;
                System.out.println("PT co nghiem x = -b / a =" + x);
            }
        else
        {
            double delta = b * b - 4 * a * c;
            if (delta < 0)
                System.out.println("PT vo nghiem");
            else if (delta == 0)
            {
                double x012 = -b / 2 * a;
                System.out.println("");
            }
            else
            {
                System.out.println("PT co hai nghiem phan biet x1, x2");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    } //main case2
    
    public static void TienDien() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so dien: ");
        int n = sc.nextInt();
        
        double tien;
        
        if (n <= 50)
            tien = n * 1000;
        else
        {
            tien = (50 * 1000) + ((n - 50) * 1200);    
        }
        System.out.println("Tien dien cua ban voi " + n + " so dien la: " + tien);
    }
} //class
