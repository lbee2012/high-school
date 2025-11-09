package com.example.MayConChuotBeo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chuot_gaming")

public class ChuotBeo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "mat_doc")
    private String mat_doc;

    @Column(name = "gia")
    private Float gia;
}
