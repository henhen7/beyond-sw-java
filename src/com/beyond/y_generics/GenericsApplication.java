package com.beyond.y_generics;

import java.util.List;

import com.beyond.y_generics.practice.MyGenerics;

public class GenericsApplication {

    public static void main(String[] args) {
        String[] names = {"홍길동", "성춘향", "이몽룡", "김철수", "김영희"};
        Integer[] numbers = {1, 10, 100, 1000, 10000, 100000};
        Double[] dNumbers = {1.1, 10.1, 100.1, 1000.1, 10000.1, 100000.1};

//		MyGenerics generics = new MyGenerics(names);
//		MyGenerics generics = new MyGenerics(numbers);
//      MyGenerics generics = new MyGenerics(dNumbers);

        MyGenerics<String> generics = new MyGenerics<>(names);

        generics.T();
        System.out.println();

        List<String> list = generics.toList();

        System.out.println(list);
        System.out.println();
    }

}