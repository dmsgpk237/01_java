package com.dmsgpk.jumptojava.Q2;

public class Q2 {
    // Q2. 홀수 짝수 판별하기
    public static void main(String[] args) {
        int a = 15;

        int ab = a % 2;

        if (ab == 1) {
            System.out.println(a + "는 홀수입니다.");
        } else {
            System.out.println(a + "는 짝수입니다.");
        }
    }
}
