package com.beyond.o_exception.practice;

public class TryCatch {
    public void method1() {
        /**
         * 1. try 블럭 내에서 예외가 발생하면 (NullPointer)Exception 객체를 생성하여 catch 구문으로 던진다.
         *    이 객체를 catch 블럭에서 Exception 이라는 부모 클래스의 참조 변수에 대입하여 예외를 처리한다.
         * 2. 모든 예외 클래스들은 Exception 클래스를 상속한다.
         *    따라서 Exception 으로 처리할 경우, 모든 예외를 catch 할 수 있다.
         * 3. 만약 특정 예외를 직접 대입하게 되는 경우, 그 예외가 아닌 경우 예외 처리가 되지 않고 오류가 발생할 수 있다.
         *    따라서, 예외에 따라서 다르게 처리하는 경우, catch 블럭을 여러 개 생성하여 처리한 후 Exception 으로 전체를 묶어 처리할 수 있다.
         * 4. 다중 catch: catch 블럭을 여러 개 생성하여 처리하는 방법
         *    멀티 catch: 한 catch 블럭 내에서 여러 예외를 한 번에 처리하는 방법
         */
        try {
            // 예외가 발생할 가능성이 있는 코드를 작성하는 블록
            int result = 10 / 0;
            System.out.println("result = " + result);
        } catch (NullPointerException e) {
            // try에서 발생한 예외를 처리하는 블록
            System.out.println("NullPointerException이 발생하였습니다.");
        } catch (ArithmeticException | ClassCastException e) {
            // 한 catch 블럭에서 여러 예외를 한 번에 처리할 수 있다.
            System.out.println("ArithmeticException이 발생하였습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 예외 발생 여부와 상관없이 무조건 수행되는 블록
            System.out.println("finally 블록 실행");
        }
    }
}
