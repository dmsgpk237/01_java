package com.dmsgpk.section01.practice;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("키를 입력하세요 : ");
        int height = sc.nextInt();

        if(age >= 9 && height >= 110) {
            System.out.println("놀이기구를 탑승 하실 수 있습니다.");
        } else if (age < 9 && height < 110){
            System.out.println("나이가 9살 미만이고, 키가 110cm 미만이라 놀이기구를 탑승 하실 수 없습니다.");

        } else if (height < 110) {
            System.out.println("키가 110cm 미만이라 탑승 하실 수 없습니다.");

        } else if(age < 9) {
            System.out.println("나이가 9살 미만이라 탑승 하실 수 없습니다.");
        }

        System.out.println("프로그램 종료합니다.");





    }

}
