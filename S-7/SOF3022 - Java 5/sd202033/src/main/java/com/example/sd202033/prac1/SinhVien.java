package com.example.sd202033.prac1;

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
    private Integer tuoi;
    private Boolean gioiTinh;
    private String lop;
    private String mssv;
}
