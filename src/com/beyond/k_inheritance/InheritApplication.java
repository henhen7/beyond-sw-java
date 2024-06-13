package com.beyond.k_inheritance;

import com.beyond.k_inheritance.practice.Book;
import com.beyond.k_inheritance.practice.Desktop;
import com.beyond.k_inheritance.practice.SmartPhone;
import com.beyond.k_inheritance.practice.Television;

public class InheritApplication {
    public static void main(String[] args) {
        Desktop desktop2 = new Desktop();
        //Desktop 객체 생성
        Desktop desktop = new Desktop("애플", "a1111", "아이맥 24인치", 1800000, true);
        System.out.println(desktop.information());

        //SmartPhone 객체 생성
        SmartPhone smartPhone = new SmartPhone("애플", "a2222", "아이폰 12 미니", 1000000, "KT");
        System.out.println(smartPhone.information());

        //Television 객체 생성
        Television television = new Television("엘지", "l3333", "벽걸이 TV", 2000000, 60);
        System.out.println(television.information());

        //Object 클래스의 메소드 오버라이딩 테스트
        //Book 객체 생성
        Book book1 = new Book("자바의 정석", "남궁성", 30000);
        Book book2 = new Book("자바의 정석", "남궁성", 30000);
        Book book3 = new Book("혼자 공부하는 자바", "신용권", 28000);

        System.out.println(book1.information());
        System.out.println(book2.information());
        System.out.println(book3.information());

        // 1. toString 테스트
//        System.out.println(book1.toString());
//        System.out.println(book2.toString());
//        System.out.println(book3.toString());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println();

        // 2. equals() 테스트
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println();

        // 3. hashCode() 테스트
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode()); // 필드의 값들이 같으면 동일한 해시코드를 가지고 있다.
        System.out.println(book3.hashCode());

        // 문자열의 경우, 가지고 있는 데이터가 같으면 동일한 해시코드를 가지고 있다.
        System.out.println("Hello".hashCode());
        System.out.println(new String("Hello").hashCode());
    }
}
