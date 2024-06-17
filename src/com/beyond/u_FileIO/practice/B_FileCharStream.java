package com.beyond.u_FileIO.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_FileCharStream {
    public void fileSave() {
        System.out.println("fileSave() - 호출");
        /**
         * [try-with-resource 문]
         *  - try() 내에 리소스를 작성하여 사용한 리소스를 예외와 관계없이 자동으로 close() 시킨다.
         *  - 자바 1.7부터 지원
         */
        try(FileWriter fw = new FileWriter("b_char.txt")){
            fw.write('A');
            fw.write('\n');
            fw.write('현');
            fw.write('\n');
            fw.write(new char[]{'a', 'p', 'p', 'l', 'e'});
            fw.write('\n');
            fw.write(new char[]{'a', 'p', 'p', 'l', 'e'}, 2, 3);
            fw.write('\n');
            fw.write("안녕하세요\n");
            fw.write("IO 재밌으신가요...?\n");
            fw.write("IO 재밌으신가요...?\n", 10, 3);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead() {
        System.out.println("fileRead() - 호출");
        try {
            FileReader fr = new FileReader("b_char.txt");
            int value = 0;
            while((value = fr.read()) != -1) {
                System.out.print((char)value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
