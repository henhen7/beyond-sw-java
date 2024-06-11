package com.beyond.b_operator.practice;

public class B_InDecrease {
    /**
     * 증감 연산자
     *  [표현법]
     *  전위 연산: (증감 연산자)피연산자;
     *  후위 연산: 피연산자(증감 연산자);
     *  ++: 피연산자의 값을 1 증가시키는 연산자
     *  --: 피연산자의 값을 1 감소시키는 연산자
     */
    public void inDecrease() {
        int number = 10;

        // 전위 연산 테스트
        System.out.println("전위 연산 적용 전 number의 값: " + number);
        System.out.println("1회 수행 후 number의 값: " + (++number));
        System.out.println("2회 수행 후 number의 값: " + (++number));
        System.out.println("3회 수행 후 number의 값: " + (++number));
        System.out.println("전위 연산 적용 후 number의 값: " + number);

        // 후위 연산 테스트
        System.out.println("후위 연산 적용 전 number의 값: " + number);
        System.out.println("1회 수행 후 number의 값: " + (number--));
        System.out.println("2회 수행 후 number의 값: " + (number--));
        System.out.println("3회 수행 후 number의 값: " + (number--));
        System.out.println("후위 연산 적용 후 number의 값: " + number);

    }

    public void inDecreasePractice() {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        System.out.println(number1++); // 10(11)
        System.out.println((++number1) + (number2++)); // 12 + 20(21) = 32
        System.out.println((number1++) + (--number2) + (--number3)); // 12(13) + 20 + 29 = 61

        System.out.println();

        System.out.println("number1 = " + number1); // 13
        System.out.println("number2 = " + number2); // 20
        System.out.println("number3 = " + number3); // 29
    }
}
