package com.dmsgpk.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate; //생성일시

    /*
    * 생성자의 작성 위치
    *
    * 문법상으로 클래스 내부에 작성하면 되지만,
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 적는 것이 관례
    *
    * */

    /*
    * 생성자의 사용목적
    *
    * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화 하며,
    *    인스턴스를 생성할 목적으로 주로 사용된다.
    * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않겠다는 의미가 있음.
    *    -> 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용(초기값 전달 강제)
    * */

    /*
    * 생성자 작성 시 주의할 점
    * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다. (대/소문자까지)
    * 2. 생성자 메소드는 반환형을 작성하지 않는다. -> (생성자가 아닌 일반 메소드로 인식되기 때문)
    * */

    /*
    * 생성자의 종류
    * 1. 기본 생성자(매개변수가 없는 생성자)
    *
    * 2. 매개변수 있는 생성자
    *
    * 매개변수가 있는 생성자가 한 개라도 존재하면 기본 생성자를 자바 Compiler가 자동으로 추가하지 않는다.
    * 기본 생성자가 필요한 경우에는 반드시 명시적으로 작성을 해야한다.
    * */

    // 기본 생성자
    public User() {
        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    public String getInfo() {

        return "User [id = " + this.id + " , pwd = " + this.pwd +
                " , name = " + this.name + " , enrollDate = " + this.enrollDate + "]";
    }

    // 매개변수 있는 생성자(id, pwd, name의 초기화를 담당)
    public User(String id, String pwd, String name) {
        // 매게변수 있는 생성자의 주 목적은 인스턴스 생성 시점에 필드를 원하는 값으로 초기화하기 위함

        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화 하는 생성자 호출함...");



    }


}
