/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Lab1_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao lan luot a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double delta = b * b + 4 * a * c;
        
        if (delta < 0)
            System.out.println("PT vo nghiem");
        else if (delta == 0)
            {
                double x = -b / 2 * a;
                System.out.println("PT co nghiem x = " + x);
            }
        else
            {
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("PT co 2 nghiem x1, x2");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
    }
}
