package com.dmsgpk.section05.parameter;

public class ParameterTest {
    public void testPrimaryTypeParameter(int[] num) {

        System.out.println("매개변수로 전달받은 값 : " + num);

    }

    public void testVariableLengthArrayParameter(String name, String...hobby) {

        /*
        * 가변 길이의 배열은 몇 개가 매개변수로 전달될지 모르는 상황이기에 이름과 구분하기 위해
        * 뒤쪽에 작성해야 한다.
        *
        * 앞 쪽에 작성하는 경우 에러 발생
        * */

        System.out.println("이름 : " + name);
        System.out.println("취미의 개수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }





}
