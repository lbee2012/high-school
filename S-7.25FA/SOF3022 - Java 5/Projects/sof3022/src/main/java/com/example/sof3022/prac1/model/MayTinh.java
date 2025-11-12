package com.example.sof3022.prac1.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class MayTinh {
    private Integer id;
    private String hang;
    private Boolean cpu;
    private Boolean gpu;
}
