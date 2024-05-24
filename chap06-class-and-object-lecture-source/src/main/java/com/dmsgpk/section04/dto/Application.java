package com.dmsgpk.section04.dto;

public class Application {
    public static void main(String[] args) {

        // 생성자를 이용한 초기화(한 번에) vs 설정자를 이용한 초기화(setter 사용)

        /*
        * 1.  생성자를 이용한 초기화
        * 장점 : setter 메소드를 여러 번 호출해서 사용하지 않고, 단 한 번의 호출로 인스턴스 생성 및 초기화 가능
        * 단점 : 필드를 초기화 할 매개변수의 갯수를 경우의 수 별로 모두 만들어야 한다.
        *       호출시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈에 보기가 어렵다.
        *       예시) 아이디, 비밀번호, 이름이 모두 dmsgpk인 경우
        *       new User("dmsgpk", "dmsgpk", "dmsgpk"); -> 어떤 자료인지 확인하기 어렵다.
        *
        * 2. 설정자를 이용한 초기화
        * 장점 : 필드를 초기화 하는 각각의 값들이 어떤 필드를 초기화 하는지 명확히 볼 수 없다.
        *       예) 아이디, 비밀번호, 이름이 모두 dmsgpk인 경우
                * User user = new User);
                * user.setId("dmsgpk");
                * user.setPwd("dmsgpk");
                * -> 여기서 컴퓨터가 꺼지면 문제됨.
                * user.setName("dmsgpk");
        *   호출하는 코드만 봐도 어떤 값이 필드를 초기화 하는 내용인지 쉽게 알 수 있다.
        * 단점 : 하나의 인스턴스를 생성할 때 하나의 출로는 끝나지 않는다.
        * */

        // 1. 생성자를 이용한 초기화
        UserDTO user1 = new UserDTO("dmsgpk", "dmsgpk", "dmsgpk", new java.util.Date());

        // 기본 생성자를 이용한 초기화
//        UserDTO user2 = new UserDTO();
//        user2.setId("dmsgpk");
//        user2.getPwd("dmsgpk");
//        user2.getName("dmsgpk");
//        user2.setEnrollDate(new java.util.Date());
//
//        // 기본 생성자를 이용한 초기화 + 설정자(setter)
//        UserDTO user2 = new UserDTO();
//        user2.setId("dmsgpk");
//        user2.getPwd("dmsgpk");
//        user2.getName("dmsgpk");
//        user2.setEnrollDate(new java.util.Date());

    }


}
