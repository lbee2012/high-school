package com.example.ThiLan1.TH03115.model;

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
@Table(name = "cap_sach")

public class CapSach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_cap_sach")
    private String tenCapSach;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_ngan")
    private Integer soNgan;

    @Column(name = "trong_luong")
    private Float trongLuong;

    @Column(name = "laptop")
    private Boolean laptop;
}
