package com.beyond.object;

import com.beyond.object.practice.Person;

public class ObjectApplication {
    public static void main(String[] args) {
        Person hong = new Person();
        Person lee = new Person();

        hong.setName("홍길동");
        hong.setAge(24);
        // Phone 클래스와 패키지가 다르므로 바로 호출하여 초기화할 수 없다.
        // Person 클래스를 통하여 초기화하여야 한다.
        hong.setPhone("애플", "아이폰12 미니", "화이트");
        hong.whoAreYou();

        lee.setName("이몽룡");
        lee.setAge(20);
        lee.whoAreYou();


    }
}
