package com.beyond.v_assiststream.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {
    //직렬화 한 후 역직렬화 할 때 필드값들을 담아줄 때 사용하는 식별값
    private static final long serialVersionUID = 5228659731891958203L;

    private String id;
    private transient String password; //직렬화 제외
    private String name;
    private int age;
    private char gender;
    private double point;
}
