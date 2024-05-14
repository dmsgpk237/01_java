package com.dmsgpk.section5.typecasting;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 데이터 형변환
        *
        * 데이터 형변환이 필요한 이유
        * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행 할 수 있다.
        * - 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        * */

        /*
        * 형변환의 종류와 규칙
        * 1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *   1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다.
        *   1-2. 정수는 실수로 자동 형변환 된다.
        *   1-3. 문자형은 int형으로 자동 형변환 된다.
        *   1-4. 논리형은 형변환 규칙에서 제외된다.
        *
        * 2. 강제형변환 (명시적 형변환) : 형변환(cast) 연산자를 이용해 강제적으로 수행하는 타입 변환
        *   2-1. 자동형변환이 적용되지 않는 경우에 필요하다.
        * */

        // 자동형변환 규칙 테스트
        // 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우

        byte bnum = 1;
        short snum = bnum; //이게 자동형변환이다

        System.out.println("snum = " + snum);

        int inum = snum;
        System.out.println("inum = " + inum);

        long lnum = inum;
        System.out.println("lnum = " + lnum);

        // 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다.

        int num1 = 10;
        long num2 = 20;

        //int result1 = num1 + num2; 오른쪽 타입이 계산 후 long이 되었는데 왼쪽 타입은 int라서 컴파일 에러
        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);

        //실수끼리의 자동형변환
        float fnum = 0.4f; //실수형은 double이 기본이기 때문에 초기화 할 때 값 뒤에 f를 붙여줘야 한다.
        double dnum = fnum;
        double result2 = fnum + dnum;
        // float result3 = fnum + dnum;

        System.out.println("result2 = " + result2);
        
        /* 정수를 실수로 변경할 때, 소수점 자리가 없어도 실수 형태처럼 표현이 가능하다
        * 이 때, 데이터 손실이 없기 때문에 자동형변환이 된다.
        * */
        
        long eight = 8;
        float four = eight;

        System.out.println("four = " + four);
        //8로 초기화 했던 것이 8.0으로 변화된다.
        
        float result3 = four + eight;
        System.out.println("result3 = " + result3);
        
        //문자형은 int(정수형)으로 자동 형변환 된다.
        char ch1 = 'a';
        int charNumber = ch1;
        System.out.println("charNumber = " + charNumber);

        // int로 type이 명시적으로 정해져 있지 않은 리터럴 형태의 정수는 char 형 변수에 기록 가능하다
        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

        //논리형은 형변환 규칙에서 제외된다.
        boolean isTure = true;

        
        
        
    }
}
