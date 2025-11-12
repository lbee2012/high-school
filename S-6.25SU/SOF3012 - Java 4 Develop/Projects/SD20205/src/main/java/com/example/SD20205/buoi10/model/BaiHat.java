package com.example.SD20205.buoi10.model;

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
@Table(name = "bai_hat")

public class BaiHat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_bai_hat")
    private String tenBaiHat;

    @Column(name = "thoi_luong")
    private Integer thoiLuong;

    @Column(name = "phat_hanh_chua")
    private Boolean phatHanhChua;

    @ManyToOne
    @JoinColumn(name = "ca_si_id", referencedColumnName = "id")
    private CaSi caSi;
}
