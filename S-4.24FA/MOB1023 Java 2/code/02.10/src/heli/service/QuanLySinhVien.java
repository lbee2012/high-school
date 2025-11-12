/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heli.service;

import heli.model.SinhVien;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author longsuwu
 */
public class QuanLySinhVien {
    ArrayList<SinhVien> svList = new ArrayList<>();
    
    public ArrayList<SinhVien> getList() {
        return svList;
    }
    
    public QuanLySinhVien() {
        svList.add(new SinhVien("01", "Hoang Quy Long", "Nam", "SD1803", "Truot mon"));
        svList.add(new SinhVien("02", "Nguyen Khanh Minh", "Nu", "SD1803", "Qua mon"));
        svList.add(new SinhVien("03", "Ta Quang The Dan", "Nam", "SD1803", "Truot mon"));
        svList.add(new SinhVien("04", "Pham Ha Anh", "Nu", "SD1803", "Qua mon"));
        svList.add(new SinhVien("05", "Duong Gia Minh", "Nam", "GD1801", "Truot mon"));
    }
    
    public ArrayList<SinhVien> docFile() {
        String path = "output.txt";
        
        ArrayList<SinhVien> file = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while ((line = bufferedReader.readLine()) != null ) {
                String[] parts = line.split(",\\s*");
                String ID = parts[0];
                String hoTen = parts[1];
                String gioiTinh = parts[2];
                String lopHoc = parts[3];
                String trangThai = parts[4];
                
                SinhVien sivi = new SinhVien(ID, hoTen, gioiTinh, lopHoc, trangThai);
                file.add(sivi);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return file;
    }
    
    public String them(SinhVien sv) {
        svList.add(sv);
        return "Them thanh cong";
    }
    
    public String xoa(int viTri) {
        svList.remove(viTri);
        return "Xoa thanh cong";
    }
    
    public String capNhat(int viTri, SinhVien sv) {
        svList.set(viTri, sv);
        return "Cap nhat thanh cong";
    }
}
