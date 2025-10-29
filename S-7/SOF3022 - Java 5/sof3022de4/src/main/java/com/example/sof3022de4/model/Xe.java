package com.example.sof3022de4.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "xe")
public class Xe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "ma xe khong duoc de trong")
    @Column(name = "ma_xe")
    private String maXe;

    @NotBlank(message = "ten xe khong duoc de trong")
    @Column(name = "ten_xe")
    private String tenXe;

    @NotNull(message = "gia khong duoc de trong")
    @Column(name = "gia")
    private Double gia;

    @NotBlank(message = "date xe khong duoc de trong")
    @Column(name = "ngay_san_xuat")
    private String ngaySanXuat;

    @NotNull(message = "so cho ngoi khong duoc de trong")
    @Column(name = "so_cho_ngoi")
    private Integer soChoNgoi;

    @NotNull(message = "loai xe khong duoc de trong")
    @ManyToOne
    @JoinColumn(name = "id_loai_xe", referencedColumnName = "id")
    private LoaiXe lx;
}
