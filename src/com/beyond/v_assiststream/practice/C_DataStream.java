package com.beyond.v_assiststream.practice;

import java.io.*;

public class C_DataStream {
    public void fileSaveAndRead() {
        // try()에 리소스를 여러 개 지정 - 세미콜론으로 구분
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("b_data.txt"));
             DataInputStream dis = new DataInputStream(new FileInputStream("b_data.txt"))){
            //파일에 출력하기
            dos.writeUTF("홍길동");
            dos.writeInt(30);
            dos.writeDouble(170.5);
            dos.writeChar('남');
            dos.writeBoolean(false);

            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
