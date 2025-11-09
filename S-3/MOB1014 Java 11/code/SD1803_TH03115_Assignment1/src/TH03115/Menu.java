/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Menu {
    
    private ArrayList <NhanVien> listNV = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
    
    public void menu() {
        int menu = 0;
        do
        {
            try //trycatch la check nhap sai thanh ki tu chu alphabet
            {
                System.out.println("\n\nMENU");
                
                System.out.println("");
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
                System.out.println("");
                
                System.out.print("Nhap vao lua chon (so nguyen): ");
                menu = Integer.parseInt(sc.nextLine());
                
                System.out.println("");
                
                switch (menu) 
                {
                    case 1:
                        nhapDS();
                        break;
                    case 2:
                        xuatDS();
                        break;
                    case 3:
                        timNV();
                        break;
                    case 4:
                        xoaNV();
                        break;
                    case 5:
                        capNhatNV();
                        break;
                    case 6:
                        khoangLuong();
                        break;
                    case 7:
                        sapXepHoTen();
                        break;
                    case 8:
                        sapXepThuNhap();
                        break;
                    case 9:
                        namNV();
                        break;
                    case 0:
                        System.out.println("Pipiii, hen gap lai.");
                        break;
                    default:
                        System.out.println("Ban chon sai phim chuc nang.");
                        break;
                }
            }
            catch (NumberFormatException e)
            {
                //trycatch la check nhap sai thanh ki tu chu alphabet
                System.out.println("Ban da khong nhap dung so nguyen");
            }
        }
        while (menu != 0);
    }
    
    public void nhapDS() { //cn1
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("");
            System.out.println("1. Nhan vien ");
            System.out.println("2. Tiep thi");
            System.out.println("3. Truong phong");
            System.out.println("");

            System.out.print("Chon loai NV can nhap: ");
            int loai = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap ma: ");
            String maNV = sc.nextLine();

            System.out.print("Nhap ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Nhap luong: ");
            double luong = Double.parseDouble(sc.nextLine());

            switch (loai) {
                case 1:
                    listNV.add(new NhanVien(maNV, hoTen, luong));
                    break;
                case 2:
                    System.out.print("Nhap doanh so: ");
                    double doanhSo = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhap hoa hong: ");
                    double hoaHong = Double.parseDouble(sc.nextLine());

                    listNV.add(new TiepThi(maNV, hoTen, luong, doanhSo, hoaHong));
                    break;
                case 3:
                    System.out.print("Nhap luong trach nhiem: ");
                    double trachNhiem = Double.parseDouble(sc.nextLine());

                    listNV.add(new TruongPhong(maNV, hoTen, luong, trachNhiem));
                    break;
                default:
                    System.out.println("Nhap sai loai NV");
                    break;
            }
            
            System.out.println("");
            System.out.print("Ban co muon nhap tiep khong (Y/N)? ");
            String YN = sc.nextLine();

            if (YN.equalsIgnoreCase("N")) {
            break;
            }
        } while (true);
    }
    
    public void xuatDS() {
        System.out.println("List NV dang co trong ds: ");
        System.out.println("");
        for (NhanVien nv : listNV) {
            nv.xuat();
        }
    }
    
    public void timNV() {
        System.out.print("Nhap ma NV muon tim: ");
        String maNV = sc.nextLine();
        
        System.out.println("");

        boolean tim = false;

        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                System.out.println("Thong tin tim duoc:");
                nv.xuat();
                tim = true;
                break;
            }
        }

        if (tim == false)
            System.out.println("Ma NV khong ton tai.");
    }

    
    public void xoaNV() {
        System.out.print("Nhap ma NV muon xoa: ");
        String maNV = sc.nextLine();
        
        System.out.println("");

        boolean tim = false;

        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                listNV.remove(nv);
                System.out.println("Da xoa NV co ma: " + maNV);
                tim = true;
                break;
            }
        }

        if (tim == false)
            System.out.println("Ma NV khong ton tai.");
    }

    
    public void capNhatNV() { //chat gpt
        System.out.print("Nhap ma NV muon update: ");
        String maNV = sc.nextLine();
        
        System.out.println("");

        boolean tim = false;

        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                System.out.print("Nhap ten moi: ");
                String hoTen = sc.nextLine();

                System.out.print("Nhap luong moi: ");
                double luong = Double.parseDouble(sc.nextLine());

                nv.setHoTen(hoTen);
                nv.setLuong(luong);

                if (nv instanceof TiepThi) {
                    TiepThi tt = (TiepThi) nv;
                    System.out.print("Nhap doanh so moi: ");
                    double doanhSo = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhap hoa hong moi: ");
                    double hoaHong = Double.parseDouble(sc.nextLine());

                    tt.setDoanhSo(doanhSo);
                    tt.setHoaHong(hoaHong);
                } else if (nv instanceof TruongPhong) {
                    TruongPhong tp = (TruongPhong) nv;
                    System.out.print("Nhap luong trach nhiem moi: ");
                    double trachNhiem = Double.parseDouble(sc.nextLine());

                    tp.setTrachNhiem(trachNhiem);
                }

                System.out.println("Update thanh cong thong tin cua: " + maNV);
                tim = true;
                break;
            }
        }
        if (tim == false)
            System.out.println("Khong ton tai ma NV: " + maNV);
    }
    
    public void khoangLuong() {
        System.out.print("Nhap khoang luong thap nhat: ");
        double min = Double.parseDouble(sc.nextLine());
        
        System.out.print("Nhap khoang luong cao nhat: ");
        double max = Double.parseDouble(sc.nextLine());
        
        for (NhanVien nv : listNV) {
            if (nv.getLuong() >= min && nv.getLuong() <= max) {
                nv.xuat();
            }
        }
    }
    
//    public void sapXepHoTen() {
//        Collections.sort(listNV, new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien nv1, NhanVien nv2) {
//                return nv1.getHoTen().compareTo(nv2.getHoTen());
//            }
//        });
//        System.out.println("Danh sach nhan vien da duoc sap xep theo ho ten.");
//    }
//    
//    public void sapXepThuNhap() {
//        Collections.sort(listNV, new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien nv1, NhanVien nv2) {
//                return Double.compare(nv2.getThuNhap(), nv1.getThuNhap());
//            }
//        });
//        System.out.println("Danh sach nhan vien da duoc sap xep theo thu nhap.");
//    }
    
    public void sapXepHoTen() {
        Collections.sort(listNV, (nv1, nv2) -> nv1.getHoTen().compareTo(nv2.getHoTen()));
        System.out.println("DS da duoc sap xep theo ho ten (In hoa > a > z");
    }

    public void sapXepThuNhap() {
        Collections.sort(listNV, (nv1, nv2) -> Double.compare(nv2.getThuNhap(), nv1.getThuNhap()));
        System.out.println("DS da duoc sap xep theo thu nhap (cao -> thap)");
    }

    
    public void namNV() {
        sapXepThuNhap();
        System.out.println("5 nhan vien co thu nhap cao nhat:");
        for (int i = 0; i < 5 && i < listNV.size(); i++) {
            listNV.get(i).xuat();
        }
    }
}// class