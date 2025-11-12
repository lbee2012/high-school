package com.example.Demo.buoi3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SanPham {
    private Integer id;
    private String maSP;
    private String tenSP;
    private Float gia;
    private String kichThuoc;
    private Integer soLuong;
}
