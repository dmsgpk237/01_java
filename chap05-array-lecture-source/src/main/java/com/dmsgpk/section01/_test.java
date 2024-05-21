package com.dmsgpk.section01;

import java.util.Scanner;

public class _test {
    public static void main(String[] args) {

        /* 세 학생의 점수를 정수로 입력받아 합계와 평균을 실수로 구하시오.
            (A학생 : 30점, B학생 : 52점, C학생 : 65점) */

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0.0;
        int st = 3;

        for (int i = 0; i < st; i++){

            System.out.println((i + 1) + "번 학생의 점수를 입력하세요 : ");

            int score = sc.nextInt();

            System.out.println((i + 1) + "번 학생의 점수는 : " + score + " 입니다.");

            sum += score;

        } System.out.println("모든 학생 점수의 합산은 : " + sum + "이며, 평균은 : " + (double)(avg = sum / st) + " 입니다.");



        /*

        아래의 내용을 선언하여 하단의 내용을 출력하는 이중 for문을 작성하시오.
         - 선언할 내용 : int[][] iarr = new int[4][];
         - 출력 내용 :
        iarr[0][0] = 1; iarr[0][1] = 2; iarr[0][2] = 3;
        iarr[1][0] = 4; iarr[1][1] = 5; iarr[2][0] = 6;
        iarr[2][0] = 7; iarr[2][1] = 8;
        iarr[2][2] = 9; iarr[2][3] = 10;

        * */

        int[][] iarr = new int[4][];

        iarr[0] = new int[3];
        iarr[1] = new int[3];
        iarr[2] = new int[2];
        iarr[3] = new int[2];

        int num = 0;

        for(int i = 0; i < iarr.length; i++) {

            for(int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = ++num;

            }
        }

        for(int i = 0; i < iarr.length; i++) {

            for(int j = 0; j < iarr[i].length; j++) {
                System.out.print("iarr[" + i + "][" + j + "] 의 값 : " + iarr[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
