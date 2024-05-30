package com.dmsgpk.section01.list.run;

import java.util.Stack;

public class Application3 {
    public static void main(String[] args) {

        /*
        * Stack
        * 후입선출(LIFO - Last in First Out) 방식의 자료구조
        * */

        Stack<Integer> integerStack = new Stack<>();

        // 넣을 때는 push로
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        // add도 사용 가능하지만 stack이 Vector에서 가져와서 사용하는 거라서 권장되지 않음.
        // integerStack.add(6);

        System.out.println("integerStack" + integerStack);

        /*
        * 스택에서 요소를 찾을 때 search()를 사용한다.
        * ()안 숫자는 인덱스가 아닌, 위에서부터의 순번을 의미한다.
        * 가장 상단의 위치가 0이 아니라 1부터 시작된다.
        *
        * */
        System.out.println(integerStack.search(5));

        /*
        * stack에서 값을 거내는 메서드
        * peek() : 해당 스택의 가장 마지막에 있는 요소 반환
        * pop() : 해당 스택의 가장 마지막에 있는 요소 반환, 반환 후 제거
        * */

        System.out.println("peek() : " + integerStack.peek());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);





    }
}
