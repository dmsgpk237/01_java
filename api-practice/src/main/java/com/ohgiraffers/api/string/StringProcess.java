package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String helloWorld) {
        // 1. 매개변수 전달이 잘 되는지 확인
        System.out.println("hello world : " + helloWorld);

        //charAt() : 특정 인덱스에 있는 '문자'를 반환한다.
        char firstChar = helloWorld.charAt(0);
        System.out.println(firstChar);

        // 첫 글자 대문자로 바꾸기
        // 1) 문자 -> 문자열
        String firstStr = Character.valueOf(firstChar).toString();
        // String firstStr = Character.toString(firstChar) 이렇게도 쓸 수 있다.

        // 2) UpperCase로 대문자로 바꾸기
        firstStr = firstStr.toUpperCase();
        System.out.println(firstStr);

        // 3) 첫 글자를 뺀 나머지 부분
        String remainStr = helloWorld.substring(1);
        System.out.println(remainStr);

        // 4) 자른 문자 2개 합치기
        String result = firstStr.concat(remainStr);

        return result;
    }

    public int charSu(String str, char ch) {
        System.out.println(str);
        System.out.println(ch);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            char findChar = str.charAt(i);

            if (ch == findChar) {
                count ++;
            }
        }
        return count;
    }

}
