package com.beyond.o_exception.practice;

import java.util.Scanner;

public class RuntimeException {
    public void method1() {
        // UncheckedException(RuntimeException)이 발생하도록 메소드 생성
        // - ArrayIndexOutofBoundsException, NegativeArraySizeException
        // - 코드 수정, 조건문 등을 활용하여 해결할 수 있다.
        int size = 0;
        int[] numbers = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 길이 > ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("0보다 큰 값을 입력해 주세요.");
            return;
        }

        numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


}
