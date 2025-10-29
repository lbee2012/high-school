package com.example.ontapcustom2.de1.model;

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
@Table(name = "PhieuMuon")

public class PhieuMuon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Ma phieu la gi brother?")
    @Column(name = "ma_phieu")
    private String maPhieu;

    @NotBlank(message = "Ngay muon la ngay may?")
    @Column(name = "ngay_muon")
    private String ngayMuon;

    @NotBlank(message = "Ten sach la gi brother?")
    @Column(name = "ten_sach")
    private String tenSach;

    @NotNull(message = "So ngay muon la bao nhieu?")
    @Range(min = 1, max = 7, message = "Chi duoc muon duoi 7 ngay")
    @Column(name = "so_ngay_muon")
    private Integer soNgayMuon;

    @NotNull(message = "Ai la ke muon sach?")
    @ManyToOne
    @JoinColumn(name = "id_doc_gia", referencedColumnName = "id")
    private DocGia dg;
}
