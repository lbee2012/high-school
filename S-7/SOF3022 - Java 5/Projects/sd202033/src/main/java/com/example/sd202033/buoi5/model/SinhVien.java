package com.example.sd202033.buoi5.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SinhVien {
    private Integer id;
    private String ten;
    private Float diem;
    private Boolean gioiTinh;
}
