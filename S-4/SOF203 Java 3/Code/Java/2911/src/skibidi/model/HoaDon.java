/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skibidi.model;

import java.util.Date;

/**
 *
 * @author longg
 */
public class HoaDon {
    public Integer MaHoaDon;
    public Date NgayLap;
    public Integer MaKhachHang;
    public Double TongTien;
    public String TrangThai;
    public String GhiChu;

    public HoaDon() {
    }

    public HoaDon(Integer MaHoaDon, Date NgayLap, Integer MaKhachHang, Double TongTien, String TrangThai, String GhiChu) {
        this.MaHoaDon = MaHoaDon;
        this.NgayLap = NgayLap;
        this.MaKhachHang = MaKhachHang;
        this.TongTien = TongTien;
        this.TrangThai = TrangThai;
        this.GhiChu = GhiChu;
    }

    public Integer getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(Integer MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public Integer getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(Integer MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}
