package com.dmsgpk.jumptojava.Q5;

public class Q5 {
    //Q5. 문자열 바꾸기

    public static void main(String[] args) {

        String a = "a:b:c:d";
        System.out.println("바꾸기 전 : " + a);
        String b = a.replace("a:b:c:d", "a#b#c#d");
        System.out.println("바꾼 후 : " + b);
    }
}
