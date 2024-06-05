package com.beyond.operator.practice;

public class C_Arithmetic {
    /**
     * 산술 연산자
     *  +, -, *, /, %
     */
    public void math() {
        // 정수의 산술 연산
        int num1 = 10;
        int num2 = 3;

        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
        System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));

        // 문자의 산술 연산
        // 문자값의 경우 유니코드 값을 기준으로 연산
        System.out.println((char)('서' + 1));
        System.out.println('a' + 'b');

        // 실수의 산술 연산
        double dNum1 = 35.0;
        double dNum2 = 10.0;

        System.out.printf("%.1f + %.1f = %.1f\n", dNum1, dNum2, (dNum1 + dNum2));
        System.out.printf("%.1f - %.1f = %.1f\n", dNum1, dNum2, (dNum1 - dNum2));
        System.out.printf("%.1f * %.1f = %.1f\n", dNum1, dNum2, (dNum1 * dNum2));
        System.out.printf("%.1f / %.1f = %.1f\n", dNum1, dNum2, (dNum1 / dNum2));
        System.out.printf("%.1f %% %.1f = %.1f\n", dNum1, dNum2, (dNum1 % dNum2));

        // 참고
        //System.out.println(5 / 0); // 어떤 수를 0으로 나누려고 하는 경우, ArithmeticException 오류 발생
        System.out.println(5 / 0.0); // 어떤 수를 0.0으로 나누는 경우, Infinity(오류가 발생하지 않음)
        //System.out.println(5 % 0); // 어떤 수를 0으로 나눈 나머지를 구하는 경우, ArithmeticException 오류 발생
        System.out.println(5 % 0.0); // 어떤 수를 0.0으로 나눈 나머지를 구하는 경우, NaN(Not a Number)

        System.out.println(Double.isInfinite((5 / 0.0) + 2)); // Infinity
        System.out.println(Double.isNaN((5 % 0.0) + 2)); // NaN
    }
}
