/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n2509.service;

import java.util.ArrayList;
import n2509.model.KhachHang;

/**
 *
 * @author longsuwu
 */
public class QuanLyKhachHang {
    ArrayList<KhachHang> list = new ArrayList<>();
    
    public ArrayList<KhachHang> getList() {
        return list;
    }
    
    public QuanLyKhachHang() {
        list.add(new KhachHang("01", "Nguyen Van A", "Ha Noi", "Nam", 2007));
        list.add(new KhachHang("02", "Nguyen Van B", "Ha Noi", "Nam", 2008));
        list.add(new KhachHang("03", "Nguyen Van C", "Ha Noi", "Nam", 2009));
        list.add(new KhachHang("04", "Nguyen Van D", "Ha Noi", "Nam", 2010));
        list.add(new KhachHang("05", "Nguyen Van E", "Ha Noi", "Nam", 2011));
    }
    
    public String add(KhachHang kh) {
        list.add(kh);
        return "Them thanh cong";
    }
    
    public String delete(int row) {
        list.remove(row);
        return "Xoa thanh cong";
    }
    
    public String update(int row, KhachHang kh) {
        list.set(row, kh);
        return "Cap nhat thanh cong";
    }
}
