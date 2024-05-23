package com.dmsgpk.test12345;

public class Joshua02 {

    /*
    문제 설명:

    Joshua Bloch가 쓴 "Effective Java" 책을 만들고, 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.
    */

    private String name;
    private String book;
    private int page;
    private String cover;

    public void joshuaName(String name) {
        this.name = name;
    }

    public void joshuaBook(String book) {
        this.book = book;
    }

    public void joshuaPage(int page) {
        this.page = page;
    }

    public void joshuaCover(String cover) {
        this.cover = cover;
    }

    public String getInfo() {
        return this.name + " 가 쓴 책 이름은 : " + this.book + " 이며, " +
                "이 책의 커버는 : " + this.cover + " 이고, 이 책의 페이지는 " + this.page + "p 입니다.";
    }
}
