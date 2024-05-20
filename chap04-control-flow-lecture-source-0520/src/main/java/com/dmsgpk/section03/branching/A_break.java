package com.dmsgpk.section03.branching;

public class A_break {

    /*
    * break문 반복문
    *
    * */

    public void testSimpleBreakStatement() {
        // break문을 이용하여 무한루프를 활용한 1-100까지의 합계 구하기

        int sum = 0;
        int i = 1;

        while(true) {

            sum += i;
            System.out.println(i);
            // break문으로 반복문 빠져나오기
            if(i == 10) {

                break;
            }

            i++;
        }
        System.out.println("1부터 10까지의 합은 : " + sum + " 입니다.");

    }

    public void testSimpleBreakStatement2() {

        // break는 모든 반복문을 종료하는 것이 아니라, 자신(break)에게 가장 인접한 반복문 실행한 멈춘다.

        /*
        * 구구단 2-9까지 출력
        * su = 5까지만 출력할 것
        * */
            // 구구단 전체를 출력하는 기능

            for(int dan = 2; dan <10; dan++){

            System.out.println();
            System.out.println(dan + "단 입니다.");
            for(int su = 1; su < 10; su++){

                if(su > 5 ) {
                    break;
                }

                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
            }


    }

    public void testJumpBreak() {

        //label: 은 break가 가까운 조건을 빠져나오는 것이 아닌, 지정된 위치로 빠져나올 수 있게 한다.
        //label은 다른 이름으로도 지정 가능하다. dmsgp:도 됨.
        label:
         for (;;) {
             for(int i = 0; i < 10; i++ ) {
                 System.out.println(i);
                 if (i == 3) {
                     break label;
                 }
             }
         }
    }



}
