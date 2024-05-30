package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.Member;

public class App {
    public static void main(String[] args) {

        // Member라는 타입의 member라는 이름을 가진 레퍼런스 변수의 공간을 만들어서 Member의 주소값을 넣겠다!
        Member member = new Member();
        // heap에 공간을 만드는데 member와 member2의 주소값은 다르다! 새로운 공간을 만든다!
        Member member2 = new Member();

        /*
        * 객체는 만든 애들, 메서드는 기능, 클래스는 기능모음집,
        * 여기서 클래스 안에 있는 모든 애들은 멤버, 필드는 클래스 안에 선언해서 활용할 것들
        * 핑크색 애들이 필드 키, 넘버, 몸무게 이런 애들
        * Integer는 아무 것도 없는 int(타입, 자료형)에 기능을 준 것이다.
        * 그래서 integer로 선언했을 때 참조연산자(.)를 사용하면 여러가지 기능을 사용할 수 있다.
        *
        * */
        // member.setWeight(); -> 멤버 클래스를 레퍼 변수로 불러오니, 멤버 안에 있는 여러가지 기능을
        //                          사용할 수 있게 된 것.


    }
}
