package com.beyond.v_assiststream.practice;

import java.io.*;
import java.util.Arrays;

public class A_ByteToCharStream {
//    public void inputStreamReader() {
//        try {
//            char[] array = new char[10];
//            InputStreamReader isr = new InputStreamReader(System.in);
//
//            System.out.print("문자열 입력 > ");
//            isr.read(array);
//            for (char c : array) {
//                System.out.print(c);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void outputStreamWriter() {
//        try {
//            OutputStreamWriter osw = new OutputStreamWriter(System.out);
//
//            osw.write("안녕하세요. 저는 홍길동입니다.\n");
//            osw.write("힘내세용~\n");
//            osw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 보조 스트림을 사용하여 성능 향상
     */
    public void inputStreamReader() {
        try {
            String line = null;
            char[] array = new char[10];
            // 아래와 같이 보조 스트림 여러 개를 사용하는 것도 가능하다.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("문자열 입력 > ");
            line = br.readLine();
            System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputStreamWriter() {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write("안녕하세요. 저는 홍길동입니다.");
            bw.newLine();
            bw.write("힘내세용~");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
