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
public class Lab3_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so N can kiem tra: ");
        int n = sc.nextInt();
        
        if (n == 0)
            System.out.println("0 khong phai mot so nguyen to");
        else
        {
            int dem = 0;

            for (int i = 2; i <= Math.abs(n); i++) 
            {
                if (n % i == 0)
                {
                    dem++;
                }
            }

            if (dem <= 2)
                System.out.println(Math.abs(n) + " la so nguyen so");
            else
                System.out.println(Math.abs(n) + " khong phai so nguyen so");   
        }
    }
}