package com.beyond.c_control.practice;

public class F_Continue {
    /**
     * continue문
     *  [표현법]
     *  반복문(조건식) {
     *      [continue;
     *  }
     */
    public void branchContinue() {
        // 구구단(2단 ~ 9단)을 출력하시오. (단, 홀수단을 빼고 출력)
        for (int i = 2; i <= 9; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.printf("=== %d단 ===\n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, (i * j));
            }
            System.out.println();
        }
    }
}
