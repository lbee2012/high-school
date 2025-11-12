/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nhap;
        Menu mn = new Menu();
        while (true) {
            System.out.println("1. Nhập danh sách họ và tên\n"
                    + "2. Xuất danh sách vừa nhập\n"
                    + "3. Xuất danh sách ngẫu nhiên\n"
                    + "4. Sắp xếp giảm dần và xuất danh sách\n"
                    + "5. Tìm và xóa họ tên nhập từ bàn phím\n"
                    + "0. Kết thúc");
            System.out.print("Mời lựa chọn: ");
            nhap = Integer.parseInt(sc.nextLine());
            if (nhap == 0) {
                System.out.println("Tạm biệt!");
                break;
            }
            switch (nhap) {
                case 1:
                    mn.nhap();
                    break;
                case 2:
                    mn.xuat();
                    break;
                case 4:
                    mn.sapXep();
                    break;
                default:
                    System.out.println("Chức năng không tồn tại. Nhập lại!");
            }

        }
    }

}
