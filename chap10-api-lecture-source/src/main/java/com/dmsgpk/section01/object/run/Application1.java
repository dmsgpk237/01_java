package com.dmsgpk.section01.object.run;

import com.dmsgpk.section01.object.book.Book;

public class Application1 {

    // Object 클래스의 toString
    public static void main(String[] args) {

        /*
        * Object
        *
        * 모든 클래스는 Object 클래스의 후손이다.
        * 따라서 Object 클래스가 가진 메서드를 자신의 것처럼 사용할 수 있다.
        * 또한 부모클래스가 가지는 메서드를 오버라이딩하여 사용하는 것도 가능하다.
        *
        * Object 클래스의 메서드 중 많이 오버라이딩해서 사용하는 메서드들로는
        * toString(), equals(), hashcode() 등이 있다.
        *
        * */

        // book 객체 만들기
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "목민심서", "정약용", 50000);
        Book book3 = new Book(1, "홍길동전", "정약용", 50000);

        System.out.println("book1 = " + book1);
        System.out.println("book1 = " + book2);
        System.out.println("book1 = " + book3);
        // 이렇게 출력하면 Object의 풀네임이랑 주소가 나온다.
        // System.out.println("book1 = " + book1.toString); //이 뒤에 toString이 숨겨져 있기 때문이다.

        System.out.println("============== toString overriding 이후 ==============");
        System.out.println("boo1 = " + book1);
        System.out.println("boo2 = " + book2);
        System.out.println("boo3 = " + book3);

    }
}
