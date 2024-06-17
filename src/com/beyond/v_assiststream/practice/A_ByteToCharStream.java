package com.beyond.v_assiststream.practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A_ByteToCharStream {
    public void inputStreamReader() {
        try {
            char[] array = new char[10];
            InputStreamReader isr = new InputStreamReader(System.in);

            System.out.print("문자열 입력 > ");
            isr.read(array);
            for (char c : array) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputStreamWriter() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out);

            osw.write("안녕하세요. 저는 홍길동입니다.\n");
            osw.write("힘내세용~\n");
            osw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
