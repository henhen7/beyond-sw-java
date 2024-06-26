package com.beyond.z_streamAPI.stream_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class C_Sorted {
    /**
     * 정렬
     *  - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 정렬해서
     *    최종 처리 순서를 변경할 수 있다.
     *  - IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다.
     *  - Stream<T>는 요소 객체가 Comparable 인터페이스를 구현해야 정렬할 수 있다.
     */
    public void method1() {
        // 오름차순으로 정렬
        IntStream.of(3, 5, 1, 4, 2)
                .sorted()
                .forEach(value -> System.out.print(value + " "));
        System.out.println();

        // 내림차순으로 정렬
        IntStream.of(3, 5, 1, 4, 2)
                .boxed() //boxing: 기본 타입의 요소를 객체 타입(스트림)으로 변환하여 리턴
                .sorted(Comparator.reverseOrder())
                .forEach(value -> System.out.print(value + " "));
    }

    public void method2() {
        List<String> names =
                Arrays.asList("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향", "홍길동", "변사또");

        // 오름차순 정렬
        names.stream()
                .distinct()
                .sorted()
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 내림차순 정렬
        names.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
    }

    public void method3() {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 80, 80)
        );

        students.stream()
                .sorted()
//                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .forEach(student -> System.out.println(student));
    }
}
