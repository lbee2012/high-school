package com.example.sof3022deevent.model;

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
@Table(name = "su_kien")
public class SuKien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_su_kien")
    private String maSuKien;

    @Column(name = "ten_su_kien")
    private String tenSuKien;

    @Column(name = "ngay_to_chuc")
    private String ngayToChuc;

    @Column(name = "dia_diem")
    private String diaDiem;

    @Column(name = "so_cho_toi_da")
    private Integer soChoToiDa;

    @Column(name = "mo_ta")
    private String moTa;
}
