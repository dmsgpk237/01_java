package com.dmsgpk.section.method;

public class Application4 {
    public static void main(String[] args) {

        //여러개의 전달인자를 이용한 메소드의 호출 테스트
        Application4 app4 = new Application4();

        String name = "권은혜";
        int age = 26;
        char gender = '여';

        // 지역변수는 메서드 안에서만 중복이 일어나지 않으면 된다.
        // 지역변수와 전역변수의 이름은 달라도 컴파일 오류가 뜨지 않는다.

        app4.testMethod(name, age, gender);
    }

    //당신의 이름은 -이고, 나이는 -이며, 성별은 -입니다.
    public void testMethod(String name, int age, final char gender) {

        System.out.println("당신의 이름은 " + name + " 이고, 나이는 " + age + " 이며, 성별은 " + gender + " 입니다.");





    }
}
