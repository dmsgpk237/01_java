package com.ohgiraffers.api.split;

import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";

        // 문자열 분리
        String strArr[] = str.split(" ");
        // 향상된 for문 사용
        for (String s : strArr) {
            System.out.println(s);
        }
        // System.out.println(Arrays.toString(strArr)); 동일하게 배열 전체를 보여줌

        // 문자 배열로 바꾸기

        // 문자 배열 미리 만들기.
        char[] chArr = new char[strArr.length];

        // 2) 문자열 배열의 값을 문자로 바꿔서, 문자 배열에 값넣기
        for (int i = 0; i < strArr.length; i++){
            chArr[i] = strArr[i].charAt(0);
        }
        // 문자배열에 값이 잘 들어갔는지 확인
        System.out.println("문자배열 길이 출력 : " + chArr.length);

        // 문자배열 한 번에 출력
        System.out.println(Arrays.toString(chArr));

        // 문자배열 -> 문자열
        String result = "";
        for (char ch : chArr){
            result = result + ch;
        }
        result = result.toUpperCase();

        System.out.println("result : " + result);


    }
}
