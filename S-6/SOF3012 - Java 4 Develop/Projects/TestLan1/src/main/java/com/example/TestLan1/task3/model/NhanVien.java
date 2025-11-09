package com.example.TestLan1.task3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nhan_vien")

public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_nhan_vien")
    private String tenNhanVien;

    @Column(name = "ngaySinh")
    private String ngaySinh;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

    @Column(name = "luong")
    private Float luong;

    @ManyToOne
    @JoinColumn(name = "ma_phong_ban", referencedColumnName = "id")
    private PhongBan phongBan;
}
