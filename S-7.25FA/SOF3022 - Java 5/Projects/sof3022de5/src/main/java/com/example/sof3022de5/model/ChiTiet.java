package com.example.sof3022de5.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "phieu_nhap_chi_tiet")
public class ChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "ten sp khong duoc de trong")
    @Column(name = "ten_san_pham")
    private String tenSanPham;

    @NotNull(message = "so luong khong duoc de trong")
    @Column(name = "so_luong")
    private Integer soLuong;

    @NotNull(message = "gia nhap khong duoc de trong")
    @Range(min = 100, message = "gia nhap phai lon hon 100")
    @Column(name = "gia_nhap")
    private Double giaNhap;

    @NotBlank(message = "ngay san xuat khong duoc de trong")
    @Column(name = "ngay_san_xuat")
    private String ngaySanXuat;

    @NotNull(message = "phieu nhap khong duoc de trong")
    @ManyToOne
    @JoinColumn(name = "id_phieu_nhap", referencedColumnName = "id")
    private PhieuNhap pn;
}
