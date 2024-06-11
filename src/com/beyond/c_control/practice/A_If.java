package com.beyond.c_control.practice;

import java.util.Scanner;

public class A_If {
    /**
     * if문
     *  [표현법]
     *  if(조건식) {
     *      실행 코드;
     *  } else if (조건식) {
     *      실행 코드;
     *  } [else {
     *      실행 코드;
     *  }]
     */
    public void conditonIf() {
        // 사용자에게 입력받은 정수값이 홀수인지 짝수인지 판별하기
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 입력 > ");
        num = scanner.nextInt();
        scanner.nextLine();

        if ((num % 2) == 0) {
            System.out.printf("%d은(는) 짝수이다.\n", num);
        } else {
            System.out.printf("%d은(는) 홀수이다.\n", num);
        }

        // 사용자에게 이름을 받아서 "홍길동"이 맞는지 확인하기
        String name = "";
        System.out.print("이름 입력 > ");
        name = scanner.nextLine();

        if (name != null && name.equals("홍길동")) {
            System.out.printf("%s은(는) 홍길동이 맞습니다.\n", name);
        } else {
            System.out.printf("%s은(는) 홍길동이 아닙니다.\n", name);
        }

        // 사용자로부터 알파벳 하나를 입력받아 대문자인지 소문자인지 확인 후 출력
        char alp = '\u0000';
        System.out.print("알파벳 입력 > ");
        alp = scanner.nextLine().charAt(0);

        if (alp >= 'a' && alp <= 'z') {
            System.out.printf("%c은(는) 알파벳 소문자입니다.\n", alp);
        } else if (alp >= 'A' && alp <= 'Z') {
            System.out.printf("%c은(는) 알파벳 대문자입니다.\n", alp);
        } else {
            System.out.printf("%c은(는) 알파벳이 아닙니다.\n", alp);
        }

        // 연습 문제: 점수 0 ~ 100을 입력받아 등급을 출력
        int score = 0;
        String grade = "";
        System.out.print("점수 입력 > ");
        score = scanner.nextInt();

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.printf("당신의 점수는 %d점이고 등급은 %s입니다.\n", score, grade);

        /**
         * 참고
         * 리터럴로 작성되는 경우 비교 연산
         */
        // 1. 스택 영역에 str1 변수 생성, 힙 영역의 상수 풀에 "홍길동" 문자열 저장하고 주소값 배정 -> str1에 해당 주소값을 할당함
        String str1 = "홍길동";
        // 2. 힙 영역에 기존에 같은 문자열이 저장되어 있으므로, 해당 주소값을 str2에 할당
        String str2 = "홍길동";
        // 3. new String()을 통해 힙 영역에 새로 문자열을 저장하므로 새로운 주소값을 배정받고 할당
        String str3 = new String("홍길동");

        // 예시
        // 같은 주소값을 배정받았기 때문에 true 반환되는 경우
        System.out.println(str1 == str2);
        System.out.println("홍길동" == "홍길동");
        // 새로운 주소값을 할당받았으므로 false가 반환되는 경우
        System.out.println("홍길동" == new String("홍길동"));

        // equals 메소드: 내부적으로 데이터를 비교하여 같으면 true, 다르면 false
        System.out.println("홍길동".equals("홍길동"));
        System.out.println("홍길동".equals(new String("홍길동")));
        System.out.println("홍길동".equals(name));
    }
}