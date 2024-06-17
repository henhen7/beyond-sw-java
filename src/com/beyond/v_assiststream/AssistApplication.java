package com.beyond.v_assiststream;

import com.beyond.v_assiststream.practice.A_ByteToCharStream;
import com.beyond.v_assiststream.practice.B_BufferedStream;
import com.beyond.v_assiststream.practice.C_DataStream;

public class AssistApplication {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
//        new A_ByteToCharStream().inputStreamReader();
//        new A_ByteToCharStream().outputStreamWriter();
//        new B_BufferedStream().fileSave();
//        new B_BufferedStream().fileRead();
        new C_DataStream().fileSaveAndRead();
        System.out.println("프로그램 종료");
    }
}
