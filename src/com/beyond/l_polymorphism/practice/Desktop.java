package com.beyond.l_polymorphism.practice;

public class Desktop extends Product {
    private boolean allInOne; // 일체형 여부

    public Desktop() {
        // super(); // 생략 시 자동으로 들어감
    }

    public Desktop(String brand, String code, String name, int price, boolean allInOne) {
        // 1. 부모 생성자를 호출하여 초기화하는 방법
//        super(brand, code, name, price);
        // 2. 부모의 Setter 메소드를 호출하여 초기화하는 방법
//        this.setBrand(brand);
//        setName(name);
//        super.setCode(code);
//        super.setPrice(price);
        // 3. 부모의 필드에 직접 접근해서 초기화
        //  - 부모 클래스에서 protected 접근 제한자를 사용한 필드를 가져야 함
        //  - 같은 패키지 내, 혹은 상속받은 자식 클래스 내에서 사용 가능한 접근 제한자
        this.brand = brand; //this 사용 가능
        this.code = code;
        super.name = name; //super 으로 바로 접근 가능
        super.price = price;
        this.allInOne = allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "allInOne=" + allInOne +
                ", brand='" + brand + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
