/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số thực: ");
            // Thêm số vừa nhập vào ArrayList
            a.add(Double.parseDouble(sc.nextLine()));
            System.out.print("Bạn có muốn nhập tiếp Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        double tong = 0;
        System.out.println("Danh sách vừa nhập: ");
        for (Double double1 : a) {
            System.out.print(double1);
            tong = tong + double1;
        }
        System.out.println("Tổng là; " + tong);
    }
}
