/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5_Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<Double>();
        while (true) {
            System.out.println("Nhap so thuc: ");
            // Nhap vao arraylist
            a.add(Double.parseDouble(sc.nextLine()));
            System.out.println("Ban co muon nhap tiep khong ? (Y/N)");
            if (sc.nextLine().equalsIgnoreCase("N"))
            {
                break;
            }
        }
        double tong = 0;
        System.out.println("Danh sach vua nhap: ");
        for (Double double1 : a) {
            System.out.println(double1);
            tong = tong + double1;
        }
        System.out.println("Tong la: " + tong);
    }
}