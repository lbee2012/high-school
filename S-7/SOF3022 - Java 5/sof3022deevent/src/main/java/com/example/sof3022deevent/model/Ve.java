package com.example.sof3022deevent.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ve")
public class Ve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "khach hang khong duoc trong")
    @Column(name = "khach_hang")
    private String khachHang;

    @NotNull(message = "so luong khong duoc trong")
    @Range(min = 1, max = 10, message = "so luong trong khoang 1 - 10")
    @Column(name = "so_luong")
    private Integer soLuong;

    @NotNull(message = "gia ve khong duoc trong")
    @Range(min = 10000, message = "gia ve re nhat tu 10.000")
    @Column(name = "gia_ve")
    private Double giaVe;

    @NotNull(message = "ngay mua khong duoc trong")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "ngay_mua")
    private LocalDate ngayMua;

    @NotNull(message = "su kien khong duoc trong")
    @ManyToOne
    @JoinColumn(name = "id_su_kien", referencedColumnName = "id")
    private SuKien sk;
}
