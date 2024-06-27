package com.beyond.z_streamAPI.stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class H_Collect {
    /**
     * 수집
     *  - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
     */
    public void method1() {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 80, 80)
        );

        // List 컬렉션으로 수집
        List<Student> list = students.stream()
                .filter(student -> student.getGender().equals("남자"))
                .collect(Collectors.toList());

        list.stream().forEach(System.out::println);

        // Set 컬렉션으로 수집
        Set<Student> set = students.stream()
                .filter(student -> student.getGender().equals("남자"))
                .collect(Collectors.toSet());
        list.stream().forEach(System.out::println);

        // 학생들의 이름만 List 컬렉션으로 수집
//        List<String> names = students.stream()
//                .map((Student s) -> {
//                    return s.getName();
//                })
//                .collect(Collectors.toList());
        List<String> names = students.stream()
                        .map(Student::getName)
                        .collect(Collectors.toList());
        System.out.println(names);

        // Map 컬렉션으로 수집
        Map<String, Student> map = students.stream()
//                .collect(Collectors.toMap(s -> s.getName(), s -> s));
                .collect(Collectors.toMap(s -> s.getName(), Function.identity()));
        System.out.println(map);
    }
}
