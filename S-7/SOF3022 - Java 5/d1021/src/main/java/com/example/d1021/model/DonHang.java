package com.example.d1021.model;

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
@Table(name = "don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "NOT OK")
    @Column(name = "ten_khach_hang")
    private String tenKhachHang;

    @NotNull(message = "NOT OK")
    @Column(name = "so_luong_dat")
    private Integer soLuongDat;

    @NotNull(message = "NOT OK")
    @Column(name = "trang_thai")
    private Boolean trangThai;

    @NotNull(message = "NOT OK")
    @ManyToOne
    @JoinColumn(name = "id_san_pham", referencedColumnName = "id")
    private SanPham sp;
}
