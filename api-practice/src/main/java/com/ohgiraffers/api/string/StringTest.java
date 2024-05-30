package com.ohgiraffers.api.string;

public class StringTest {
    public static void main(String[] args) {
        StringProcess sp = new StringProcess();
        // hello world는 메서드 preChar를 호출할 때 인자로 넘겨줬음.
        String result = sp.preChar("hello world");
        System.out.println(result);

        int num = sp.charSu("application car cable", 'c');
        System.out.println(num);
    }


}
