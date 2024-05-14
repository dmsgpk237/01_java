package com.dmsgpk.section5.typecasting;

public class Application2 {

    public static void main(String[] args) {



        /*
        * 강제형변환
        *
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환 한다.
        * 예시) (바꿀자료형-캐스트 연산자) 값;
        * */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제형 규칙
        *   1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요하다.
        *   1-2. 실수를 정수로 변경 시 강제형변환이 필요하다.
        *   1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
        *
        *   > 프로그래머 작업자가 데이터가 손실이 있을 수 있는 상황에서 사용한다.
        * */

        // long 자료형 -> int 자료형

        long lnum = 8;
        //int inum = lnum; -> 데이터 손실 가능성을 컴파일러가 알려준다.
        int inum = (int) lnum; // 변경하려는 자료형을 명시하여, 강제 형변환을 해야 한다.
        System.out.println("inum = " + inum);

        short snum = (short) inum;
        System.out.println("snum = " + snum);

        byte bynum = (byte) inum;
        System.out.println("bynum = " + bynum);


        //실수끼리의 강제형변환
        double dnum = 0.9;
        // float fnum = dnum;
        float fnum = (float) dnum;
        System.out.println("fnum = " + fnum);

        //실수를 정수로 변경시 강제 형변환
        float fnum2 = 4.0f;
        // long lnum2 = fnum2; -> 소수점 뒷자리 부분의 손실이 날 수 있어서 float 형태가 long에 들어갈 수 없음. 컴파일 에러
        long lnum2 = (long) fnum2;
        System.out.println("lnum2 = " + lnum2);
        
        // 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a';
        byte bnum2 = (byte) ch;
        System.out.println("bnum2 = " + bnum2);

        short snum2 = (short) ch; //정수형과 숫자형은 부호비트가 있는데 그 부호비트 값의 범위가 다르기 때문에 형변환을 해줘야 한다.
        System.out.println("snum2 = " + snum2);


        //정수를 char 자료형에 강제형변환 대입하기
        int num1 =97;
        int num2 = 97;

        char ch2 = (char) num1;
        System.out.println("ch2 = " + ch2);
        char ch3 = (char) num2;
        System.out.println("ch3 = " + ch3);

        //강제 형변환을 해도 논리형은 규칙에서 제외된다
//        boolean isTure = true;
//        byte b = (byte) isTure;
//        short s = (short) isTure;
//        int i = (short) isTure;
//        float f = (float) isTure;
//        double d = (double) isTure;
//        char c = (char) isTure;




    }
}
