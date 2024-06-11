package com.beyond.i_method;

import com.beyond.i_method.practice.Member;
import com.beyond.i_method.practice.MethodTest;
import com.beyond.i_method.practice.Overloading;

public class MethodApplication {
    public static void main(String[] args) {
        MethodTest methodTest = new MethodTest();

        // 1. 매개변수와 반환값이 없는 메소드 호출
        methodTest.method1();
        System.out.println();

        // 2. 매개변수가 없고 반환값은 있는 메소드 호출
        String msg = methodTest.method2();
        System.out.println(msg);
        System.out.println();

        // 3. 매개변수가 있고 반환값은 없는 메소드 호출
        methodTest.method3(10, 20);
        System.out.println();

        // 4. 매개변수가 있고 반환값도 있는 메소드 호출
        System.out.printf("10 * 20 = %d\n", methodTest.method4(10, 20));
        System.out.println();

        // 5. 매개변수로 객체를 전달받는 메소드 호출
        Member member = new Member("홍길동", 24);
        System.out.println(member.information());

        methodTest.method5(member); //메소드 내에서 객체 정보 수정
        System.out.println(member.information());
        System.out.println();

        // 6. 매개변수로 가변 인자를 전달받는 메소드 호출
        //    1) 배열을 사용하는 메소드 호출
//        int[] array = {1, 4, 5};
//        System.out.println(methodTest.method6(array));
//        System.out.println(methodTest.method6(new int[] {1, 2, 3, 4, 5}));

        System.out.println(methodTest.method6(1, 2, 3));
        System.out.println(methodTest.method6(100, 200, 300, 400, 500));
        System.out.println(methodTest.method6());

        new Overloading().test(1, "a"); {
        }
    }
}
