package com.beyond.z_practice;

import com.beyond.z_practice.practice2.model.dao.FileDao;

import java.util.Scanner;

public class IOApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileDao fd = new FileDao();
        int num = 0;
        System.out.println("***** myNote *****");
        System.out.println("1. 노트 새로 만들기");
        System.out.println("2. 노트 열기");
        System.out.println("3. 노트 열어서 수정하기");
        System.out.println("4. 끝내기");
        System.out.print("번호를 입력하세요 > ");
        num  = sc.nextInt();

        switch (num) {
            case 1:
                fd.fileSave();
                break;
            case 2:
                fd.fileOpen();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("잘못된 번호 입력입니다.");
                return;
        }
    }
}
