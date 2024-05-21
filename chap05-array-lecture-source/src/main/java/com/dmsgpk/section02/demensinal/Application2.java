package com.dmsgpk.section02.demensinal;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 이차원 배열의 선언
         *
         * 자료형[][] 변수명 = new 자료형[할당할 배열의 개수][할당할 배열의 길이];
         * */

        int[][] iarr = new int[3][5];

//        iarr[0][0] = 1;
//        iarr[0][1] = 2;
//        iarr[0][2] = 3;
//        iarr[0][3] = 4;
//        iarr[0][4] = 5;
//
//        iarr[1][0] = 6;
//        iarr[1][1] = 7;
//        iarr[1][2] = 8;
//        iarr[1][3] = 9;
//        iarr[1][4] = 10;
//
//        iarr[2][0] = 11;
//        iarr[2][1] = 12;
//        iarr[2][2] = 13;
//        iarr[2][3] = 14;
//        iarr[2][4] = 15;


        int num = 1;

        for (int i = 0; i < iarr[0].length; i++) {

            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = num;
                num++;
            }

        }

//        System.out.println("======= 0번째 인덱스 배열 =======");
//        System.out.println(iarr[0][0] + " ");
//        System.out.println(iarr[0][1] + " ");
//        System.out.println(iarr[0][2] + " ");
//        System.out.println(iarr[0][3] + " ");
//        System.out.println(iarr[0][4] + " ");
//        System.out.println();
//
//        System.out.println("======= 1번째 인덱스 배열 =======");
//        System.out.println(iarr[1][0] + " ");
//        System.out.println(iarr[1][1] + " ");
//        System.out.println(iarr[1][2] + " ");
//        System.out.println(iarr[1][3] + " ");
//        System.out.println(iarr[1][4] + " ");
//        System.out.println();
//
//        System.out.println("======= 2번째 인덱스 배열 =======");
//        System.out.println(iarr[2][0] + " ");
//        System.out.println(iarr[2][1] + " ");
//        System.out.println(iarr[2][2] + " ");
//        System.out.println(iarr[2][3] + " ");
//        System.out.println(iarr[2][4] + " ");
//        System.out.println();


        // 각 인덱스 배열에 접근
//        for (int i = 0; i < iarr.length; i++) {
//
//            System.out.println(i + "번째 인덱스 배열");
//
//            // 각 인덱스의 배열값에 차례로 출력하는 반복문
//            for (int i = 0; i < iarr.length; i++) {
//
//                for (int j = 0; j < iarr[i].length; i++) {
//
//                    System.out.println(iarr[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
    }
}
