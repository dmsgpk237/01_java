package com.dmsgpk.test12345;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Puppy01 puppy01 = new Puppy01();

        puppy01.puppyName("max");
        puppy01.puppyAge(5);
        puppy01.puppyKinds("골든 리트리버");

        System.out.println("1번 문제 답: " + puppy01.getInfo());

        // System.out.println("이 강아지의 이름은 : " + puppy01.puppyAge();); 이렇게는 선언이 안 됨
        // 여기서 값을 줘서 그런 것 같음. puppy 페이지에서 값을 줄 공간을 만들어서 그 공간 자체를 프린트 하는 건 됨.

        System.out.println();

        Joshua02 joshua02 = new Joshua02();

        joshua02.joshuaName("Joshua Bloch");
        joshua02.joshuaBook("Effective Java");
        joshua02.joshuaPage(446);
        joshua02.joshuaCover("hardcover");

        System.out.println("2번 문제 답 : " + joshua02.getInfo());

        System.out.println();

        Tesla03 tesla03 = new Tesla03();

        tesla03.teslaKinds("전기차");
        tesla03.teslaModel("Tesla Model S");
        tesla03.teslaYear(2022);
        tesla03.teslaPrice(50000000);

        System.out.println("테슬라 전시회에 오신여러분을 환영합니다! 원하시는 메뉴를 번호로 입력하세요");
        System.out.println("[메뉴]");
        System.out.println("1. 테슬라 차량의 이름");
        System.out.println("2. 차량의 제작 연도");
        System.out.println("3. 차량의 종류");
        System.out.println("4. 차량 가격");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1) {

        } else if (num == 2) {

        } else if (num == 3) {


        } else if (num == 4){

        } else {
            System.out.println("프로그램을 종료합니다.");
        }


    }

}
