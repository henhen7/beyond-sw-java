package com.beyond.b_operator.practice;

import java.util.Scanner;

public class G_Triple {
    /**
     * 삼항 연산자
     *  [표현법]
     *  조건식 ? 식1 : 식2
     */
    public void triple() {
        /**
         * 연습문제
         * 사용자에게 입력받은 정수가 양수인지, 음수인지 판별 후 출력하기
         * (예시) 정수값 입력 > 2
         * 2은(는) 양수이다.
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String result = "";

        System.out.print("정수값 입력 > ");
        num = scanner.nextInt();
        //result = (num > 0) ? "양수이다." : "음수이다.";
        result = (num > 0) ? "양수이다." : (num == 0) ? "0입니다." : "음수이다."; //삼항 연산자 중첩
        System.out.printf("%d은(는) %s", num, result);
    }

}
