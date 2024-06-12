package com.beyond.l_polymorphism;

import com.beyond.l_polymorphism.practice.Desktop;
import com.beyond.l_polymorphism.practice.Product;
import com.beyond.l_polymorphism.practice.SmartPhone;
import com.beyond.l_polymorphism.practice.Television;

public class polyApplication {
    public static void main(String[] args) {
        // 1. 부모 타입의 참조 변수로 부모 인스턴스를 다루는 경우
        Product product = new Product();

        // product 참조 변수로 Product 클래스의 멤버만 접근 가능
        System.out.println(product);
        System.out.println();

        // 2. 자식 타입의 참조 변수로 자식 인스턴스를 다루는 경우
        Desktop desktop = new Desktop();

        // desktop 참조 변수로 Product, Desktop 클래스의 멤버에 접근 가능
        System.out.println(desktop);
        System.out.println(desktop.isAllInOne());
        System.out.println();

        // 3. 부모 타입의 참조 변수로 자식 인스턴스를 다루는 경우
        Product television = /*(Product)*/new Television(); // 업 캐스팅
        // television 참조 변수로 Product 클래스의 멤버만 참조 가능
        System.out.println(television);
        // Televison 클래스의 멤버에 접근하고 싶다면, 형 변환을 해야 한다.
        System.out.println(((Television)television).getInch()); // 다운 캐스팅

        // 4. 배열과 다형성
        //  - 다형성을 적용하기 전
        Desktop[] array1 = new Desktop[2];
        array1[0] = new Desktop();
        array1[1] = new Desktop();

        SmartPhone[] array2 = {new SmartPhone(), new SmartPhone()};

        //  - 다형성을 적용한 후
        Product[] array3 = new Product[4];
        array3[0] = /*(Product)*/new Desktop("애플", "a1111", "아이맥 24인치", 1500000, true);
        array3[1] = new Desktop("삼성", "s1111", "매직스테이션", 2000000, false);
        array3[2] = new SmartPhone("애플", "a2222", "아이폰12 미니", 1000000, "KT");
        array3[3] = new Television("엘지", "l1111", "벽걸이TV", 2000000, 60);


        for (Product p : array3) {
            System.out.println(p);
            if (p instanceof Desktop) {
                System.out.printf("isAllInOne=%b\n", ((Desktop)p).isAllInOne());
            } else if (p instanceof SmartPhone) {
                System.out.printf("isAllInOne=%s\n", ((SmartPhone)p).getMobileAgency());
            } else if (p instanceof Television) {
                System.out.printf("isAllInOne=%d\n", ((Television)p).getInch());
            }

        }

        productInfo(new Desktop());
        productInfo(new Television());
        productInfo(new SmartPhone());

    }

    private static void productInfo(Product product) {
        System.out.println(product);
    }
}
