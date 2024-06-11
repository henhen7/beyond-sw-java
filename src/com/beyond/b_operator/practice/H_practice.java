package com.beyond.b_operator.practice;

import java.util.Scanner;

public class H_practice {

    public void practice01() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String result = "";

        System.out.println("정수값 입력");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        result = (num1 * num2) >= 100 ? "결과가 100 이상입니다." : "결과가 100보다 작습니다.";
        System.out.println(result);
    }
    public void practice02() {
        Scanner scanner = new Scanner(System.in);
        char alp = 0;
        String result = "";

        System.out.print("문자값 입력 > ");
        alp = scanner.nextLine().charAt(0);
        result = (alp >= 65) && (alp <= 90) ? "알파벳 대문자이다." : "알파벳 대문자가 아니다.";
        System.out.println(result);
    }
    public void practice03() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        char sign = 0;
        int result = 0;

        System.out.println("정수값 입력");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("연산자 입력");
        scanner.nextLine();
        sign = scanner.nextLine().charAt(0);

        result = (sign == '+') ? num1 + num2 : num1 - num2;

        System.out.println(((sign == '+') || (sign == '-')) ?
                (sign == '+') ? (num1 + " + " + num2 + " = " + result) : (num1 + " - " + num2 + " = " + result)
                : "잘못 입력했습니다.");

    }
}
