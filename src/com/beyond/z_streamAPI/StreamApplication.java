package com.beyond.z_streamAPI;


import com.beyond.z_streamAPI.stream_practice.D_Mapping;

public class StreamApplication {
    /**
     * Stream API
     *  - 스트림은 자바 8부터 추가된 기능으로 컬렉션(배열)의 저장된 요소들을
     *    하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자이다.
     *  - 스트림은 람다식으로 요소 처리 코드를 제공할 수 있고, 내부 반복자를 사용해서
     *    병렬 처리, 중간 처리, 최종 처리 작업을 수행할 수 있다.
     *    (1) 중간 처리: 반복, 매핑(타입 변환), 필터링, 정렬 등을 수행한다.
     *    (2) 최종 처리: 반복, 카운팅, 평균, 총합 등의 집계 처리를 수행한다.
     *  - 중간 처리 메소드와 최종 처리 메소드는 리턴 타입을 통해 구분 가능하다.
     *    (1) 리턴 타입이 Stream: 중간 처리 메소드
     *    (2) 리턴 타입이 기본 타입이거나, Optional 객체: 최종 처리 메소드
     */
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 3, 5, 7);
//
//        list.forEach(i -> {
//            System.out.println(i);
//        });
//        // 스트림 생성
//        new A_Create().method3();
//        // 중간 처리 메소드
//        new B_Filtering().method2();
//        // Sorted 메소드
//        new C_Sorted().method3();
        // Map 메소드
        new D_Mapping().method2();
    }
}
