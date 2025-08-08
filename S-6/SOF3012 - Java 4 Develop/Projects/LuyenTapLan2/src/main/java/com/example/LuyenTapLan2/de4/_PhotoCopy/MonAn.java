package com.example.LuyenTapLan2.de4.model;

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
@Table(name = "mon_an")

public class MonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_mon_an")
    private String tenMonAn;

    @Column(name = "loai_mon")
    private String loaiMon;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "con_phuc_vu")
    private Boolean conPhucVu;

    @ManyToOne
    @JoinColumn(name = "nha_hang_id", referencedColumnName = "id")
    private NhaHang nh;
}
