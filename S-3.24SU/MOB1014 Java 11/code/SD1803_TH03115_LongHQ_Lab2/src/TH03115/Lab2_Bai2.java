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
public class Lab2_Bai2 {
    public static void main(String[] args) {
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
    }
}
