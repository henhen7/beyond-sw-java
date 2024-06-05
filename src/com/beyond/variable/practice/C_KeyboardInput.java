package com.beyond.variable.practice;

import java.util.Scanner;

public class C_KeyboardInput {
    public void inputByScanner() {
        /**
         * Scanner 클래스
         * - 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다.
         */
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        float height = 0;
        String name = null;
        char gender = '\u0000';

        System.out.println("당신의 이름은 무엇입니까?");
        name = scanner.nextLine();
        System.out.println("당신의 나이는 몇 살입니까?");
        age = scanner.nextInt();
        System.out.println("당신의 키는 몇 입니까?(소수점 첫째 자리까지 입력하세요.)");
        height = scanner.nextFloat();

        //int, float의 경우 사용 후 버퍼를 비울 때 Enter 값까지 비우지 않아 IndexOutOfBoundsException 발생
        scanner.nextLine();

        System.out.println("당신의 성별은 무엇입니까? (남/여)");
        gender = scanner.nextLine().charAt(0);

        System.out.printf("당신의 이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c 입니다.", name, age, height, gender);
    }
}
