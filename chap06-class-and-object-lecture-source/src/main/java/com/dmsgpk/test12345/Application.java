package com.dmsgpk.test12345;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Puppy01 puppy01 = new Puppy01(); // 이게 우리가 퍼피라는 인스턴스를 만든 것

        puppy01.puppyName("max"); //인스턴스에 퍼피 네임을 참조해서 이름을 넣어주는 것
        puppy01.puppyAge(5);
        puppy01.puppyKinds("골든 리트리버");

        System.out.println(puppy01.getInfo());

        System.out.println();

        System.out.println("==============================================================");

        System.out.println();

        Puppy01 puppy011 = new Puppy01();

        puppy011.puppyAge(10);
        puppy011.puppyName("무적이");
        puppy011.puppyKinds("진돗개");
        System.out.println(puppy011.getInfo());

        System.out.println();

        System.out.println("==============================================================");
        // System.out.println("이 강아지의 이름은 : " + puppy01.puppyAge();); 이렇게는 선언이 안 됨
        // 여기서 값을 줘서 그런 것 같음. puppy 페이지에서 값을 줄 공간을 만들어서 그 공간 자체를 프린트 하는 건 됨.

        System.out.println();

        Joshua02 joshua02 = new Joshua02();

        joshua02.joshuaName("Joshua Bloch");
        joshua02.joshuaBook("Effective Java");
        joshua02.joshuaPage(446);
        joshua02.joshuaCover("hardcover");

        System.out.println(joshua02.getInfo());

        System.out.println();

        System.out.println("==============================================================");

        System.out.println();

        Tesla03 tesla03 = new Tesla03();

        tesla03.teslaKinds("전기차");
        tesla03.teslaModel("Tesla Model S");
        tesla03.teslaYear(2022);
        tesla03.teslaPrice(50000000);


            while (true) {

                System.out.println("테슬라 전시회에 오신여러분을 환영합니다! 원하시는 메뉴를 번호로 입력하세요");
                System.out.println("[메뉴]");
                System.out.println("1. 테슬라 차량의 이름");
                System.out.println("2. 차량의 제작 연도");
                System.out.println("3. 차량의 종류");
                System.out.println("4. 차량 가격");
                System.out.println("9. 프로그램 종료");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                if (num == 1) {
                    System.out.println(tesla03.getKinds());

                } else if (num == 2) {
                    System.out.println(tesla03.getYear());

                } else if (num == 3) {
                    System.out.println(tesla03.getModel());

                } else if (num == 4) {
                    System.out.println(tesla03.getPrice());

                } else if (num == 9) {
                    System.out.println("프로그램을 종료합니다.");


                } else {
                    System.out.println("다시 입력해주세요.");

                }

                break;
            }


        System.out.println();
        System.out.println("==============================================================");
        System.out.println();

        James04 james04 = new James04("James", 30, '유', 3, "sara, yoora, jihyun");

        System.out.println(james04.getInfo());

        System.out.println();
        System.out.println("==============================================================");
        System.out.println();


        Dell05 dell = new Dell05();
        dell.dellBrand("dell");
        dell.dellModel("XPS 13");
        dell.dellPerformance("16GB RAM / 512GB SSD");

//        System.out.println("이 노트북 브랜드의 이름은 : " + dell.getBrand());
//        System.out.println("이 노트북의 모델명은 : " + dell.getModel());
//        System.out.println("이 노트북의 사양은 : " + dell.getPerformance());
// 이렇게는 안 됨
        System.out.println(dell.getInfo());

//        System.out.println("""
//                이 노트북 브랜드의 이름은 : %s
//                모델명은 : %s
//                사양은 : %s
//                """.formatted(dell.getBrand(), dell.getModel(), dell.getPerformance()));
        // 이거 null 값만 나왔음.




    }

}
