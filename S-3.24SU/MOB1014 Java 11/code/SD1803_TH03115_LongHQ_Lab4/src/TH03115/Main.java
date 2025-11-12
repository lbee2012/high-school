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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SanPham sp1 = new SanPham("ali",10000,500);
        SanPham sp2 = new SanPham("SP2",1000);
        
        //nhap
        System.out.println("Nhap vao SP1");
        sp1.nhap();
        System.out.println("");
        //xuat
        System.out.println("Thong so cua SP1");
        sp1.xuat();
        System.out.println("SP 2 có sẵn thông số");
        System.out.println("Thong so cua SP2");
        sp2.xuat();
    }
}
