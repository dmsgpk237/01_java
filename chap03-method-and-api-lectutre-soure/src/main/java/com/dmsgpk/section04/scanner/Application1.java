package com.dmsgpk.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        // java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        // java.lang.*; 컴파일러가 자동으로 추가, java.lang은 패키지 이름 생략 가능.
        // java.util.Scanner scanner = new java.util.Scanner(System.in);

        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
//        System.out.println("입력한 숫자는 : " + num);

        // 자료형별 값 입력받기

        /*
        * 문자열 입력 받기
        *
        * nextLine() : 입력받은 값을 문자열로 반환해준다.
        */

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("입력하신 이름은 " + name + " 입니다.");


        /*
        * 정수형 값 입력받기
        *
        * nextInt() : 입력받은 값을 int 형으로 반환해준다.
        * */

        System.out.println();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); //nextInt(값을 넣을 수 있다) //매개변수 : 진법(radix)
        System.out.print("입력하신 이름은 " + name + " 이며, 입력하신 나이는 " + age + " 입니다.");

        //nextbyte(), nextShort()

        /*
        * 정수형(long)
        *
        * nextLong() : 입력받은 값을 long 형으로 반환해준다.
        * */

        System.out.println();
        System.out.print("원하는 월급을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.print("당신이 원하는 월급은 : " + money + " 입니다.");

        /*
        * 실수형(float)
        *
        * nextFloat() : 입력받은 값을 float 형으로 반환해준다.
        * */

        System.out.println();
        System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.print("입력하신 키는 " + height + " 입니다.");

        /*
        * 실수형(double)
        *
        * nextDouble() : 입력받은 값을 double 형으로 반환해준다.
        */

        System.out.println();
        System.out.print("원주율(파이)를 아는 만큼 입력하세요 : ");
        double pi = sc.nextDouble();
        System.out.print("입력한 원주율은 " + pi + " 입니다.");

        /*
        * 논리형(boolean)
        *
        * nextBoolean() : 입력받은 값을 boolean 형으로 반환해준다.
        * */

        System.out.println();
        System.out.print("복습을 잘 하고 있습니까? true or false로 입력하세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.print("입력하신 논리 값은 " + isTrue + " 입니다.");

        sc.nextLine(); //개행문자 남은걸 지워줘야 에러가 발생하지 않는다. 
        System.out.println();
        System.out.println("아무 문자나 입력하세요 : ");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        System.out.println("입력하신 문자는 " + ch + " 입니다.");



    }
}
