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
public class Lab2_Bai3 {
    public static void main(String[] args) {
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
}
