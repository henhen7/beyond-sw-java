package com.beyond.s_map.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Snack {
    private String name;
    private String flavor;
    private int calorie;
}
