package com.dmsgpk.section03;

public class Account {

    private String ownerName;
    private int balance;

    // 기본생성자, ownerName만 매개변수로 있는 생성자
    // 게터, 세터, toString 오버라이딩 -> 모든 필드가 문자열로 return 되게 하라!


    public Account() {

    }

    public Account(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }

}
