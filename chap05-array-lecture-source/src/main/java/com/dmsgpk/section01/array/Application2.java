package com.dmsgpk.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 배열의 사용 방법
        *
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        * */

        /*
        * 배열의 선언
        *
        * 자료형[] 변수명;
        * 자료형 변수명[];
        * */

        // stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것
        int[] iarr;
        char carr[];

        /*
        * 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에
        * 참조 자료형 이라고 한다.
        * */

        // 배열의 할당을 할 시에는 반드시 배열의 크기를 지정해줘야 한다.
        // iarr = new int[]; 크기를 지정하지 않아 할당이 되지 않음.
        iarr = new int [5];
        carr = new char[5]; //배열을 할당할 때는 타입을 맞춰줘야 한다.

        // 선언과 할당을 동시에 할 수 있음.

        int[] iarr2 = new int[10];
        char carr2[] = new char[20];
        long[] larr = new long[30];

        System.out.println("iarr2 : " + iarr2);
        System.out.println("carr2 : " + carr2);
        System.out.println("larr : " + larr);

        /*
        * hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환
        * -> 동일객체인지 비교할 때 사용할 목적으로 많이 쓰이며,
        * 동등객체를 동일객체로 취급하기 위한 용도로 overring 해서 사용한다.
        * */

        System.out.println("iarr2의 hashcode : " + iarr2.hashCode());
        System.out.println("char2의 hashcode : " + carr2.hashCode());

        // 배열의 길이를 알 수 있는 기능을 필드로 제공하고 있다.
        System.out.println("iarr2의 길이 : " + iarr2.length);
        System.out.println("carr2의 길이 : " + carr2.length);
        System.out.println("larr의 길이 : " + larr.length);

        Scanner sc = new Scanner(System.in);

        System.out.println("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hashcode : " + darr.hashCode());
        System.out.println("darr의 길이 : " + darr.length);

        // 한 번 지정한 배열의 크기는 변경할 수 없다.

        darr = new double[30];

        // 배열의 사이즈를 변경한 것이 아닌, 새로운 배열을 생성해서 그 주소값을 레퍼런스 변수에 덮어 쓴 것이다.
        System.out.println("변경된 darr의 hashcode : " + darr.hashCode());
        System.out.println("변경된 darr의 길이 : " + darr.length);

        /*
        darr의 hashcode : 1313922862
        darr의 길이 : 50
        변경된 darr의 hashcode : 495053715
        변경된 darr의 길이 : 30
        */

        // 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조가 불가능하다.

        darr = null;

        System.out.println("삭제 후 darr의 길이 : " + darr.length);
    }
}
