package com.beyond.c_control.practice;

import java.util.Scanner;

public class C_For {
    /**
     * for문
     *  [표현법]
     *  for(초기식; 조건식; 증감식) {
     *      실행 코드
     *  }
     */
    public void repetitiveFor() {
        // 1부터 10까지 정수들의 합계 출력
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println("합계 = " + sum);

        // 1부터 랜덤값(1 ~ 10)까지 합계 출력
        // java.lang.Math 클래스에서 제공하는 random() 메소드를 이용하여 랜덤값 발생 가능(0 ~ 1 사이)
        double random = 0;
        int sum2 = 0;
        for (int i = 0; i <= 10; i++){
            random = Math.random() * 10;
            sum2 += random;

        }
        System.out.println("합계 = " + sum2);
    }

    /**
     * 연습 문제
     * 1부터 사용자가 입력한 수까지의 합계를 구하시오.
     * 예시 )
     * 정수 > 10
     * 총 합계: 55
     */
    public void practice1() {
        int num = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 > ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.printf("총 합계: %d", sum);
    }

    /**
     * 연습 문제
     * 구구단 출력
     */
    public void practice2() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
                System.out.printf("%d * %d = %d\n", i, j, (i * j));
            System.out.println();
        }
    }
}
