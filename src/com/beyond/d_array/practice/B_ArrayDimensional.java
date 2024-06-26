package com.beyond.d_array.practice;

public class B_ArrayDimensional {
    // 2차원 배열의 선언, 생성, 초기화(new 연산자 사용)
    public void ArrayInitNew() {
        int[][] iArray;
        iArray = new int[3][5];

        /**
         *  1  2  3  4  5
         *  6  7  8  9 10
         * 11 12 13 14 15
         */
        int value = 1;

        System.out.println(iArray.length);
        System.out.println(iArray[0].length);
        System.out.println(iArray[1].length);
        System.out.println(iArray[2].length);

        // 2차원 배열에 초기화
        for (int i = 0; i < iArray.length; i++) { //행을 돌며 반복
            for (int j = 0; j < iArray[i].length; j++) { //열을 돌며 반복
                iArray[i][j] = value++;
            }
        }

        // 2차원 배열의 값을 출력
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) {
                System.out.printf("%2d ", iArray[i][j]);
            }
            System.out.println();
        }
    }

    // 2차원 배열의 선언, 생성, 초기화(값의 목록 사용
    public void ArrayInitValue() {
        //String[][] sArray = new String[][] {{"Linux", "MariaDB"}, {"Java", "Spring"}};
        String[][] sArray = {
                {"Linux", "MariaDB"},
                {"Java", "Spring"},
                {"HTML5", "CSS3", "Vue.js"} //가변 배열: 열의 개수가 정해지지 않음
        };

        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < sArray[i].length; j++) {
                System.out.printf("%s\t", sArray[i][j]);
            }
            System.out.println();
        }
    }
}
