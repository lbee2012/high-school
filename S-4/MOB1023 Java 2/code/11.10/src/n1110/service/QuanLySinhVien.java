/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n1110.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import n1110.model.SinhVien;

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
        svList.add(new SinhVien(1, "Hoang Quy Long", "Ha Noi", "Nam", "SD1803"));
        svList.add(new SinhVien(2, "Nguyen Khanh Minh", "Ha Noi", "Nu", "SD1803"));
        svList.add(new SinhVien(3, "Ta Quang The Dan", "Ha Noi", "Nam", "SD1803"));
        svList.add(new SinhVien(4, "Pham Ha Anh", "Ha Noi", "Nu", "SD1803"));
        svList.add(new SinhVien(5, "Duong Gia Minh", "Ha Noi", "Nam", "GD1801"));
    }
    
    public ArrayList<SinhVien> write() {
        String path = "it.txt";
        
        ArrayList<SinhVien> file = new ArrayList<>();
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SinhVien sinhVien : svList) {
                bufferedWriter.write(sinhVien.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return file;
    }
    
    public ArrayList<SinhVien> read() {
        String path = "it.txt";
        
        ArrayList<SinhVien> file = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                Integer ID = Integer.parseInt(parts[0]);
                String ten = parts[1];
                String diaChi = parts[2];
                String gioiTinh = parts[3];
                String lop = parts[4];
                
                SinhVien sv = new SinhVien(ID, ten, diaChi, gioiTinh, lop);
                file.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return file;
    }
    
    public String add(SinhVien sv) {
        svList.add(sv);
        return "Them thanh cong";
    }
    
    public String remove(int row) {
        svList.remove(row);
        return "Xoa thanh cong";
    }
    
    public String update(int row, SinhVien sv) {
        svList.set(row, sv);
        return "Cap nhat thanh cong";
    }
}
