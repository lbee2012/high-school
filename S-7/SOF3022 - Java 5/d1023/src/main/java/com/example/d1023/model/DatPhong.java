package com.example.d1023.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dat_phong")

public class DatPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "ten khach khong duoc bo trong")
    @Column(name = "ten_khach_hang")
    private String tenKhachHang;

    @NotNull(message = "so dem dat p khong duoc bo trong")
    @Column(name = "so_dem_dat")
    private Integer soDemDat;

    @NotNull(message = "trang thai khong duoc bo trong")
    @Column(name = "trang_thai")
    private Boolean trangThai;

    @NotNull(message = "so phong khong duoc bo trong")
    @ManyToOne
    @JoinColumn(name = "id_phong", referencedColumnName = "id")
    private Phong p;
}
