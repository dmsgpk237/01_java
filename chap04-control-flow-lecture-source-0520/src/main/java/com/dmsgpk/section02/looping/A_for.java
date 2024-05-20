package com.dmsgpk.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testExample0(){

        // "안녕하세요"를 5번 출력하기

        Scanner sc = new Scanner(System.in);
        System.out.println("반복할 문자를 입력하세요. : ");
        String str = sc.nextLine();
        for(int i = 1; i <= 5; i++){
            System.out.println(str + " * " + i + " = " + (str + i));

        }

    }



//        int total = 0;
//        for(int num = 1; num <= random; num++) {
//            System.out.println("total = " + total + " + " + num);
//            total += num;
//        }

        // 혼자서 자습으로 만들어보기
        public void testExample4() {

            /*
            * 두 개의 숫자를 입력받아서 작은 수에서 큰 수까지의 합계를 구하세요
            * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 조건을 포함하시세요
            * */

            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 정수 입력 : ");
            int first = sc.nextInt();

            System.out.println("두 번째 정수 입력 : ");
            int second = sc.nextInt();

            System.out.println("first = " + first);
            System.out.println("second = " + second);

            int total = 0;

            // 첫 번째 정수가 더 큰 경우 (first > second)
            if(first > second) {
                for(int i = second; i <= first; i++) {
                    total = total + i;
                }
            } else {
                // second > first
                for(int i = first; i <= second; i++){
                    total = total + i;
                }
            }

            System.out.println("total = " + total);

        }



    public void PrintSimpleGugudan() {

        /*
        * 키보드로 2-9 사이의 구구단을 입력받아
        * 2-9 사이인 경우 해당 단의 구구단을 출력하고,
        * 그렇지 않은 경우 "반드시 2-9 사이의 양수를 입력해야 합니다." 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단 수를 입력하세요 : ");
        int dan = sc.nextInt();

        if( (dan >= 2) && (dan <= 9) ) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));

            }
        } else {
            System.out.println("반드시 2-9 사이의 양수를 입력해야 합니다.");
        }

    }



}
