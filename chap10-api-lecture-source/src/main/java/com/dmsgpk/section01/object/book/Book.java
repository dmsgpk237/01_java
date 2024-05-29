package com.dmsgpk.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {


    }


    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 오브젝트에 있는 투스트링을 메서드 재정의를 통해 내용을 바꿔준 것
    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 기본 기능을 살려준다 : 두 인스턴스의 주소가 같으면 true를 반환한다.
        if (this == obj) return true;

        // 매개변수가 null이거나 매개변수로 받아온 obj와 비교했을 때 타입이 같지 않으면 false
        if (obj == null || getClass() != obj.getClass()) return false;

        // 다른 필드들을 비교해서 같지 않으면 false 같으면 true
        Book book = (Book) obj;
        return this.number == book.number &&
                this.price == book.price &&
                this.author.equals(book.author) &&
                this.title.equals(book.title);
        // this에서 받아 온 값들과 book 안에 있는 값들이 같은지 확인하는 거다.


    }

    @Override
    public int hashCode() {
        // 곱셈 연산을 누적하기 위해
        int result = 1;

        // 31이 소수이기 때문에 연산할 때 동일한 hashCode 값이 나오지 않을 확률을 증가시킨다.
        // 31 하는게 관례
        final int PRIME = 31;

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }


}
