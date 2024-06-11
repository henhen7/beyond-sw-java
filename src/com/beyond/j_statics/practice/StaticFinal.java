package com.beyond.j_statics.practice;

public class StaticFinal {
    /**
     * final 필드를 초기화하는 방법
     *  1. 선언 시 명시적으로 지정
//   private final String gender = "남자";
     *  2. 생성자를 통해서 지정하는 방법
     */
    private final String gender;

    public StaticFinal(String gender) {
        this.gender = gender;
    }

    // final 필드에 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없다.
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getGender() {
        return this.gender;
    }

    /**
     * static final(상수) 선언
     */
    public static final int MAX_LEVEL = 30;
}
