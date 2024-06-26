package com.beyond.zz_practice.practice2.model.dao;

import java.io.*;
import java.util.Scanner;

public class FileDao {
    Scanner scanner = new Scanner(System.in);

    public void fileSave() {
        StringBuilder sb = new StringBuilder();
        String filename = null;
        String line = null;
        String yn = null;
        System.out.println("파일에 저장할 내용을 반복해서 입력하세요.(exit를 입력하면 내용 입력 끝)");
        while(true) {
            line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            } else {
                sb.append(line);
                sb.append("\n");
            }
        }
        System.out.println("저장하시겠습니까? (y/n)");
        yn = scanner.nextLine();
        if (yn.equalsIgnoreCase("y")) {
            System.out.println("저장할 파일명을 입력하세요.");
            filename = scanner.nextLine();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename + ".txt"))) {
                bw.write(sb.toString());
                System.out.println("파일을 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("다시 메뉴로 돌아갑니다.");
        }
}
    public void fileOpen() {
        String filename = null;
        System.out.println("열기 할 파일명을 입력하세요.");
        filename = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filename + ".txt"))){
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("존재하는 파일이 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileEdit() {
        String filename = null;
        String content = null;
        String save = null;
        StringBuilder sb = new StringBuilder();

        System.out.println("수정할 파일명을 입력하세요.");
        filename = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filename + ".txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filename + ".txt", true))) {
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }

            System.out.println("파일에 추가할 내용을 반복해서 입력하세요.(exit를 입력하면 내용 입력 끝)");
            while(true) {
                content = scanner.nextLine();

                if(content.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    sb.append(content);
                    sb.append("\n");
                }
            }
            System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
            save = scanner.nextLine();

            if(save.equalsIgnoreCase("y")) {
                bw.write(sb.toString());
                System.out.println( filename+ ".txt 파일의 내용이 변경되었습니다.");
            } else {
                System.out.println("다시 메뉴로 돌아갑니다.");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
