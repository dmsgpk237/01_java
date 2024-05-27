package com.dmsgpk.section0202;

import com.dmsgpk.section02.uses.MemberService;

import java.util.Scanner;

public class Application {

    // 각 각의 클래스가 어떤 역할을 하고 어떤 작용을 하는지 중점적으로 확인

    /*
     * 여러명의 정보를 받아서 등록
     * 등록한 정보를 객체 배열로 저장
     * 객체 배열에 저장된 값을 꺼내 출력
     * */

    /*
     * 시스템 요구사항
     * 1. 여러명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
     * 2. 전체 회원 조회시 여러명의 회원 정보를 반환
     *
     * 제약사항
     * 1. MemberRepository에 static 필드로 회원 정보들을 관리한다.
     * 2. 회원 정보는 최대 10명까지 지정할 수 있다.
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memSer = new MemberService();

        // 10명의 회원 정보를 저장할 수 있는 공간을 만들어
        // 5명의 회원 정보를 저장하고
        // 저장한 회원의 정보를 조회할 수 있게 한다.
        // 조회를 하고 나서 프로그램을 종료한다.

        while (true) {
            System.out.println("""
                    ============ 회원관리 프로그램입니다. ============
                    1. 회원 등록하기
                    2. 회원 조회하기
                    9. 프로그램 종료하기
                    """);
            System.out.println("원하는 메뉴를 선택하세요");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    memberService
                            break;
                case 2:

                    break;

                case 9:

                    break;

                default:

            }
        }




    }


}
