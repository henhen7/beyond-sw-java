package com.beyond.z_streamAPI;

public class LambdaApplication {
//    public static void main(String[] args) {
        /**
         * 람다식(Lambda Expressions)
         *  - 자바에서 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원한다.
         *  - 람다식은 매개변수를 가지는 함수와 같은 코드 블록이지만,
         *    런타임시에는 인터페이스의 익명 구현 객체를 생성한다.
         *
         *  [표현법]
         *    ([자료형 변수, ...]) -> {
         *       //실행 코드
         *
         *      [return 반환값;]
         *    }
         *
         *  예시(1)
         *    (int a) -> {
         *      System.out.println(a);
         *    }
         *   (a) -> { System.out.println(a) };
         *   a -> System.out.println(a);
         *   () -> { ... }
         *   (a, b) -> { return a + b; }
         *   (a, b) -> a + b;
         *
         * 함수적 인터페이스
         *  - 하나의 추상 메소드가 선언된 인터페이스만 람다식으로 구현 객체를 만들 수 있는데,
         *    이러한 인터페이스를 함수적 인터페이스라고 한다.
         *  - 함수적 인터페이스를 선언할 때 @FunctionalInterface 어노테이션을 붙이면
         *    두 개 이상의 추상 메소드가 선언되지 않도록 컴파일러가 체크해 준다.
         *
         * 표준 함수적 인터페이스
         *  - 자바 8부터 빈번하게 사용되는 함수적 인터페이스는 java.util.function 표준 API 패키지로 제공된다.
         *  - 자바 8부터 추가되거나 변경된 API는 이 표준 함수적 인터페이스들을 매개 타입으로 많이 사용한다.
         *  - 표준 함수적 인터페이스는 용도에 따라 Consumer, Supplier, Function, Operator, Predicate로 구분된다.
         */
        //new A_Lambda().method1();
//        new B_Functional().method1();
//        new B_Functional().method2();
//        new B_Functional().method3();
//        new B_Functional().method4(3);
//        new C_Consumer().method1();
//        new D_Supplier().method1();
//        new E_Function().method1();
//        new F_Operator().method1();
//    }
}
