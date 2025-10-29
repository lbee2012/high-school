package com.example.sof3022de4.model;

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
@Table(name = "loai_xe")

public class LoaiXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_loai_xe")
    private String maLoaiXe;

    @Column(name = "ten_loai_xe")
    private String tenLoaiXe;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "hang_san_xuat")
    private String hangSanXuat;

    @Column(name = "nam_ra_mat")
    private Integer namRaMat;
}
