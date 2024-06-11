package com.beyond.field;

import com.beyond.field.practice.User;

public class FieldApplication {
    public static void main(String[] args) {
        User user = new User();

        /**
         * 접근 제한자 테스트
         *  - public: 어디서든 필드에 직접 접근이 가능하다.
         *  - default: 같은 패키지 내에서만 직접 접근이 가능하다.
         *  - private: 클래스 내에서만 직접 접근이 가능하다.
         */

        user.id = "kim123"; //객체의 값 임의로 변경 가능하다.
        System.out.println(user.id);

        com.beyond.field.User user2 = new com.beyond.field.User();
        user2.name = "김철수";
        System.out.println(user2.name);
        //System.out.println(user.password);

        //변수 구분 테스트
        user.test(100);
    }
}
