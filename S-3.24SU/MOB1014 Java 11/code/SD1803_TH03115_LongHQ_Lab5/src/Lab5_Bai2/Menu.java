/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5_Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> a = new ArrayList<>();

    public void nhap() {
        while (true) {
            System.out.print("Mời nhập họ tên: ");
            a.add(sc.nextLine());
            System.out.print("Bạn có muốn nhập tiếp Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println("Danh sách vừa nhập: ");
        for (String string : a) {
            System.out.println(string);
        }
    }

    public void sapXep() {
        Collections.sort(a);
        Collections.reverse(a);
        System.out.println("Danh sách đã sắp xếp: ");
        for (String string : a) {
            System.out.println(string);
        }
    }
}
