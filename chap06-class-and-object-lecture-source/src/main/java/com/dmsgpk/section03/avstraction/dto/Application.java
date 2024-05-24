package com.dmsgpk.section03.avstraction.dto;

public class Application {

    /*
    * 캡슐화의 원칙에는 일부 어긋나긴 하지만, 다른 목적을 가진 클래스와 객체를 추상화하는 기법
    * -> DTO (Data Transfer Object)
    * 이러한 객체를 설계할 때는 행위가 아닌 데이터 위주이며, 캡슐화의 원칙을 준수하여
    * 모든 필드를 private으로 직접 접근을 막고,
    * 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해준다.
    * private 필드와 필드값을 수정하는 설정자(settet) 필드에 접근하는 접근자(getter)
    * 주로 계층간 데이터를 주고 받을 목적으로 사용한다.
    * */

    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();

        // 설정자를 이용해서 사용해보기
        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(180.8);
        member.setWeigth(80.5);
        member.setActicated(true);

        // 접근자를 이용해서 출력해보기
        System.out.println("회원번호 : " + member.getNumber());
        System.out.println("회원 이름 : " + member.getName());
        System.out.println("회원 나이 : " + member.getAge());
        System.out.println("회원 성별 : " + member.getGender());
        System.out.println("회원 키 : " + member.getHeight());
        System.out.println("회원 몸무게 : " + member.getWeigth());
        System.out.println("회원 활성화 상태 : " + member.isActicated());


        // 지금까지는 비어있는 기본 값을 만들고 그 뒤에 값을 넣어줬다면
        // 생성자를 활용해서 선언과 동시에 값을 넣어주는 방법을 활용해본다.







    }

}
