package com.beyond.operator.practice;

import java.util.Scanner;

public class E_Logical {
    /**
     * 논리 연산자
     *  [표현법]
     *  &&(AND, 논리곱): 왼쪽, 오른쪽 피연산자 모두 true인 경우 참(true)
     *  ||(OR, 논리합): 왼쪽, 오른쪽 피연산자 중 하나라도 true이면 true
     */
    public void logical() {
        // 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인하기
        int number = 0;
        boolean result = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 정수를 입력해 주세요. > ");
        number = scanner.nextInt();

        result = (number >= 1) && (number <= 100);
        System.out.printf("%d는 1부터 100 사이의 값인가요? %b\n", number, result);
    }

    public void shortCut() {
        // Short Cut 연산 테스트
        int number = 10;
        boolean result = false;
        System.out.println("&& 연산 전 number의 값: " + number);
        // && 연산자를 기준으로 이미 false이므로, 굳이 뒷 연산을 수행하지 않음
        result = (number < 5) && (++number > 0);
        //result = (number < 5) & (++number > 0);
        System.out.println("&& 연산 후 number의 값: " + number);
        System.out.println();

        System.out.println("|| 연산 전 number의 값: " + number);
        // || 연산자를 기준으로 이미 true이므로, 굳이 뒷 연산을 수행하지 않음
        result = (number < 20) || (++number > 0);
        //result = (number < 20) | (++number > 0);
        System.out.println("result = " + result);
        System.out.println("|| 연산 후 number의 값: " + number);
    }

    /**
     * 실습 문제
     * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
     * 'A' ~ 'Z'는 코드값으로 65 ~ 90까지 숫자로 나열되어 있다.
     */
    public void practice() {
        Scanner scanner = new Scanner(System.in);

        char alp = 0;
        boolean result = false;

        System.out.println("알파벳을 입력해 주세요.");
        alp = scanner.nextLine().charAt(0);

        //result = (alp >= 65) && (alp <= 90);
        result = ((alp >= 'A') && (alp <= 'Z'));
        System.out.println("사용자가 입력한 값이 대문자입니까? " + result);
    }
}
