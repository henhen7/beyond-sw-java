package com.beyond.z_streamAPI.stream_practice;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String gender;
    private int math;
    private int english;
    public double avg() {
        return (this.math + this.english) / 2.0;
    }

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }
}
