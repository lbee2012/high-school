/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03032;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class Lab3_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao N phan tu: ");
        int n = sc.nextInt();
        System.out.println("");
        
        int a[] = new int[n]; //mang A co N phan tu
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Nhap phan tu so " + i + ": ");
            a[i] = sc.nextInt(); //nhap cac phan tu trong mang A
        }
        
        Arrays.sort(a); //sapxep tu be den lon
        System.out.println("Mang sau khi sap xep theo vi tri tu be den lon la: " + Arrays.toString(a));
        
        int min = a[0];
        
        double tong = 0;
        double dem = 0;
        
        for (int i = 0; i < n; i++)
        {
            if (min > a[i])
            {
                min = a[i];
            }
            if (a[i] % 3 == 0)
            {
                tong = tong + a[i];
                dem++;
            }
        }
        
        double tbc = tong/dem;
        
        System.out.println("So nho nhat trong mang la: " + min);
        System.out.println("Trung binh cong cac so chia het cho 3 trong mang la: " + tbc);
    }
}
