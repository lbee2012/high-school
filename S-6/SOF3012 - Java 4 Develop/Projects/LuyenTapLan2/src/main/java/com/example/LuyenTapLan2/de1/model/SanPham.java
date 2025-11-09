package com.example.LuyenTapLan2.de1.model;

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
@Table(name = "san_pham")

public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_sp")
    private String tenSP;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "gia_ban")
    private Float giaBan;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "con_hang")
    private Boolean conHang;

    @ManyToOne
    @JoinColumn(name = "id_danh_muc", referencedColumnName = "id")
    private DanhMuc dm;
}
