package com.dmsgpk.practice_problem.stream.product;

import com.dmsgpk.practice_problem.product.Product;
import com.dmsgpk.section02.terminal.Application1;
import com.dmsgpk.section02.terminal.Application2;
import com.dmsgpk.section02.terminal.Application3;
import com.dmsgpk.section02.terminal.Application4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        // 문제별 메소드를 만들어서 작성하세요.

        //원래는 앱 객체를 만들어서 가져왔으면 됨. 근데 안 돼서 메인 메소드 안으로 옮겼음.
        List<Product> list = List.of(
                new Product("아이폰X", "apple", "전자기기류", 1000000),
                new Product("맥프로", "apple", "전자기기류", 6300000),
                new Product("베지밀", "정식품", "음료류", 1000000),
                new Product("파스타면", "de cecco", "식품류", 10000),
                new Product("LG G7", "LG", "전자기기", 700000),
                new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
                new Product("고양이", "베르나르베르베르", "도서", 15000),
                new Product("간다, 봐라", "법정스님", "도서", 8900),
                new Product("까페라떼", "디초코", "음료류", 4000),
                new Product("아포가토", "디초코", "디저트류", 4500)

        );

        // 선언된 리스트를 stream을 사용한다.
        // stream을 사용한 리스트 안에서 전자기기류가 있는 프로덕트를 찾는다.
        // 프로덕트 안에서 카테고리가 전자기기류인 프로덕트 네임을 출력한다.
        // 불리언 타입으로 문자열을 어떻게 비교하는가?



        // 1번 문제: 전자기기류만 모두 출력하세요.
        System.out.println("============ 1번 문제 ============");
        list.stream().filter(product -> product.getCategory().equals("전자기기류"))
                .forEach(System.out::println);



        // 2번 문제: apple사가 전제품 10% 할인한다고 할때, 해당제품명과 할인된 가격을 출력하세요.
        System.out.println("============ 2번 문제 ============");
        list.stream()
                .filter(price -> price.getBrand().equals("apple"))
                .map(i -> new Product())

//                .limit(1)
//                .peek(product -> new Product(product.getPrice() * 0.9))
//                .map(i -> new Product((i.getPrice()) * 0.9))
//                .flatMap(p -> new Product(p.getProductName(), p.getBrand(), p.getCategory(), p.getPrice()))
//                .flatMap(i -> new Product(i.getPrice() * 0.9))

                .forEach(price -> System.out.println("apple사의 제품은 " + price + "이며, 제품의 할인된 가격은" + price + "입니다."));


        // 3번 문제: 디초코 상표명이 "dechocolatecoffee"로 변경되었다.
        //	        스트림상에서 디초코 상품들의 상표명을 "dechocolatecoffee"로 변경하고 출력하세요.




        // 4번 문제: 금액이 십만원 이상인 상품을 따로 list로 생성하고 출력하세요.
        System.out.println("============ 4번 문제 ============");




    }


}
