package com.beyond.b_operator.practice;

public class F_Assignment {
    /**
     * 복합 대입 연산
     * 다른 연산자와 대입 연산자를 함께 사용하는 연산자
     */
    public void assignment() {
        int number = 12;
        String str = "Hello";

        number += 3; // number = number + 3;
        System.out.println("number += 3은 " + number);

        number -= 5; // number = number - 5;
        System.out.println("number -= 5은 " + number);

        number *= 6; // number = number * 6;
        System.out.println("number *= 6은 " + number);

        number /= 3; // number = number /= 3;
        System.out.println("number /= 3은 " + number);

        number %= 3; // number = number %= 3;
        System.out.println("number %= 3은 " + number);

        str += " World!"; // str = str + "World!"
        System.out.println("str = " + str);
    }
}
