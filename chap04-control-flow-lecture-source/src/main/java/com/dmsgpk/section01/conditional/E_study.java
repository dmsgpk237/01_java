package com.dmsgpk.section01.conditional;

import java.util.Scanner;

public class E_study {

    public void testStudyIfStatement() {
        Scanner sc = new Scanner(System.in);

        /*
        * A가 짝사랑녀 B를 길거리에서 만났다. A가 B에게 할 말은?

        1. 안녕
        2. 야레야레 못말리는 아가씨
        3. 나랑 밥 먹을래 나랑 사귈래

        잘못된 값→ 우리는 사실 남매야.

        마지막-결국 그들은 개미가 되었다.

        if문과 switch형식으로 만들기
        */

        System.out.println("A가 짝사랑녀 B를 길거리에서 만났다. A가 B에게 할 말은?");
        System.out.println("1. 안녕");
        System.out.println("2. 야레야레 못말리는 아가씨");
        System.out.println("3. 나랑 밥 먹을래 나랑 사귈래!");
        System.out.println("3개의 답변 중 하나를 선택하시오.");
        String hi = sc.nextLine();

        if (hi.equals("1")) {

            System.out.println("안녕");
            System.out.println();
            System.out.println("그래 안녕");

        } else if (hi.equals("2")) {

            System.out.println("야레야레 못말리는 아가씨");
            System.out.println();
            System.out.println("뭐라는거야...잘 가렴...");

        } else if (hi.equals("3")){


            System.out.println("나랑 밥 먹을래 나랑 사귈래!");
            System.out.println();
            System.out.println("둘 다 아니..");

        } else {

            System.out.println("우리는 사실 남매야");
            System.out.println();
            System.out.println("뭐라는거야..");

        }
        System.out.println("결국 그들은 개미가 되었습니다.");



    }

    public void testStudySwitchStatement() {


    }
}
