package com.beyond.i_method.practice;

public class MethodTest {
    /**
     * 1. 매개변수가 없고 반환값도 없는 메소드
     * 2. 매개변수가 없고 반환값은 있는 메소드
     * 3. 매개변수가 있고 반환값은 없는 메소드
     * 4. 매개변수가 있고 반환값도 있는 메소드
     * 5. 매개변수로 객체를 전달받는 메소드
     * 6. 매개변수로 가변 인자를 전달받는 메소드
     */

    // 1. 어떤 값도 반환하지 않고 메소드 내용만 수행 후 종료된다.
    public void method1() {
        System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
//        return "hello"; //return 뒤에 반환값이 오면 에러가 발생한다.
        return; //반환값 없이 사용은 가능하다.
//        System.out.println("리턴 후 실행"); //리턴된 메소드이므로 실행 불가능, 에러 발생
    }

    // 2.
    public String method2() {
        String str = null;
        str = "매개변수는 없지만 반환값이 있는 메소드입니다.";
        return str;
    }

    // 3.
    public void method3(int num1, int num2) {
        System.out.println("매개변수는 있고 반환값이 없는 메소드입니다.");
        System.out.println("입력받은 매개변수의 합: " + (num1 + num2));
    }

    // 4.
    public int method4(int num1, int num2) {
        System.out.println("매개변수가 있고 반환값도 있는 메소드입니다.");
        int result = 0;
        result = num1 * num2;
        return result;
    }

    // 5.
    public void method5(Member member) {
        System.out.println("매개변수로 객체를 전달받는 메소드입니다.");
        member.setName("이몽룡");
        member.setAge(22);
    }


    // 6.1. 배열을 사용하는 방법
    //public int method6(int[] numbers) {
    // 6.2. 가변 인자를 사용하는 방법(자바 1.5부터 지원)
    //  - 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.
    //  - 가변 인자는 항상 매개변수 마지막에 있어야 한다.
    public int method6(int... numbers) {
        System.out.println("매개변수로 가변 인자를 전달받는 메소드입니다.");
        int sum = 0;

        for (int value : numbers) {
            sum += value;
        }

        return sum;
    }

}
