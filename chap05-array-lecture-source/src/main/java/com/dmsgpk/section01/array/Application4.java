package com.dmsgpk.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] scores = new int[5]; //스코어라는 배열의 길이를 5로 설정한다.

        Scanner sc = new Scanner(System.in); //입력받는다.

        int sum = 0;
        double avg = 0;

//        System.out.println("1번 학생의 평균을 입력하세요! : ");
//        sc.nextInt();


        for (int i = 0; i < scores.length; i++){

            System.out.println( (i + 1) + " 번 학생의 점수를 입력하세요!");

            scores[i] = sc.nextInt();

            System.out.println((i + 1) + " 번 학생의 점수는 : " + scores[i] + " 입니다!");
        }

        for (int i = 0; i < scores.length; i++) {

            sum = sum + scores[i];
        }

        System.out.println("1번-5번 학생의 점수 합계는 : " + sum + " 입니다!");

        System.out.println("이 학생들의 평균은 : " + (avg = ((double) sum / scores.length)) + "입니다! ");


    }
}
