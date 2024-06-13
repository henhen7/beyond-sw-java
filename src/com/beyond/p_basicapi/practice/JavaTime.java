package com.beyond.p_basicapi.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTime {
    /**
     * java.time 패키지
     *  - 자바 1.8부터는 날짜와 시간을 나타내는 java.time 패키지를 제공한다.
     */
    public void method1() {
        // 날짜와 시간 정보를 모두 저장할 수 있다.
        // 현재 날짜와 시간 정보를 저장한 객체를 생성한다.
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime when = LocalDateTime.of(2024, 6, 13, 18, 00, 00);

        System.out.println("now = " + now);
        System.out.println("when = " + when);
        System.out.println(ZonedDateTime.now());
        System.out.println();

        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println();

        // 날짜와 시간을 조작하기
        //LocalDateTime plusDays = now.plusDays(1);
        LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(2);
        LocalDateTime minusMonths = now.minusMonths(2);

        System.out.println(now);
        System.out.println(plusDays);
        System.out.println(minusMonths);
        System.out.println();

        System.out.println(now.isAfter(plusDays));
        System.out.println(now.isBefore(plusDays));
        System.out.println(now.isEqual(plusDays));
        System.out.println(now.isAfter(minusMonths));
        System.out.println(now.isBefore(minusMonths));
        System.out.println();

        // 날짜 정보를 저장할 수 있다.
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2022, 5, 25);
        LocalDate localDate3 = now.toLocalDate();
        LocalDate localDate4 = LocalDate.parse("2024-05-25");
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(now);
        System.out.println(localDate3);
        System.out.println(localDate4);
        System.out.println();

        // 시간 정보를 저장할 수 있다.
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(18, 30, 30);
        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println();

        // DateTimeFormatter 사용
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");

        System.out.println(now);
        System.out.println(now.format(dateTimeFormatter));
        System.out.println();

        System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
    }
}
