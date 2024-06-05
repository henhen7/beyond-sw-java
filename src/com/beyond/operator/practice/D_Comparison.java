package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Comparison {
    /**
     * 비교 연산자
     *  [표현법]
     *  크기 비교: >, <, >=, <=
     *  동등 비교: ==, !=
     */
    public void compare() {
        int num1 = 10;
        int num2 = 25;
        boolean result = false;
        System.out.println("result = " + result);

        //result = num1 != num2; // true
        //result = num1 == num2; // false
        //result = num1 > num2; // false
        //result = num1 < num2; // true
        //result = 'A' == 65; // true
        //result = 3 == 3.0; // true

        //예외: 부동 소수점 방식은 오차가 생길 수 있기 때문에, 대부분 비교 연산에서는 정수 타입을 사용
        result = 0.1 == 0.1F; // false
        System.out.println("result = " + result);
    }

    public void comparePractice() {
        /**
         * 산술 연산 + 비교 연산
         * 사용자에게 입력받은 값은 짝수인지, 홀수인지 판단하기
         */
        int number = 0;
        boolean result = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 정수를 입력해 주세요. > ");
        number = scanner.nextInt();

        result = (number % 2) == 0;

        System.out.printf("%d는 짝수인가요? %b\n", number, result);

        scanner.close();
    }
}
