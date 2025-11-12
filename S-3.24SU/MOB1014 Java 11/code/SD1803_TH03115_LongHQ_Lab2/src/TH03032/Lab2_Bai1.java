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
public class Lab2_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao a: ");
        int a = sc.nextInt();
        
        System.out.println("Nhap vao b: ");
        int b = sc.nextInt();
        
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
    }
}
