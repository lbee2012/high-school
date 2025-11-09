package com.example.LuyenTapLan3.de2.model;

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
@Table(name = "nha")

public class Nha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "loai_nha")
    private String loaiNha;

    @Column(name = "gia_tien")
    private Float giaTien;

    @ManyToOne
    @JoinColumn(name = "chu_nha_id", referencedColumnName = "id")
    private ChuNha cn;
}
