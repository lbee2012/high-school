package com.example.prac20203.prac1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Course {
    private Integer id;
    private String name;
    private String topic;
    private Integer coin;
}
