package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class CharacterProcess {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String alphabet = inAlphabet();

        int count = 0;

        for (int i = 0; i < alphabet.length(); i++) {
            int c = alphabet.charAt(i);

            if ((c >= 97 && c <= 122) || (c >= 65 && c <= 95)) {
                count++;
            }
        }

        System.out.println("전달된 문자열 값에서 영문자는 : " + count + "개 입니다.");




    }


    public int countAlpha(String s) {

        String alphabet = inAlphabet();

        int count = 0;

        for (int i = 0; i < alphabet.length(); i++) {
            int c = alphabet.charAt(i);

            if ((c >= 97 && c <= 122) || (c >= 65 && c <= 95)) {
                count++;
            }
        }
        return count;

    }

    public static String inAlphabet() {

        System.out.println("문자열을 입력하세요 : ");
        String Alphabet = sc.nextLine();

        return Alphabet;
    }




}
