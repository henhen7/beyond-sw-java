package com.beyond.e_enumeration.practice;

public enum Week {
    MONDAY("월요일", "월"),
    TUESDAY("화요일", "화"),
    WEDNESDAY("수요일", "수"),
    THURSDAY("목요일", "목"),
    FRIDAY("금요일", "금"),
    SATURDAY("토요일", "토"),
    SUNDAY("일요일", "일");

    private final String name;
    private final String shortname;

    //열거 타입의 생성자는 반드시 private으로 선언해야 한다.
    private Week(String name, String shortName) {
        this.name = name;
        this.shortname = shortName;
    }

    //열거 타입의 name 값을 읽어오는 메소드
    public String getName() {
        return this.name;
    }

    //열거 타입의 shortName 값을 읽어 오는 메소드
    public String getShortname() {
        return this.shortname;
    }

}
