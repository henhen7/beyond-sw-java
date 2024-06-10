package com.beyond.object.practice;

/**
 * [클래스]
 *  클래스에서 사용 가능한 접근 제한자
 *  1. public
 *    : public으로 선언된 클래스는 아무 제약 없이 사용 가능하다.
 *  2. defauult
 *    : 동일 패키지에서는 제약 없이 사용 가능하지만, 다른 패키지에서는 제한된다.
 */
public class Person {
    /**
     * 1. 필드 정의(객체의 속성)
     *  - 접근 제한자 설정
     *  - 대체로 상단에 작성
     */
    private String name;
    private int age;

    //선언과 동시에 phone 생성, default 클래스(Phone)와 동일한 패키지 상에 있으므로 생성 가능하다.
    //Has-a 관계
    private Phone phone = new Phone();

    /**
     * 2. 생성자 정의(객체 생성 시 호출 - 초기화)
     *  - 클래스명과 동일해야 함
     *  - 반환 타입이 없음
     *  - 생성자 오버로딩 가능
     */
    public Person() {
        System.out.println("생성자 호출");
    }

    /**
     * 3. 메소드 정의(객체의 기능)
     *  - 매개변수 전달 가능
     */
    public void setName(String name) { //ex. "홍길동": 매개값, String name: 매개 변수
        this.name = name; //this: 객체 자기 자신(매개 변수와 필드명을 구분하기 위함)
    }

    public void setAge(int age) {
        this.age = (age >= 0) ? age : 0;
    }

    public void setPhone(String brand, String name, String color) {
        //메인 메소드에서 호출하는 값을 전달 받아온다.
        phone.setBrand(brand);
        phone.setName(name);
        phone.setColor(color);
    }

    public void whoAreYou() {
        System.out.printf("안녕하세요. 저는 %s입니다. 나이는 %d세입니다.\n", name, age);
        System.out.printf("저는 %s의 %s(%s)를 가지고 있습니다.\n",
                phone.getBrand(), phone.getName(), phone.getColor());
    }

}
