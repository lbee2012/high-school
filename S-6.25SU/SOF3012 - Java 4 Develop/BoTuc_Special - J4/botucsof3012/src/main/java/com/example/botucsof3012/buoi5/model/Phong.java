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
@Table(name = "phong")

public class Phong {
//    id INT IDENTITY(1,1) PRIMARY KEY,
//    ten_phong NVARCHAR(100),
//    gia INT,
//    con_trong BIT,
//    khach_san_id INT FOREIGN KEY REFERENCES khach_san(id)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_phong")
    private String tenPhong;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "con_trong")
    private Boolean conTrong;

    @ManyToOne
    @JoinColumn(name = "khach_san_id", referencedColumnName = "id")
    private KhachSan khachSan;
}
