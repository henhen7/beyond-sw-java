package com.beyond.h_constructor.practice;

public class User {
    // 필드 정의: 대체로 private으로 생성함
    private String id;
    private String password;
    private String name;
    private int age;
    private char gender;

    /**
     * 기본 생성자
     *  - 객체 생성만을 목적으로 사용된다.
     *  - 기본 생성자를 생략하는 경우 자동으로 생성된다.
     */
    public User() {
        System.out.println("기본 생성자 호출");
    }

    /**
     * private으로 선언된 생성자
     *  - 클래스 내부에서만 객체 생성이 가능하다.
     *  - 외부에서 객체 생성을 제한하는 경우 활용 가능하다.(예시: Singleton)
     */
//    private User() {
//    }

    /**
     * 매개변수가 있는 생성자
     *  - 객체 생성과 동시에 전달된 값으로 필드를 초기화하는 목적으로 사용된다.
     */
    public User(String id, String password, String name) { // 생성자 오버로딩
        this.id = id;
        this.password = password;
        this.name = name;
    }
    public User(String id, String password, String name, int age, char gender) { // 생성자 오버로딩
        // 생성자에서 다른 생성자를 호출할 수 있다.
        // 클래스 내에서 문자열 매개변수 3개를 가지는 위 생성자를 호출하면서 전달받은 값으로 초기화한다.
        this(id, password, name); // 가장 첫 줄에 사용하여야 한다.
        this.age = age;
        this.gender = gender;
    }

    // 메소드 선언
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String information() {
        //this(id, password, name); // 메소드 내부에서는 this()를 사용해서 생성자를 호출할 수 없다.
        return String.format("%s, %s, %s, %d, %c",
                this.id, this.password, this.name, age, gender);
    }
}
