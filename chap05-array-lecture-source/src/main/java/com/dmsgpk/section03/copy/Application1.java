package com.dmsgpk.section03.copy;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 배열의 복사
        *
        *
        * 1. 얕은 복사 (shallow copy) : stack의 주소값만 복사
        * 2. 깊은 복사 (deep copy) : heap의 배열에 저장된 값을 복사
        * */

        /*
        * 얕은 복사
        *
        * Stack에 저장되어 있는 배열의 주소값만 복사
        * 따라서 복사된 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        * 하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정하게 되면
        * 다른 레퍼런스 변수에 저장된 주소값도 변경된다.
        * 다른 레퍼런스 변수로 배열에 접근했을 때도 값이 변경된다.
        * */

        //원본배열
        int[] originArr = {1, 2, 3, 4, 5};

        int[] copyArr = originArr; //주소값이 저장되어 있기 때문에 나오는 것은 주소값이다.

        System.out.println("originArr의 hashcode: " + originArr.hashCode());
        System.out.println("Arrcopy의 hashcode: " + copyArr.hashCode());

        for(int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();

        System.out.println("========== 값 바꾸기 ==========");
        copyArr[0] = 99;
        originArr[2] = 15;

        for(int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();
    }
}
