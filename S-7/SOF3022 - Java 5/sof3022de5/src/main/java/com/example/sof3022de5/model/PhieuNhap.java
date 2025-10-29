package com.example.sof3022de5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "phieu_nhap")
public class PhieuNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_phieu_nhap")
    private String maPhieuNhap;

    @Column(name = "ngay_nhap")
    private String ngayNhap;

    @Column(name = "nha_cung_cap")
    private String nhaCungCap;

    @Column(name = "tong_tien")
    private Double tongTien;

    @Column(name = "ghi_chu")
    private String ghiChu;
}
