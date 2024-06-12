package com.beyond.k_inheritance.practice;

public class SmartPhone extends Product{
    private String mobileAgency; //통신사 정보

    public SmartPhone() {
    }

    public SmartPhone(String brand, String code, String name, int price, String mobileAgency) {
        this.brand = brand;
        this.code = code;
        this.name = name;
        this.price = price;
        this.mobileAgency = mobileAgency;
    }

    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }

    @Override
    public String information() {
        return String.format("%s, mobileAgency: %s\n", super.information(), this.mobileAgency);
    }
}
