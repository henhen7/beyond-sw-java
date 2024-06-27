package com.beyond.z_streamAPI.stream_practice;

import java.util.Arrays;
import java.util.List;

public class F_Match {
    /**
     * 매치
     *  - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할을 한다.
     *  - allMatch(Predicate)
     *      : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
     *  - anyMatch(Predicate)
     *      : 최소한 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
     *  - noneMatch(Predicate)
     *      : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다.
     */
    public void method1() {
        boolean result = false;
        int[] numbers = {2, 4, 6};
        result = Arrays.stream(numbers).allMatch(value -> value % 2 == 0);
        System.out.println(result);
    }

    public void method2() {
        boolean result = false;
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 80, 80)
        );

        // 나이가 20살 이상인 학생들이 모두 남자인지 확인하시오.
        result = students.stream()
                .filter(s -> s.getAge() >= 20)
//                .peek(s -> System.out.println(s))
                .allMatch(s-> s.getGender().equals("남자"));
//                .filter((Student s) -> {
//                    return s.getAge() >= 20;
//                })
//                .peek((Student s) -> {
//                    System.out.println(s);
//                })
//                .allMatch((Student s) -> {
//                    return s.getGender().equals("남자");
//                });

        System.out.println(result);

        // 남학생들 중에 평균이 80점 이상인 학생이 한 명이라도 존재하는지 확인하시오.
        result = students.stream()
                .filter((Student s) -> {
                    return s.getGender().equals("남자");
                })
                .anyMatch((Student s) -> {
                    return (s.getMath() + s.getEnglish()) / 2 >= 80;
                });
        System.out.println(result);
    }

}
