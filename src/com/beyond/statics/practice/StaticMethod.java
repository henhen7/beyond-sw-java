package com.beyond.statics.practice;

public class StaticMethod {
    private static int num1 = 10;
    private static int num2 = 20;
    private int num3 = 30;
    /**
     * Static 메소드(정적 메소드)
     *  1. 매개변수와 반환값이 없는 정적 메소드
     *  2. 매개변수가 없고 반환값이 있는 정적 메소드
     *  3. 매개변수가 있고 반환값이 없는 정적 메소드
     *  4. 매개변수가 있고 반환값도 있는 정적 메소드
     */

    //1.
    public static void method1() {
        System.out.println(num1 + num2 ++);
        // 정적 메소드에서 필드에 접근할 수 없다.
        // 정적 메소드는 객체를 생성하지 않고 사용하기 때문에 필드에 접근 할 수 없다.
        // System.out.println(num3);
    }

    //2.
    public static int method2() {
        // 지역변수가 존재하는 경우, 지역변수 우선
        int num1 = 1;
        int num2 = 2;

        // 직접 경로 지정하여 static 필드로 리턴하도록 함
        return StaticMethod.num1 + StaticMethod.num2;
    }

    //3.
    public static void method3(int num3) {
        System.out.println(StaticMethod.method2() + num3);
    }

    //4.
    public static int method4(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
