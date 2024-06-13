package com.beyond.o_exception.practice;

import java.io.IOException;

public class Throws {
    // 외부에서 method2, method3에 접근할 수 없고 method1에만 접근 가능하도록 생성
    public void method1() throws ClassNotFoundException, IOException {
        // 3. method2로부터 전달받은 예외를 다시 던짐
        // -> method1을 호출하는 ExceptionApplication에서 예외를 처리해야 함
        System.out.println("Throws.method1");
        method2();
        System.out.println("end.method1");
    }
    private void method2() throws ClassNotFoundException, IOException {
        // 2. method3 으로부터 전달받은 예외를 다시 던짐
        // -> method2를 호출하는 method1에서 예외를 처리해야 함
        System.out.println("Throws.method2");
        method3();
        System.out.println("end.method2");
    }
    private void method3() throws ClassNotFoundException, IOException {
        // 1. 메소드 호출 시 2개의 예외가 발생할 수 있도록 method3 생성
        //  throws 문을 사용하여 예외를 던져줌

        System.out.println("Throws.method3");

        int random = (int)(Math.random() * 3 + 1);
        if (random == 1) {
            throw new ClassNotFoundException();
        } else if (random == 2) {
            throw new IOException();
        }

        System.out.println("end.method3");

    }
}
