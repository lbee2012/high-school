package com.example.botucsof3012.buoi5.model;

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
@Table(name = "khach_san")

public class KhachSan {
//    id INT IDENTITY(1,1) PRIMARY KEY,
//    ten_khach_san NVARCHAR(100),
//    dia_chi NVARCHAR(200)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_khach_san")
    private String tenKhachSan;

    @Column(name = "dia_chi")
    private String diaChi;
}
