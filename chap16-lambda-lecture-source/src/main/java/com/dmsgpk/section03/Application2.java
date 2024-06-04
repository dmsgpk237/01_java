package com.dmsgpk.section03;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {

        // 객체 생성할 때 쓰는 키워드 : new
        Function<String, Account> function = Account::new;
        Account account1 = function.apply("홍길동");
        System.out.println(account1);
        Account account2 = function.apply("유관순");
        System.out.println(account2);

    }
}
