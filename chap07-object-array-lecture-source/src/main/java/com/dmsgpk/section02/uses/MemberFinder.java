package com.dmsgpk.section02.uses;

public class MemberFinder {
    public Member[] fineAllMembers() {
        Member[] foundMembersFromRepository = MemberRepository.findAllmembers();
        // Member Repository의 필드로 있는 10크기의 Member[]

        return foundMembersFromRepository;
    }
}
