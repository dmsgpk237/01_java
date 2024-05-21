package com.dmsgpk.section02.demensinal;

public class Application3 {
    public static void main(String[] args) {

        /*
        * 2차원 배열(가변배열)
        *
        * 가변배열의 경우 각 인덱스별 배열을 따로 할당해야 한다.
        * 선언과 동시에 모든 배열을 할당할 수 없으며, 할당할 배열의 개수만 지정하고
        * 각 인덱스에 서로 다른 길이의 배열을 따로 할당해야 한다.
        *
        * 자료형[][] 변수명 = new 자료형[할당할 배열의 개수][];
        * 변수명[배열 인덱스] = new 자료형[배열의 길이]
        * */

        // 선언
        int [][] iarr = new int[3][];
        iarr[0] = new int[3];

        // iarr[1] = new char[3]; // 가변배열을 하더라도 다른 자료형을 하나로 묶어서 관리할 수 없기 때문.
        iarr[1] = new int[2];

        // 일차원 배열
        int[] arr = new int[5];
        iarr[2] = arr; //미리 할당해 둔 배열을 이용해서 활용 가능하다.

        iarr[0][0] = 1;
        iarr[0][1] = 2;
        iarr[0][2] = 3;

        // iarr[0][3] = 4; 존재하지 않는 인덱스에 접근하는 경우 ArrayIndexOutOfBoundsException 발생

        iarr[1][0] = 4;
        iarr[1][1] = 5;

        iarr[2][0] = 6;
        iarr[2][1] = 7;
        iarr[2][2] = 8;
        iarr[2][3] = 9;
        iarr[2][4] = 10;

        int value = 0;

        // 모든 배열에 순차적으로 접근해서 1씩 증가하는 value를 할당해준다.
        for(int i = 0; i < iarr.length; i++) {

            for(int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = ++value;

            }
        }

        for(int i = 0; i < iarr.length; i++) {

            for(int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }







    }
}
