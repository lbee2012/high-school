/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03032;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Hi
 */
public class Lab3_Bai4_YT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] ten = new String[n];
        double[] diem = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten sv" + (i + 1) + ": ");
            ten[i] = sc.nextLine();
            System.out.print("Nhap diem sv" + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }
        
        System.out.println("Mang ten sivi: " + Arrays.toString(ten));
        System.out.println("Mang diem sivi: " + Arrays.toString(diem));
        
        sapxep(ten, diem);
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ho ten: " + ten[i]);
            System.out.println("Diem: " + diem[i]);
            
            if (diem[i] >= 9)
                System.out.println("Xuat sac");
            else if (diem[i] >= 7.5)
                System.out.println("Gioi");
            else if (diem[i] >= 6)
                System.out.println("Kha");
            else if (diem[i] >= 5)
                System.out.println("Trung binh");
            else
                System.out.println("Yeu");
            
            System.out.println("");
        }
    }//psvm
    
    public static void sapxep(String ten[], double diem[]) {
        for (int i = 0; i < ten.length - 1; i++) {          //ch hieu
            for (int j = i + 1; j < ten.length; j++) {      //ch hieu
                if (diem[i] > diem[j]) {
                    double tempD = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempD;
                    
                    String tempT = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tempT;
                }
            }
        }
    }//sapxep ch hieu for nnao
}
