package com.dmsgpk.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 난수의 활용
        *
        * Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수 값을 발생시킨다.
        * 필요에 따라 정수 형태의 값을, 원하는 범위 만큼 발생시켜야 하는 경우들이 존재한다.
        *
        *
        * 원하는 범위의 난수를 구하는 공식
        * (int) (Math.random * 구하려는 난수의 개수) + 구하려는 난수의 최소값
        * */

        // 난수의 범위 0 ~ 9
        int random = (int) (Math.random() * 10);
        System.out.println(" 0에서 9 사이의 난수 생성 : " + random);

        int random2 =  (int) (Math.random() * 10) + 1;
        System.out.println("1에서 10 사이의 난수 생성 : " + random2);

        // 10에서 15 사이의 난수 발생
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("10에서 15 사이의 난수 생성 : " + random3);

        // -128에서 127까지의 난수 발생
        int random4 = (int) (Math.random() * 256) -128;
        System.out.println("-128에서 127 사이의 난수 생성 : " + random4);
    }
}
