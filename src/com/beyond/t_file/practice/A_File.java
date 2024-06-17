package com.beyond.t_file.practice;

import java.io.File;
import java.io.IOException;

public class A_File {
    /**
     * File 클래스
     *  - 파일 크기, 속성, 이름 등의 정보를 알아내는 기능 제공
     *  - 파일 생성 및 삭제 기능 제공
     *  - 파일의 데이터를 읽고 쓰는 기능은 지원하지 않는다.
     */
    public void method1() {
        try {
//            File file = new File("/Users/hyeonji/Mine/test.txt"); //메모리 상에만 존재하는 객체
            File file = new File("test.txt"); //경로를 지정하지 않을 시 현재 프로젝트의 최상위 폴더에 생성

            System.out.println("파일명: " + file.getName());
            System.out.println("파일 경로: " + file.getAbsolutePath());
            System.out.println("파일 용량: " + file.length());
            System.out.println("파일 존재 여부: " + file.exists()); //boolean
            System.out.println("파일 여부: " + file.isFile());
            System.out.println("디렉터리 여부: " + file.isDirectory());

            if (file.exists()) {
                file.delete();
            } else {
                file.createNewFile(); //실제 파일 생성
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method2() {
        try {
            boolean result = false;
//          File temp = new File("/Users/hyeonji/Mine/temp");
            File temp = new File("/Users/hyeonji/Mine/temp/demo/test");
            File file = new File("/Users/hyeonji/Mine/temp/demo/test/test.txt");

            if (!temp.exists()) {
//              result = temp.mkdir();
                result = temp.mkdirs();
                System.out.println("폴더 생성 여부: " + result);
            }

            if (!file.exists()) {
                /**
                 * [파일 생성]
                 *  - 존재하는 경로까지 지정해 주면 해당 위치에 파일을 생성한다.
                 *    단, 만약 존재하지 않는 경로를 제시하면 IOException이 발생한다.
                 */
                result = file.createNewFile();
                System.out.println("파일 생성 여부: " + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
