package com.dmsgpk.section03.avstraction.dto;

public class MemberDTO {

    // 회원번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부(활성화여부) 를 관리하자!

    /*
    * DTO(Data Transfer Object)
    * -> 데이터 전달용 객체
    *
    * 화면(UI) 또는 데이터 베이스 테이블을 기준으로 만든다.
    * 백엔드에서 만드는 프로그램을 화면에 띄운다고 했을 때, 모든 걸 보여주지 않고 일부만 필요할 때가 있다.
    * 모든 데이터를 전달하지 않고, 필요한 데이터만 전달받기 위해 DTO가 필요한 것이다.
    * */

    private int number;         // 회원번호
    private String name;        // 회원명
    private int age;            // 나이
    private char gender;        // 성별
    private double height;      // 키
    private double weigth;      // 몸무게
    private boolean isActicated;// 회원탈퇴여부(활성화여부)

    // Setter(설정자) / Getter(접근자)
    // Setter(설정자) / Getter(접근자)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.

    /*
    * Setter(설정자) 작성 규칙
    * : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
    *   호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
    *
    * [표현식]
    * public void set필드명(매개변수) {    *
    *   필드 = 매개변수;
    * }
    *
    * [작성예시]
    * public void setName(String name) {
    *   this.name = name;
    * }
    *
    * */

    /*
    * Getter(접근자) 작성 규칙
    * : 필드의 값을 반환받을 목적의 메소드 집합을 의미한다.
    *   각 접근자는 하나의 필드에만 접근하도록 한다.
    *   필드에서 접근해서 기록된 값을 return을 이용하여 변환하며,
    *   이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
    *
    * [표현식]
    * public 반환형 get필드명() {
    *   return 반환값;
    * }
    *
    * [작성예시]
    * public String getName() {
    *   return this.name;
    * }
    *
    * */

    // setter
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void setActicated(boolean acticated) {
        isActicated = acticated;
    }


    // getter
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeigth() {
        return weigth;
    }

    // boolean의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 관례
    public boolean isActicated() {
        return isActicated;
    }
}
