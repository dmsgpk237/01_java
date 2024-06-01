package com.dmsgpk.jumptojava.Q4;

public class Q4 {
    // Q4. 원하는 숫자 추출하기
    public static void main(String[] args) {
        String pin = "881120-1068234";
        char gender = pin.charAt(7);
        System.out.println("주민등록번호 뒷 자리의 첫 번째 숫자는 : " + gender);
        if (gender == '1') {
            System.out.println("이 사람은 남자입니다.");
        } else if (gender == '2') {
            System.out.println("이 사람은 여자입니다.");
        }
    }
}
