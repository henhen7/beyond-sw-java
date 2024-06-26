package com.beyond.z_streamAPI.lambda_practice.functional;

@FunctionalInterface
public interface A_FunctionalInterface {
    // 매개변수, 반환값이 없는 추상 메소드
    // 여러 개의 추상 메소드가 들어가는 경우 함수적 인터페이스가 아니다.
    void method();
    //void otherMethod();
}
