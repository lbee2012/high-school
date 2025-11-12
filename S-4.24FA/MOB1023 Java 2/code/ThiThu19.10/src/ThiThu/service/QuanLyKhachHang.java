/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu.service;

import ThiThu.model.KhachHang;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author longsuwu
 */
public class QuanLyKhachHang {
    ArrayList<KhachHang> khList = new ArrayList<>();
    
    public ArrayList<KhachHang> getList() {
        return khList;
    }
    
    public QuanLyKhachHang() {
        khList.add(new KhachHang("KH01", "Hoang Quy Long", 2007, "VVIP", "Nam"));
        khList.add(new KhachHang("KH02", "Nguyen Khanh Minh", 2007, "VVIP", "Nu"));
        khList.add(new KhachHang("KH03", "Ta Quang The Dan", 2007, "VIP", "Nam"));
        khList.add(new KhachHang("KH04", "Pham Ha Anh", 2007, "VIP", "Nu"));
        khList.add(new KhachHang("KH05", "Duong Gia Minh", 2007, "Thuong", "Nam"));
    }
    
    public String add(KhachHang kh) {
        khList.add(kh);
        return "Them khach hang moi thanh cong";
    }
    
    public String update(int row, KhachHang kh) {
        khList.set(row, kh);
        return "Cap nhat thong tin khach hang thanh cong";
    }
    
    public ArrayList<KhachHang> write() {
        String file = "output.txt";
        
        ArrayList<KhachHang> files = new ArrayList<>();
        
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (KhachHang khachHang : khList) {
                bufferedWriter.write(khachHang.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Ghi thanh cong vao file: " + file);
        return files;
    }
    
    public ArrayList<KhachHang> read() {
        String file = "output.txt";
        
        ArrayList<KhachHang> files = new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                String ma = parts[0];
                String ten = parts[1];
                Integer namSinh = Integer.valueOf(parts[2]);
                String loai = parts[3];
                String gioiTinh = parts[4];
                
                KhachHang kh = new KhachHang(ma, ten, namSinh, loai, gioiTinh);
                files.add(kh);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Doc thanh cong file: " + file);
        return files;
    }
}
