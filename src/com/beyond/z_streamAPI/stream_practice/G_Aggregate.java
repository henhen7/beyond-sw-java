package com.beyond.z_streamAPI.stream_practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class G_Aggregate {
    /**
     * 집계
     *  - 최종 처리 기능으로 요소들의 개수, 합계, 평균값, 최대값, 최소값 등과 같이
     *    하나의 값으로 산출되는 역할을 한다.
     *  - count()
     *  - sum()
     *  - average()
     *  - max()
     *  - min()
     *  - findFirst()
     */
    public void method1() {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // 2의 배수의 개수
        long count = Arrays.stream(numbers).filter(value -> value % 2 == 0).count();
        System.out.println(count);

        // 2의 배수의 합계
        int sum = Arrays.stream(numbers).filter(value -> value % 2 == 0).sum();
        System.out.println(sum);

        // 2의 배수의 평균
        OptionalDouble average = Arrays.stream(numbers).filter(value -> value % 2 == 0).average();
        System.out.println(average);

//        Optional 객체에 저장된 값을 가져온다.
//        값의 존재 여부를 확인하고 Optional 객체에서 값을 가져온다.
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        } else {
            System.out.println(0);
        }

        // 집계 값을 처리하는 Consumer를 등록한다. (값이 존재해야 실행된다.)
        average.ifPresent((double d) -> {
            System.out.println(d);
        });

        // 2의 배수의 최솟값
        OptionalInt min = Arrays.stream(numbers).filter(value -> value % 2 == 0).min();
        System.out.println(min.orElse(0));

        // 2의 배수의 최댓값
        OptionalInt max = Arrays.stream(numbers).filter(value -> value % 2 == 0).max();
        System.out.println(max.orElse(0));

        // 2의 배수의 첫번째 요소
        OptionalInt first = Arrays.stream(numbers).filter(value -> value % 2 == 0).findFirst();
        System.out.println(first.orElse(0));

        // 2의 배수의 곱
        Arrays.stream(numbers)
                .filter(value -> value % 2 == 0)
                .reduce((left, right) -> left * right)
                .ifPresent(result -> System.out.println(result));

    }
}
