package com.beyond.p_basicapi.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApi {
    /**
     * DateApi 클래스
     *  - 날짜를 표현하는 클래스이다.
     *  - 주로 객체 간에 날짜 정보를 주고 받을 때 사용한다.
     */
    public void method1() {
        // 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 객체를 생성한다.
        Date today = new Date();
        // 1970/1/1 00:00:00 기준 ms 단위로 표기
        Date when = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일(E) a hh시 mm분 ss초");

        System.out.println("today = " + today);
        System.out.println("when = " + when);
        System.out.println();

        System.out.println(today.getTime());
        System.out.println(today.getYear() + 1900);
        System.out.println(today.getMonth() + 1);
        System.out.println(today.getDate());
        System.out.println();

        System.out.println(sdf.format(today));
    }
}
