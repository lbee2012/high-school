/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_Bai1;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap canh1: "); //rong
        double canh1 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Nhap canh2: "); //dai
        double canh2 = Double.parseDouble(sc.nextLine());
        
        if (canh1 == canh2) {
            Vuong v = new Vuong(canh1, canh2);
            v.xuat();
        }
        else {
            ChuNhat cn = new ChuNhat(canh1, canh2); //rong, dai
            cn.xuat();
        }
    }
}
