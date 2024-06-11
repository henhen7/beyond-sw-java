package com.beyond.j_statics;

import com.beyond.j_statics.practice.StaticField;
import com.beyond.j_statics.practice.StaticFinal;
import com.beyond.j_statics.practice.StaticMethod;

public class StaticApplication {
    public static void main(String[] args) {
        /**
         * 정적 필드 테스트
         */

        System.out.println(StaticField.number);

        StaticField staticField1 = new StaticField();
        StaticField staticField2 = new StaticField();
        System.out.println();

        StaticField.number++;
        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        System.out.println(StaticField.getMessage());
        StaticField.setMessage("메세지 변경");
        System.out.println(StaticField.getMessage());
        System.out.println();

        /**
         * 정적 메소드 테스트
         */
        // 1. 매개변수와 반환값이 없는 정적 메소드 호출
        //  - static 영역에 생성되므로, ++ 적용됨
        StaticMethod.method1();
        StaticMethod.method1();
        System.out.println();

        // 2. 매개변수가 없고 반환값이 있는 정적 메소드 호출
        System.out.println(StaticMethod.method2());

        // 3. 매개변수가 있고 반환값이 없는 정적 메소드 호출
        StaticMethod.method3(30);
        System.out.println();

        // 4. 매개변수가 있고 반환값도 있는 정적 메소드 호출
        System.out.println(StaticMethod.method4());
        System.out.println(StaticMethod.method4(8, 9));
        System.out.println(StaticMethod.method4(10, 15, 20, 40));
        System.out.println();

        /**
         * final 필드 테스트
         */
        StaticFinal staticFinal1 = new StaticFinal("남자");
        StaticFinal staticFinal2 = new StaticFinal("여자");

        System.out.println(staticFinal1.getGender());
        System.out.println(staticFinal2.getGender());
        System.out.println();

        //상수 테스트
        System.out.println(StaticFinal.MAX_LEVEL);
        System.out.println(Math.PI);
        System.out.printf("byte의 표현 범위는 %d ~ %d 입니다.\n", Byte.MIN_VALUE, Byte.MIN_VALUE);
        System.out.printf("int의 표현 범위는 %d ~ %d 입니다.\n", Integer.MIN_VALUE, Integer.MIN_VALUE);
        System.out.printf("char의 표현 범위는 %c ~ %c 입니다.\n", Character.MIN_VALUE, Character.MIN_VALUE);
        System.out.println();

        // final 키워드로 인해 값을 변경할 수 없다.
        //StaticFinal.MAX_LEVEL = 90;
    }
}
