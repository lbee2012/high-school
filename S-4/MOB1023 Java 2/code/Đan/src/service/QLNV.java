/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author TheDan
 */
public class QLNV {
    ArrayList<NhanVien>list = new ArrayList<>();

    public QLNV() {
        list.add(new NhanVien("NV1", "Dan", 19, "Dantqt12@gmail.com", 12000000));
        list.add(new NhanVien("NV2", "Ha Anh", 18, "Anhph12@gmail.com", 10000000));
        list.add(new NhanVien("NV3", "Khanh Minh", 20, "Minhnk10@gmail.com", 15000000));
        list.add(new NhanVien("NV4", "A Long", 24, "Longhqa12@gmail.com", 20000000));
        list.add(new NhanVien("NV5", "Giap", 27, "Giapnv03@gmail.com", 50000000));
    }
    
    public ArrayList<NhanVien>getlist(){
        return list;
    }
    
    public String them(NhanVien nv){
        list.add(nv);
        return "Them thanh cong";
    }
    
    public String save(int viTri, NhanVien nv){
        list.set(viTri, nv);
        return "Luu thanh cong";
    }
    
    public String delete(String id){
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(id)) {
                list.remove(nv);
                return "Xoa thanh cong: " +id;
            }
        }
        return "Khong tim thay nhan vien co ma : "+id;
    }
    
    public String find(String id){
        
        return "Tim kiem thanh cong";
    }
    
    public String layThongTin(int row){       
            return "Record: " + (row + 1) + " of " + list.size();     
    }
    
    public ArrayList<NhanVien>docFile(){
        String path = "outputtxt";
        
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(",\\s*");
                String id = parts[0];
                String hoTen = parts[1];
                Integer tuoi = Integer.valueOf(parts[2]);
                String email = parts[3];
                Integer luong = Integer.valueOf(parts[4]);
                
                NhanVien nv = new NhanVien(email, hoTen, tuoi, email, luong);
                list.add(nv);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: "+e.getMessage());
        }
        return list;
    }
    
    
    
}
