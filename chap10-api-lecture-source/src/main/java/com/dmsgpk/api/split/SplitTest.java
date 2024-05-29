package com.dmsgpk.api.split;

import java.util.Arrays;

public class SplitTest {
    /*
    - 요구사항
    1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 분리하여 `char[]` 에 저장하여 출력하시오.
    2. 분리전 글자 및 개수 출력
    3. 분리 후 문자배열 갯수 출력 확인
    4. `char[]` 값 출력
    5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
    * */
    public static void main(String[] args) {
        System.out.println("======= str 문자열 공백단위 분리 후 출력 =======");

        String str = "J a v a P r o g r a m ";
        System.out.println("문자열의 개수 : " + str.length());

        String[] sarr = str.split(" ");

        System.out.println("분리 후 문자배열의 개수 : " + sarr.length);

        String result;
        for (int i = 0; i < str.length(); i++) {
            System.out.println("str[" + i + "] = " + str.charAt(i));
        }

        String str1 = Arrays.toString(sarr);
        System.out.println(str1);
        str1.toUpperCase();
        System.out.println(str1);



    }
}
