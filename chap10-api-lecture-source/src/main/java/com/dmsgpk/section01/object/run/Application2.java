package com.dmsgpk.section01.object.run;

import com.dmsgpk.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {

        // Object의 equals()

        /*
         * equals()
         *
         * equals 메서드는 매개변수로 전달받은 인스턴스와 == 연산하여
         * true or false를 반환한다.
         * 동일한 인스턴스인지를 비교하는 기능을 한다.
         *
         * 동일객체, 동등객체
         * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
         * 동등객체 : 주소는 다르더라도 필드값들이 동일한 객체를 동등객체라고 한다.
         *
         * */

        // equals()의 기본기능은 동일객체를 판단한다.
        // => 동일한 필드값을 가지는 객체를 같은 객체로 판단하고 싶을 때 사용한다.
        // => 오버라이딩을 통해 각각의 필드가 동일한 값을 가지는지 확인 가능하다.

        Book book1 = new Book(1, "홍길동전", "허준박물관", 50000);
        Book book2 = new Book(1, "홍길동전", "허준박물관", 50000);

        System.out.println("두 인스턴스의 equals() 비교 : " + (book1.equals(book2))); //true
        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2)); //false



    }
}
