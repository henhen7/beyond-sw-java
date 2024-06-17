package com.beyond.v_assiststream.practice;

import java.io.*;

public class B_BufferedStream {
    public void fileSave() {
        try {
            //보조 스트림을 생성하기 위해 매개값으로 기반 스트림을 받음(fw)
//            FileWriter fw = new FileWriter("a_buffer.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
            BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt", true));
            bw.write("안녕하세요.");
            bw.newLine(); // BufferedWriter이 제공하는 메소드로, 개행할 때 사용한다.
            bw.write("줄바꿈이 적용되었나요?");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"))){
            String line = null;

            // BufferedReader가 제공하는 메소드이며, 파일에서 한 줄을 읽어올 때 사용한다.
//            line = br.readLine();
//            System.out.println(line);
//            line = br.readLine();
//            System.out.println(line);

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
