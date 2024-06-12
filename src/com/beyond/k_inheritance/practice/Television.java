package com.beyond.k_inheritance.practice;

public class Television extends Product {
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
    public String information() {
        return String.format("%s, inch: %d\n", super.information(), this.inch);
    }
}
