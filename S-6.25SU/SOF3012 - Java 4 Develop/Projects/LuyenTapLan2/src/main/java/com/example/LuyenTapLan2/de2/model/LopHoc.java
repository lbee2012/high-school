package com.example.LuyenTapLan2.de2.model;

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
@Table(name = "lop_hoc")

public class LopHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_lop")
    private String tenLop;

    @Column(name = "so_luong_sv")
    private Integer soLuongSV;

    @Column(name = "thoi_luong")
    private Integer thoiLuong;

    @ManyToOne
    @JoinColumn(name = "id_giao_vien", referencedColumnName = "id")
    private GiaoVien gv;
}
