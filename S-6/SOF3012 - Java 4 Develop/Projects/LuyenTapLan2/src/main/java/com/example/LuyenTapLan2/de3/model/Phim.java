package com.example.LuyenTapLan2.de3.model;

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
@Table(name = "phim")

public class Phim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_phim")
    private String tenPhim;

    @Column(name = "dao_dien")
    private String daoDien;

    @Column(name = "nam_phat_hanh")
    private Integer namPhatHanh;

    @Column(name = "dang_chieu")
    private Boolean dangChieu;

    @ManyToOne
    @JoinColumn(name = "id_the_loai", referencedColumnName = "id")
    private TheLoai tl;
}
