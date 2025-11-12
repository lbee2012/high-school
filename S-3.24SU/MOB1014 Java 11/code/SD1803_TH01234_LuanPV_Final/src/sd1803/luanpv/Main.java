/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803.luanpv;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DongVatService dvs = new DongVatService();
        Scanner sc = new Scanner(System.in);
        int nhap = 0;
        while (true) {
            System.out.println("1. Nhap thong tin doi tuong. \n"
                    + "2. Hien thi danh sach doi tuong. \n"
                    + "3. Tim kiem trong khoang can nang. \n"
                    + "4. Thoat.\n"
                    + "5. Dong vat Meo");
            System.out.print("Moi chon chuc nang: ");
            nhap = Integer.parseInt(sc.nextLine());
            if (nhap == 4) {
                System.out.println("Tam biet.");
                break;
            }

            switch (nhap) {
                case 1:
                    dvs.cn1();
                    break;
                case 2:
                    dvs.cn2();
                    break;
                case 3:
                    dvs.cn3();
                    break;
                case 5:
                    dvs.cn5();
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai.");
            }

        }
    }

}
