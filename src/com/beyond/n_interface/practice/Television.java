package com.beyond.n_interface.practice;

public class Television extends Product{
    private int inch;

    public Television() {
    }

    public Television(String brand, String code, String name, int price, int inch) {
        this.brand = brand;
        this.code = code;
        this.name = name;
        this.price = price;
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Television{" +
                "inch=" + inch +
                ", brand='" + brand + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}
