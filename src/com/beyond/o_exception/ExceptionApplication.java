package com.beyond.o_exception;

import com.beyond.o_exception.practice.RuntimeException;
import com.beyond.o_exception.practice.Throws;
import com.beyond.o_exception.practice.TryCatch;

import java.io.IOException;

public class ExceptionApplication {
    public static void main(String[] args) {
        System.out.println("프로그램 실행");
        //new TryCatch().method1();

        // 4. method1로부터 전달받은 예외를 직접 처리
//        try {
//            new Throws().method1();
//        } catch (ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException 예외 발생");
//        } catch (IOException e) {
//            System.out.println("IOException 예외 발생");
//        }

        // *5. 메인 메소드에서도 예외를 처리하지 않고 던지는 경우,
        // jvm에서 예외를 전달받아 프로그램을 정상 종료하지 않고 오류가 발생한다.

        new RuntimeException().method1();
        System.out.println("프로그램 종료");
    }
}
