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
public class Lab3_Bai3_C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao N phan tu: ");
        int n = sc.nextInt();
        System.out.println("");
        
        int a [] = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Nhap phan tu so " + i + ":");
            a[i] = sc.nextInt();
        }
        
        int min = a[0];
        
        for (int i = 1; i < n; i++)
        {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("So nho nhat trong mang la: " + min);
    }
}