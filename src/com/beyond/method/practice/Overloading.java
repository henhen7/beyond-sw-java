package com.beyond.method.practice;

public class Overloading {
    /**
     * 메소드 오버로딩
     *  - 매개변수의 타입, 개수, 순서 중 하나가 달라야 오버로딩이 성립한다.
     */
    public void test() {
    }
    public void test(int a) {
    }
    public void test(int a, String s) {
    }
    public void test(String s, int a) {
    }
    public void test(int a, int b) {
    }

    /**
     * 1. 매개변수의 이름이 다르다고 오버로딩이 적용되지는 않는다.
     *  - 매개변수의 이름과 상관없이 자료형의 개수와 순서가 같다면 에러가 발생한다. (이하 동일)
     * 2. 접근 제한자가 다르다고 오버로딩이 적용되지 않는다.
     * 3. 반환형이 다르다고 오버로딩이 적용되지 않는다.
     */
//    public void test(int c, int d) {
//    }
//    private void test(int a, int b) {
//    }
//    public int test(int e, int f) {
//    }
}
