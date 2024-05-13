package com.dmsgpk.section2.variable;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 변수의 명명 규칙
         *
         * 변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 존재한다.
         * 실무적으로 굉장히 중요하기 때문에 숙지가 필수적이다.
         * 또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
         * */

        /*
         * 변수의 명명 규칙
         * 1. 컴파일 에러를 발생시키는 규칙
         *   1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
         *   1-2. 예약어는 사용이 불가능하다.
         *       예약어? : 자바에서 미리 사용하겠다고 컴파일러와 약속한 키워드들을 의미한다.
         *       주요예약어는 수업자료 pdf에 첨부되어 있음.
         *   1-3. 변수명은 대문자와 소문자를 구분합니다.
         *   1-4. 변수명은 숫자로 시작할 수 없다.(단, 숫자를 섞어서 쓰는 것은 가능)
         *   1-5. 특수 기호는 '_'와 '$'만 사용 가능하다.(공백을 사용할 수 없다)
         *
         * 2. 컴파일 에러를 발생시키지는 않는 개발자들끼리의 규칙 (암묵적 규칙)
         *   2-1. 변수명의 길이 제한은 없다.(적당히 하긴 해야 함)
         *   2-2. 변수명이 합성어로 이루어진 경우, 첫 단어는 소문자, 두번째 시작 단어부터는 대문자로 시작한다.(camel-case)
         *       예) int myAge; (낙타 등이랑 비슷해서 camel case라고 한다)
         *   2-3. 단어와 단어 사이의 연결은 언더스코어(언더바_)로 하지 않는다. (2-2를 지켜야 함)
         *       상수를 사용할 때는 특수하게 사용이 허용된다.
         *   2-4. 한글로 변수명을 짓는게 가능하지만, 권장되지는 않는다.(한글을 취급하는 다양한 방식 때문에 에러 유발)
         *       예) int 내나이; = 19; / 한글을 컴퓨터가 인식하게 하는게 다 다르기 때문.
         *   2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
         *   2-6. 전형저인 변수 이름이 있다면 가급적 그 이름을 사용하도록 한다.
         *       예) count, sum, avg등
         *   2-7. 변수명은 명사형으로 작성한다.
         *   2-8. boolean형은 의문문으로 가급적 긍정의 형태로 네이밍한다.
         *       예) isTure, isAlive O , isDead X
         * */

        // 컴파일 에러를 발생시키는 규칙
        int age = 20;
        // int age; -> 동일한 변수명을 가지므로 에러가 발생함.

        // int true; -> 예약어 사용 불가
        // int byte;

        int Age = 20; // 위에서 만든 age와 다른 변수로 취급된다.
        int Ture = 20; // 예약어 true와 다른 변수로 취급한다.

        // int 1age = 20; -> 숫자로 시작하기 때문에 컴파일 에러가 발생한다.
        int age1 = 20; // 숫자가 맨 앞에 있지 않아 사용 가능하다.

        int _age = 20; // 언더스코어(_)는 사용 가능. 처음 중간 마지막 상관 없음.
        int $harp = 20; // $도 사용가능, 처음 중간 마지막 상관 없음.
        // int a@ge; -> 사용가능한 특수문자 외에는 사용이 불가능하다.
        // int a ge; -> 공백도 불가능하다.


        // 암묵적 약속
        // 변수의 길이에는 제한이 없지만, 적당히 하자.
        int alwjdnzjldlwbfhdksjbdklggkmdj;

        /*
         * camel case
         * 합성어일 경우 첫 단어는 모두 소문자, 두 번째 시작 단어는 대문자로 시작한다.
         * 변수는 camel case를 지키지만, 클래스 이름은 첫 문자 대문자를 지켜준다. 예) Application class
         * 미리 만들어 놓은 코드를 라이브러리라고 한다. 프로그래밍을 할 때 미리 만들어진 코드를 가져와서 사용하는데,
         *  그 라이브러리도 camel case를 지키기 때문에 함께 지켜서 사용해야 한다.
         * */
        int maxAge = 20;
        int minAge = 10;

        String user_name;
        String userName;

        int 나이; // 가능하지만 권장하지 않음.

        String s; // 뭘 뜻하는 것인지 알 수 없기 때문에 변수가 어떤 의미인지 파악할 수 있는 이름으로 작성.
        String name; // 파악가능.

        // 전형적인 변수명들
        int sum = 10; // 합
        int max = 0; // 최대
        int min = 0; // 최소
        int count = 1; // 계수

        String goHome;
        String home; // 변수는 명사형으로

        boolean isAlive = true;
        boolean isDead = false; // 부정형보다 긍정형이 더 나은 방식이다.
        boolean isTrue = true;

        


    }
}
