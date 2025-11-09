package com.example.botucsof3012.buoi4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "may_tinh")

public class MayTinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hang")
    private String hang;

    @Column(name = "ton_kho")
    private Integer tonKho;

    @Column(name = "bo_nho")
    private Float boNho;
}
