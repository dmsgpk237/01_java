package com.dmsgpk.section01.user_type;

public class Application {
    public static void main(String[] args) {
        // 회원의 정보 표현 (아이디, 비밀번호, 이름, 나이, 성별, 취미) 이 정보들을 관리하려고 함.

        String id = "user01";
        String password = "pass01";
        String name = "권은혜";
        int age = 26;
        char gender = '여';
        String[] hobby = new String[]{"요리", "영화감상", "꾸미기"};
        System.out.println();

        System.out.println("id = " + id);
        System.out.println("password : " + password);
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("hobby : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

        /*
         * 위와 같이 각각의 변수로 관리하게 되면 몇 가지의 단점이 있다.
         * 1. 변수명을 다 따로 관리해줘야 한다.
         * 2. 모든 회원 정보를 인자로 메소드 호출시, 값을 전달해야 할 때
         *   너무 많은 값을 인자로 전달해야 해서 가독성이 떨어진다.
         * 3. 메소드에서 retrun은 한 개의 값만 가능하기
         *   때문에 다른 타입의 여러 변수를 묶어서 리턴 할 수가 없다.
         * */

        /*
         * 사용자 정의 자료형 사용하기
         *
         * [자료형] [변수명] = new [클래스명]();
         * 사용자 정의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당을 해야한다.
         * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성된다.
         * 아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록
         * heap에 공간을 만들었다.
         * */

        Member member = new Member();

        /*
         * 필드에 접근하기 위해서는 레퍼런스변수명.필드명으로 접근한다.
         * '.' -> 참조연산자, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미이다.
         * 배열은 인덱스로 접근, 객체는 필드명으로 접근한다.
         * */

        System.out.println("========== 생성된 객체 필드값 출력 ==========");
        // 사용할 때는 변수명을 쓰고 참조연산자를 쓰면 된다.
        System.out.println("member id : " + member.id);
        System.out.println("member pwd : " + member.pwd);
        System.out.println("member name : " + member.name);
        System.out.println("member age : " + member.age);
        System.out.println("member gender : " + member.gender);
        System.out.println("member hobby : " + member.hobby);

        System.out.println();
        //필드에 접근해 변수처럼 사용
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "권은혜";
        member.age = 26;
        member.gender = '여';
        member.hobby = new String[]{"영화감상", "요리", "눕기"};

        System.out.println("========== 값 입력 후 객체 필드값 출력 ==========");
        System.out.println("member id : " + member.id);
        System.out.println("member pwd : " + member.pwd);
        System.out.println("member name : " + member.name);
        System.out.println("member age : " + member.age);
        System.out.println("member gender : " + member.gender);
        System.out.print("member hobby : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }

    }


}
