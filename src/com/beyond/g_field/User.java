package com.beyond.g_field;

public class User {
    // 필드 선언
    public String id = "hong";
    private String password;
    String name = "홍길동";

    public void test(int number) { //매개변수
        /**
         * 1. 매개변수는 스택 영역에 생성될 때 함께 생성됨.
         *    실행흐름이 끝나면, 스택 영역이 소멸되면서 함께 소멸됨
         *    지역변수와 유사하다.
         * 2. 지역변수의 경우, 초기화가 필요하지만,
         *    매개변수의 경우 메소드를 호출할 때 값을 반드시 넘겨줘야 하므로
         *    매소드 내에서 초기화할 필요가 없다.
         * 3. 지역변수에는 접근 제한자를 붙이지 않는다.
         * 4. 매개변수도 지역변수로, 메소드 영역에서 사용 가능하다.
         */
        int num = 20; //지역변수

        System.out.println("num = " + num);
        System.out.println("number = " + number);

        /**
         * 필드는 클래스 전역에서 사용이 가능하다. (생성자, 메소드)
         * 필드가 초기화되지 않은 경우, 기본값으로 초기화
         */
        System.out.println("password = " + password);
    }
}
