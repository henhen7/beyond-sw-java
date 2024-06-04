package com.beyond.variable.practice;

public class A_Variable {
    /**
     * 변수의 선언
     * 변수명: 카멜 표기법
     * [표현법]
     *  자료형 변수명;
     */
    public void variableTest() {
        // 논리형(boolean)
        boolean isTrue;

        // 정수형
        byte bNum; //(-128 ~ 127)
        short sNum; //-32,768 ~ 32,767
        int iNum; //-2,147,483,648 ~ 2,147,483,647
        long lNum; //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수형
        float fNum; //±1.4E-45 ~ 3.4E38
        double dNum; //±4.9E-324 ~ 1.8E308

        // 문자형
        //char ch;
        //char ch = 'A';
        //char ch = 0;
        //char ch = '\u0000';
        //char ch = -90;
        char ch = 'a';

        System.out.println("ch: " + ch);
        System.out.println();

        // 문자열
        //String name; : 문자열을 가리킬 수 있는 참조 변수를 선언
        //String name = ""; : 빈 문자열로 초기화
        //String name = new String("현지");
        String name = null;
        System.out.println("name: " + name);
        System.out.println();

        // 지역 변수를 생성 후 초기화가 되지 않은 경우 오류 발샏
        // System.out.println(isTrue);
        isTrue = false; // 선언 후 초기화
        // isTrue = 1; : 에러 발생
        System.out.println("" + isTrue); // 문자열을 결합하는 경우, 문자형으로 형변환 발생
        System.out.println();

        //bNum = 128; : 바이트 범위 초과 에러 발생
        bNum = 127;
        sNum = 32000;
        iNum = 234567991;
        // lNum = 9223372036854775807; : 리터럴은 정수형이므로, int 범위를 벗어나는 경우 오류 발생
        // long 타입의 리터럴은 숫자 뒤에 L 또는 l을 입력해야 한다.
        lNum = 9223372036854775807L;

        System.out.println("bNum: " + bNum);
        System.out.println("sNum: " + sNum);
        System.out.println("iNum: " + iNum);
        System.out.println("lNum: " + lNum);
        System.out.println();

        // float 타입의 리터럴에서 숫자 뒤에 F또는 f를 입력해야 한다.
        fNum = 3.141592F;

        // dNum = 3.14D;
        dNum = 3.14;

        System.out.println("fNum: " + fNum);
        System.out.println("dNum: " + dNum);
        System.out.println();

        /**
         * 변수의 명명 규칙
         * 1) 대소문자 구분
         * 2) 숫자로 시작하면 안 된다.
         * 3) 특수문자는 _, $만 사용 가능하다.
         * 4) 예약어를 사용하면 안 된다.
         */
        int number;
        int NUMBER;
        //String number: 자료형이 달라도 변수명이 같으면 에러 발생

        // int 1age;
        int a1g2e3;

        int _age;
        //int %age;

        //int double;
        //int public;
    }

    /**
     * 자동 형 변환
     * - 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다.
     */
    public void autoCasting() {
        byte bNum = 10;
        short sNum = 12;
        int iNum = sNum; //short -> int 자동 형 변환
        long lNum = iNum; //int -> long 자동 형 변환
        float fNum = lNum; //long -> float 자동 형 변환: float 타입이 표현 가능한 수의 범위가 더 크기 때문
        double dNum = fNum;
        //iNum = dNum; :double -> int로 변환은 자동 형 변환이 일어나지 않음

        System.out.println("dNum = " + dNum);
        System.out.println("sNum = " + sNum);
        System.out.println("iNum = " + iNum);
        System.out.println("lNum = " + lNum);
        System.out.println("fNum = " + fNum);
        System.out.println("dNum = " + dNum);

        char ch = '현';
        iNum = ch;
        System.out.println("iNum = " + iNum); //유니코드값 출력
        System.out.println();

        double result = 12 + 3.3; // 12.0 + 3.3 = 15.3을 result에 대입
        System.out.println("result = " + result);
        // byte, short 타입의 데이터는 연산 시 무조건 int 타입으로 변환 후 처리된다.
        int result2 = bNum + sNum;
        System.out.println("result2 = " + result2);

        long result3 = 30 + 30; // 30 + 30 = 60, 60을 long 타입으로 변환 후 대입(60L)
        long result4 = 30 + 30L; // 30L + 30L = 60L
        System.out.println("result4 = " + result4);
    }

    /**
     * 강제 형 변환
     * [표현법]
     *  (자료형) 데이터;
     */
    public void casting() {
        double dNum = 4.234567893456789;
        float fNum = (float)dNum;
        int iNum = (int)fNum;
        System.out.println("dNum = " + dNum);
        System.out.println("fNum = " + fNum);
        System.out.println("iNum = " + iNum);
        System.out.println((byte)290);
        System.out.println();

        int sum = iNum + (int)dNum;
        System.out.println("sum = " + sum);

    }

    /**
     * 실습 문제
     * 홍길동: 국어 60점, 영어 70점, 수학 66점
     * 총점과 평균을 출력하시오.
     *
     * 출력)
     * 국어 점수: 60점
     * 영어 점수: 70점
     * 수학 점수: 66점
     *
     * 총점: 196점
     * 평균: 65.33점
     */
    public void practice() {
        final int kor = 60; //final: 초기화를 한 번 하면, 값을 변경할 수 없음
        int eng = 70;
        int math = 66;

        int sum = kor + eng + math;
        double avg = sum / 3.0;

        System.out.printf("국어 점수: %d점\n", kor);
        System.out.printf("영어 점수: %d점\n", eng);
        System.out.printf("수학 점수: %d점\n\n", math);
        System.out.println("총점: " + sum + "점");
        System.out.println("평균: " + avg + "점");

    }
}
