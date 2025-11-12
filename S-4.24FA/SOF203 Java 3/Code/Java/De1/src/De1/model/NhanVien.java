/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1.model;

import java.sql.*;
import java.util.Date;

/**
 *
 * @author longg
 */
public class NhanVien {
    public String ma;
    public String ten;
    public String sdt;
    public Boolean trangThai;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String sdt, Boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    
}
