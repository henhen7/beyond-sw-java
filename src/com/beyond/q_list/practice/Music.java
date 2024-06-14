package com.beyond.q_list.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Music implements Comparable<Music>{
    private String title;

    private String artist;

    private int ranking;

    /**
     * CompareTo()
     *  - 메소드에서 반환되는 값을 가지고 정렬 기준ㅇ르 잡는다.
     *  - 비교해서 같으면 0을 리턴한다.
     *  - 비교해서 자신이 크다면 양의 정수를 리턴한다.
     *  - 비교해서 자신이 작다면 음의 정수를 리턴한다.
     */
    @Override
    public int compareTo(Music music) {
        return this.ranking - music.ranking;
//        return music.ranking - this.ranking;
    }
}