package org.example;

public class SanPham {
    private String ma;
    private String ten;
    private Integer namBaoHanh;
    private Double gia;
    private Integer soLuong;
    private String danhMuc;

    public SanPham() {
    }

    public SanPham(String ma, String ten, Integer namBaoHanh, Double gia, Integer soLuong, String danhMuc) {
        this.ma = ma;
        this.ten = ten;
        this.namBaoHanh = namBaoHanh;
        this.gia = gia;
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
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

    public Integer getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(Integer namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
