package com.dmsgpk.section02.superkeyword;


import java.util.Date;

public class Application {
    public static void main(String[] args) {

        /*
        * super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여
        *         부모 클래스의 인스턴스도 함께 생성하게 된다.
        *         이때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수
        *
        * super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입,
        *           개수, 순서가 일치하는 부모의 생성자를 호출하게 된다.
        *           this()가 해당 클래스 내에 다른 생성자를 호출하는 구문이라면
        *           super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
        *           호출할 수 있도록 한 구문이다.
        * */

        // 상속관계를 만들어서 자식객체를 생성하게 되면, super를 이용해서 부모 생성자를 호출하는 것.
        // 부모 인스턴스 주소를 보관하고 싶다면, super 사용. super는 부모 클래스의 주소를 바라본다.

        // Product를 상속받는 computer
        // Product 기본생성자로 인스턴스 생성

        // Product product = new Product();
        // System.out.println(product.getInfo());

        // Product의 모든 필드를 초기화하는 생성자로 인스턴스 생성
//        Product product = new Product("s-01234", "삼성", "갤럭시Z폴드4",
//                2398000, java.util.Date());
//        System.out.println(product.getInfo());

        // computer 기본 생성자
//        Computer computer = new Computer();
//        System.out.println(computer.getInfo());

//        Computer computer2 = new Computer(
//                "퀼컴 스냅드래곤 ", 512, 12, "안드로이드");
//        System.out.println(computer2.getInfo());


        // computer의 부모필드도 함께 초기화하는 생성자로 인스턴스 생성
        Computer computer3 = new Computer("s-01234", "삼성", "갤럭시Z폴드4",
                2398000, new Date(), "퀼컴 스냅드래곤 ", 512, 12,
                "안드로이드");
        System.out.println(computer3.getInfo());

    }
}
