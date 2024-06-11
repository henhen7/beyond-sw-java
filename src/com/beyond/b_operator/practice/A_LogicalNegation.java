package com.beyond.b_operator.practice;

public class A_LogicalNegation {
    /**
     * 논리 부정 연산자
     *  [표현법]
     *  !논리값(true, false)
     */
    public void negation() {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 = " + b1);
        System.out.println("b1 != " + !b1);
        //연산자를 사용한 후에도 원본값에는 영향이 없다.
        System.out.println("b1 = " + b1);

        System.out.println("b2 = " + b2);
        System.out.println("b2 != " + !b2);
        System.out.println("b2 = " + b2);
    }
}
