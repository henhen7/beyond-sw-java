package com.beyond.u_FileIO;

import com.beyond.u_FileIO.practice.A_FileByteStream;
import com.beyond.u_FileIO.practice.B_FileCharStream;

public class FileIOApplication {
    public static void main(String[] args) {
        System.out.println("프로그램 실행");
//        new A_FileByteStream().fileRead();
//        new B_FileCharStream().fileSave();
        new B_FileCharStream().fileRead();
        System.out.println("프로그램 종료");
    }
}
