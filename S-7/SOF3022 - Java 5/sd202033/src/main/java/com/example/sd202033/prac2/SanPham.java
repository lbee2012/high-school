package com.example.sd202033.prac2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SanPham {
    private Integer id;

    private String ten;

    private String loai;

    private Integer soLuong;

    private Boolean conHang;
}
