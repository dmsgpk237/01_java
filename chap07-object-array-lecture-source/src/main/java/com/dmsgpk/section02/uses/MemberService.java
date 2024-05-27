package com.dmsgpk.section02.uses;

public class MemberService {
    // 연결만 해주는 곳이고 실제 구현은 다른 곳에서 한다.

    // 멤버를 등록하는 서비스
    public void signUpMembers() {

        // 멤버를 등록할 메소드를 생성했습니다. 여기에 등록할 회원 정보를 배열로 입력해주세요.
        Member[] members = new Member[5];

        //원래는 입력을 받아야 하지만, 지금은 입력을 받았다고 가정하고 여기에서 값을 넣어줄게욥.

        members[0] = new Member(1, "01", "001", "권은혜", 26, '여');
        members[1] = new Member(2, "02", "002", "스폰지밥", 10, '남');
        members[2] = new Member(3, "03", "003", "뚱이", 20, '남');
        members[3] = new Member(4, "04", "004", "징징이", 30, '남');
        members[4] = new Member(5, "05", "005", "짱구", 40, '남');

        // 입력에 대한 처리는 따로 클래스를 만들어서 진행합니다.
        // MemberRegister 클래스를 만들어서 그 안에서 처리를 해줄겁니다. 그래서 주소값만 거기로 복사해줄게욥
        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members); //member 배열의 주소값을 복사
        // 레지스터 안에 regist라는 메소드를 만들어주고 거기에 주소값을 줘요.

    }

    // 멤버를 보여주는 서비스
    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("=========== 가입된 회원의 정보 ===========");

        //MemberFinder에서 return 받은 Member[]
        Member[] foundMembers = finder.fineAllMembers(); // 크기가 10

        for (Member m : foundMembers) {

            if(m != null) {
                System.out.println(m.getInformation());
            } else {
                System.out.println("정보가 없습니다.");
            }
        }
        System.out.println("------------------------------------------");
    }
}
