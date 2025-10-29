package com.example.ontapcustom.de3.model;

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
@Table(name = "BenhNhan")

public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

    @Column(name = "chuan_doan")
    private String chuanDoan;

    @ManyToOne
    @JoinColumn(name = "id_bac_si", referencedColumnName = "id")
    private BacSi bs;
}
