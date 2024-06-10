package com.beyond.enumeration;

import com.beyond.enumeration.practice.Week;

import java.util.Arrays;

public class EnumApplication {
    public static void main(String[] args) {
        Week today = Week.FRIDAY;
        //열거 상수에서 제공해 주는 메소드
        System.out.println(today.name());
        System.out.println(today.ordinal());
        System.out.println(today.equals(Week.SUNDAY));
        System.out.println(today.compareTo(Week.MONDAY));
        System.out.println();

        // 열거 타입에서 기본적으로 제공해 주는 정적 메소드
        System.out.println(Week.valueOf("MONDAY"));
        System.out.println(Arrays.toString(Week.values()));
        System.out.println();

        System.out.println(today.getName());
        System.out.println(today.getShortname());
        System.out.println();
    }
}
