package com.beyond.u_FileIO.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class A_FileByteStream {
    public void fileSave() {
        System.out.println("fileSave() - 호출");
        FileOutputStream fos = null;
        byte[] array = {99, 100, 101, 102};
        try {
            fos = new FileOutputStream("a_byte.dat");

            fos.write(97);
            fos.write('b');
            fos.write(10); //줄바꿈
            fos.write('a');
            fos.write(10);
            fos.write('현');
            fos.write(10);
            fos.write(array);
            fos.write(10);
            fos.write(array, 1, 2);
            fos.flush();

            /**
             * 위의 write() 메소드에서 IOException이 발생했을 경우 close()가 실행되지 않는다.
             * 따라서 finally 블록 안에서 close() 메소드를 실행해야 한다.
             */
//            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void fileRead() {
        FileInputStream fis = null;
        byte[] array = new byte[50];
        try {
            // 파일이 존재하지 않으면 FileNotFoundException 예외 발생
            fis = new FileInputStream("a_byte.dat");

//            System.out.println(fis.read()); // 바이트 단위로 읽고, int() 타입으로 반환함
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());
////            System.out.println(fis.read(array));
//            System.out.println(fis.read(array, 10, 10));
//            System.out.println(Arrays.toString(array));
//            System.out.println(fis.read());

            //read()를 두 번 호출하기 때문에 원하는 값을 출력할 수 없다.
//            while(fis.read() != -1) {
//                System.out.print((char)fis.read());
//            }
            //value 변수에 read() 메소드의 결과값을 담은 후 출력하면 정상 출력 가능하다.
            int value = 0;
            while((value = fis.read()) != -1) {
                System.out.print((char)value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { //가장 상위의 예외가 가장 마지막에 catch 되게 한다.
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
