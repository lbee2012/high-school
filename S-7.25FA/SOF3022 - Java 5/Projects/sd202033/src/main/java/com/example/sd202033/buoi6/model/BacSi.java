package com.example.sd202033.buoi6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class BacSi {
    private Integer id;
    private String ten;
    private String diaChi;
    private Float luong;
    private Integer tuoi;
    private Boolean gioiTinh; //true:f, false:m
}
