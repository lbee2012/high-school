package com.example.sd2020333.recheck1.model;

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
@Table(name = "GauBong")

public class GauBong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "chieu_dai")
    private Float chieuDai;

    @Column(name = "chieu_cao")
    private Float chieuCao;

    @Column(name = "dep")
    private Boolean dep;
}
