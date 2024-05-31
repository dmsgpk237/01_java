package com.dmsgpk.section02;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /*
        * '사용자 정의'의 예외클래스
        *
        * RuntimeException의 후손 대부분은 예외처리를 강제화 하지 않음.
        * 이런 경우에도 예외를 강제화 하고 싶을 때는, 사전에 정의된 예외클래스 외에
        * 개발자가 원하는 명칭의 예외클래스를 만들어 작성할 수 있다.
        * */

        ExceptionTest et = new ExceptionTest();
        Scanner sc = new Scanner(System.in);

        System.out.println("물건의 가격을 입력해주세요 : ");
        int price = sc.nextInt();

        System.out.println();

        System.out.println("소지하고 있는 돈을 입력해주세요 : ");
        int money = sc.nextInt();

        try {
            et.checkEnoughMoney(price, money);

        } catch (Exception e) {
            // Exception을 출력하는 기능 - 로그를 남기는 것.
            e.printStackTrace();
        }
        System.out.println("종료합니다.");
    }
}
