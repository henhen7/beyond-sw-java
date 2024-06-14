package com.beyond.s_map.practice;

import java.util.*;

public class A_HashMap {
    public void method1() {
        Map<String, Snack> map = new TreeMap<>();

        map.put("다이제", new Snack("다이제", "초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸", "바나나맛", 250));
        map.put("프링글스", new Snack("프링글스", "어니언맛", 500));
        map.put("프링글스", new Snack("프링글스", "솔트맛", 400));
        map.put("먹태깡", new Snack("먹태깡", "청양마요", 300));
        map.put("초코파이", new Snack("초코파이", "오리지널", 200));
        map.put("초코파이", new Snack("초코파이", "바나나맛", 200));

        System.out.println(map);
        System.out.println();

        // 키값에 해당하는 entry 객체를 얻어오는 메소드
        Snack snack = map.get("다이제");
        System.out.println(snack);
        System.out.println(map.size());

        // 키값에 해당하는 entry 객체를 삭제하는 메소드
        map.remove("먹태깡");
        System.out.println(map);
        System.out.println(map.size());

        // 모든 entry 객체를 삭제하는 메소드
        map.clear();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }

    public void method2() {
        Map<String, Snack> map = new HashMap<>();

        map.put("다이제", new Snack("다이제", "초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸", "바나나맛", 250));
        map.put("프링글스", new Snack("프링글스", "어니언맛", 500));
        map.put("먹태깡", new Snack("먹태깡", "청양마요", 300));
        map.put("초코파이", new Snack("초코파이", "오리지널", 200));

        // Map은 인덱스의 개념이 없어서 반복문을 적용할 수 없음
//        for (int i = 0; i < map.size(); i++) {
//        }

        // Map은 Iterable 인터페이스를 구현하지 않아 향상된 for 문을 사용할 수 없다.
//        for (Map.Entry<String, Snack> snack : map) {
//        }

        // List와 Map은 구조가 달라서 ArrayList에 담아 사용할 수 없다.
//        new ArrayList<map> ();

        /**
         * 1. KeySet() 메소드를 이용하는 방법
         *  - Map 컬렉션에 있는 키값들만 Set 컬렉션에 담아서 반환한다.
         */
        Set<String> set = map.keySet();

        for (String key : set) {
            System.out.printf("key: %s, value: %s\n", key, map.get(key));
        }
        System.out.println();

        /**
         * 2. entrySet() 메소드를 이용하는 방법
         *  - Map 컬렉션에 있는 Entry 객체(키-값 쌍)를 set 컬렉션에 담아서 반환한다.
         */
        Set<Map.Entry<String, Snack>> entrySet = map.entrySet();

        for (Map.Entry<String, Snack> entry : entrySet) {
            System.out.printf("key: %s, value: %s\n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }
}
