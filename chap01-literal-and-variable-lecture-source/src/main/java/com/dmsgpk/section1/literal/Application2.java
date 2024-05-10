package com.dmsgpk.section1.literal;

public class Application2 {

    public static void main(String[] args) {


        //수업 목표: 값을 직접 연산하여 출력 할 수 있다.
        //이 때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.

        //정수와 정수의 연산
        System.out.println("================ 정수와 정수의 연산 ================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10); //나누기를 한 몫의 값
        System.out.println(123 % 10); //나누기를 한 나머지 값

        //실수와 실수의 연산
        System.out.println("================ 실수와 실수의 연산 ================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23); //계산의 결과는 실수 형태로 나온다.
        System.out.println(1.23 * 10);
        System.out.println(1.23 / 10);
        System.out.println(1.23 % 1.0);

        //정수와 실수의 연산
        //정수와 실수를 연산하면 결과는 항상 실수가 나온다.
        System.out.println("================ 정수와 실수의 연산 ================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);
        // 모든 값이 실수로 나왔다.

        //문자와 문자의 연산
        //문자는 내부적으로 숫자로 인식되어 연산된다. ASCII 코드 참고.
        //하지만 아스키코드는 제한적이기 때문에 현재는 유니코드를 사용.
        System.out.println("================ 문자와 문자의 연산 ================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        //문자와 정수의 연산
        System.out.println("================ 문자와 정수의 연산 ================");
        System.out.println('a' + '1');
        System.out.println('a' - '1');
        System.out.println('a' * '1');
        System.out.println('a' / '1');
        System.out.println('a' % '1');

        //문자와 실수의 연산
        //결과는 실수의 형태로 나오게 된다.
        System.out.println("================ 문자와 실수의 연산 ================");
        System.out.println('a' + 0.5);
        System.out.println('a' - 0.5);
        System.out.println('a' * 0.5);
        System.out.println('a' / 0.5);
        System.out.println('a' % 0.5);

        /*
        * 결론: 문자는 내부적으로 숫자 취급을 한다.
        * */

        //문자열과 문자열의 연산
        //문자열과 문자열의 연산은 문자열 이어붙이기가 된다.
        //문자열과 문자열의 연산은 '+' 연산만 가능하다.
        System.out.println("================ 문자열과 문자열의 연산 ================");
        System.out.println("hello" + "world");
//      System.out.println("hello" - "world");
//      System.out.println("hello" * "world");
//      System.out.println("hello" / "world");
//      System.out.println("hello" % "world");

        //문자열과 다른 형태의 값 연산
        System.out.println("================ 문자열과 다른 형태의 값 연산 ================");
        System.out.println("eunhye" + 123); //정수와의 연산
        System.out.println("dmsgpk" + 1.23); //실수와의 연산
        System.out.println("dmsgp" + 'k'); //문자와의 연산
        System.out.println("eunhye" + true);
        System.out.println("eunhye" + false);

        //주의해야 할 점: 숫자로 된 문자열 형태의 값도 '+' 연산을 했을 때 문자열 합치기가 된다.
        System.out.println("123" + "456"); //123456
        


    }


}
