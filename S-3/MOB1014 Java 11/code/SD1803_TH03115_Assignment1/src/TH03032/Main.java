/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TH03032;

import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        do
        {
            try //trycatch la check nhap sai thanh ki tu chu alphabet
            {
                System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
                System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
                System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
                System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
                System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
                System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
                System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
                System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
                System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
                System.out.println("0. Thoát Menu.");
                
                System.out.println("Nhap vao lua chon (so nguyen): ");
                menu = Integer.parseInt(sc.nextLine());
                
                switch (menu) 
                {
                    case 1:
                        chucNang1();
                        break;
                    case 2:
                        chucNang2();
                        break;
                    case 3:
                        chucNang3();
                        break;
                    case 4:
                        chucNang4();
                        break;
                    case 5:
                        chucNang5();
                        break;
                    case 6:
                        chucNang6();
                        break;
                    case 7:
                        chucNang7();
                        break;
                    case 8:
                        chucNang8();
                        break;
                    case 9:
                        chucNang9();
                        break;
                    case 0:
                        System.out.println("Pipi");
                        break;
                    default:
                        System.out.println("Ban chon sai phim chuc nang.");
                        break;
                }
            }
            catch (Exception e)
            {
                //trycatch la check nhap sai thanh ki tu chu alphabet
                System.out.println("Ban da khong nhap dung so nguyen");
            }
        }
        while (menu != 0);
        
    }
    
    public static void chucNang1() {
        
    }

    public static void chucNang2() {
        
    }

    public static void chucNang3() {
        
    }

    public static void chucNang4() {
        
    }

    public static void chucNang5() {
        
    }

    public static void chucNang6() {
        
    }

    public static void chucNang7() {
        
    }

    public static void chucNang8() {
        
    }

    public static void chucNang9() {
        
    }
}