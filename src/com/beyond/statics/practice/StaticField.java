package com.beyond.statics.practice;

public class StaticField {
    /**
     * static 필드(정적 필드)
     *  - 프로그램 실행과 동시에 메모리에 생성되고, 객체들이 공유하면서 사용할 목적으로 선언
     *  - 프로그램이 실행될 때 해당 클래스가 로드되면서 메모리에 생성되고,
     *    프로그램이 종료될 때 소멸된다.
     */
    public static int number = 2;

    public static String message = "StaticField에 선언된 정적 필드입니다.";

    // static 필드에 대한 Getter, Setter 메소드 또한 static 키워드가 붙어야 한다.
    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        StaticField.message = message;
    }

}
