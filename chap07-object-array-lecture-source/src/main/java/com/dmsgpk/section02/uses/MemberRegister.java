package com.dmsgpk.section02.uses;

public class MemberRegister {

    // 서비스라는 클래스에서 정보를 받아오고, Register라는 클래스에서 받은 정보를 처리하겠다.
    public void regist(Member[] members) {

        System.out.println("회원을 등록합니다.");

        // 멤버스 안에 있는 객체를 하나씩 꺼내서 m이라는 변수에 넣고 m을 하나씩 꺼내서 반복
        for (Member m : members) {

            System.out.println(m.getName() + "님을 회원 등록에 성공했습니다.");
        }

        // 주소값만 받아왔음.
        MemberRepository.store(members); // 레파지토리 클래스에 있는 스토어 메소드에 멤버를..? 반환..?

        if (MemberRepository.store(members)) {
            System.out.println("총" + members.length + "명의 회원 등록에 성공했습니다.");


        }
    }
}
