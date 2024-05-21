package com.dmsgpk.section01.array;

public class Application3 {
    public static void main(String[] args) {

        /*
        * 배열에 초기화되는 자료형 별 기본값
        *
        * 정수 : 0
        * 실수 : 0.0
        * 논리 : false
        * 문자 : \n000
        * 참조 : null
        *
        * */

        int[] iarr = new int[5];
        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

        // 배열이 저장되는 heap 영역은 값이 없는 빈 공간이 존재할 수 없다.
        // 그래서 기본값으로 초기화가 된다.

        /*
         * 자바에서 저장한 기본값 이외의 값으로 초기화를 하고 싶은 경우에는 블럭을 이용한다.
         * 블럭을 사용하는 경우, new 연산을 사용하지 않아도 되고, 값의 개수만큼 자동으로 크기가 설정된다.
         * */

        int[] iarr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("iarr2 : " + iarr2);

        System.out.println("============== iarr3의 각 인덱스별 값 ==============");
        int[] iarr3 = new int[] {1, 2, 3, 4, 5, 6, 7}; // new int[]를 쓰지 않은 식과 같다.
        System.out.println("iarr3의 길이 : " + iarr3.length);

        for(int i = 0; i < iarr3.length; i++) {

            System.out.println("iarr[ " + i + " ] 의 값 : " + iarr3[i]);

        }

        String[] sarr = {"apple", "banana", "grape", "orange"};

        for(int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[ " + i + " ]의 값 : " + sarr[i]);

        }

    }
}
