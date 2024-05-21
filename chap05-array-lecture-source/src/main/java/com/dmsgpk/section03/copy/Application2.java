package com.dmsgpk.section03.copy;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 얕은 복사의 활용
        *
        * 얕은 복사를 활용하는 경우에는 주로 메소드 호출시 인자로 사용하는 경우와
        * 리턴 값에 동일한 배열을 리턴해주고 싶은 경우가 있다.
        * */


        String[] names= {"홍길동", "유관순", "이순신"};

        System.out.println("names 배열의 hashcode : " + names.hashCode());

        print(names);
        String[] animals = getAnimals();
        System.out.println("return받은 animals의 hashCode : " + animals.hashCode());
        print(animals);

    }


    public static String[] getAnimals() {
        String[] animals = new String[] {"Bear", "koala", "Gorilla"};

        //얕은 복사 확인을 위해 hashCode 출력
        System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());

        return animals;

    }


    public static void print(String[] sarr) {
        System.out.println("sarr의 hashCode : " + sarr.hashCode());

        for(int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }
        System.out.println();

    }
}
