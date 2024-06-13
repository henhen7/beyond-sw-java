package com.beyond.n_interface.practice;

/**
 * Product 클래스에서 Basic 인터페이스를 구현할 시
 *  1. Product 클래스에서 인터페이스의 메소드를 오버라이딩한다.
 *  2. 추상 클래스로 변경하여 상속받은 클래스들에서 각각 인터페이스의 메소드를 오버라이딩한다.
 */
public abstract class Product implements Basic, Basic2{

    protected String brand;
    protected String code;
    protected String name;
    protected int price;

    public Product() {
    }

    public Product(String brand, String code, String name, int price) {
        this.brand = brand;
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
