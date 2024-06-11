package com.beyond.h_constructor;

import com.beyond.h_constructor.practice.User;

public class ConstructorApplication {
    public static void main(String[] args) {
        User user;

        // 기본 생성자로 객체 생성
        user = new User();
        //System.out.println(user);

        /**
         * 메인 메소드에서 아래 코드 처리 절차
         * 1. user.information() 메소드 내부로 실행 흐름 변경
         * 2. information() 메소드에서 리턴드우측 값 반환
         * 3. 실행 흐름 메인 메소드로 이동
         * 4. 메인 메소드에서 전달 받은 결과값으로 println 실행
         */
        System.out.println(user.information());

        // 매개변수가 있는 생성자로 객체 생성 (3개의 값을 생성자로 전달)
        user = new User("hong", "1234", "홍길동");
        System.out.println(user.information());
        System.out.println();

        user = new User("seo", "0702", "서현지", 27, '여');
        System.out.println(user.information());
        System.out.println();
    }
}
