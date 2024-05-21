package com.dmsgpk.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /*
        * 깊은 복사
        *
        * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
        * 또 다른 배열에 복사를 해놓은 것
        *
        * 값 자체는 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
        * 하나의 배열에 값을 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
        * */

        /*
        * 깊은 복사를 하는 방법 4가지
        *
        * 1. for문을 이용한 동일한 인덱스의 값 복사
        * 2. object의 clone()을 이용한 복사
        * 3. System의 arrayCopy()를 이용한 복사
        * 4. Array의 copyOf()를 이용한 복사
        *
        * 가장 많이 사용되는 방식은 copyOf() 메소드
        * clone() 이전 배열과 같은 배열밖에 만들 수 없다는 특징이 있다.
        * -> clone()이외에 다른 복사 방법은 배열의 길이 조절 가능
        * */

        // 원본 배열 할당 및 초기화
        int[]originArr = new int[] {1, 2, 3, 4, 5};
        print(originArr);

        //for문을 이용한 동일한 인덱스 값 복사
        int[] copyArr1 = new int[10];

        for(int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i]; //수동으로 하나씩 값을 복사해주는 거

        }
       // print(copyArr1);
        // 원본 배열과 같은 값을 가지고 있지만, 나머지 인덱스는 다른 값
        // hashCode(주소값)이 다르다.

        // Object clone()을 이용한 복사

        int[] copyArr2 = originArr.clone();

        //print(copyArr2);


        //System에 arraycopy()를 이용한 복사
        int[] copyArr3 = new int[10];

        //원본 배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이
        System.arraycopy(originArr, 0, copyArr3, 5, originArr.length);
        // print(copyArr3); //복사한 만큼의 값은 같지만, 길이도 다르고, 주소도 다르다.

        //Arraays의 copyOf() 사용한 복사
        int[] copyArr4 = Arrays.copyOf(originArr, 4);
        print(copyArr4);
    }


    public static void print(int[] iarr) {
        System.out.println("iarr의 hashCode : " + iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {

            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}
