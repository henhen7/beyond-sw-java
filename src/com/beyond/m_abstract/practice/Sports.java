package com.beyond.m_abstract.practice;

public abstract class Sports {
    protected int numberOfPlayers;

    public Sports(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    /**
     * 추상 메소드
     *  - 중괄호가 없고, 세미콜론(;)으로 끝난다.
     *  - 각각 스포츠마다 그에 따른 룰을 반드시 재정의해야 한다.
     *
     */
    public abstract void rule();
}
