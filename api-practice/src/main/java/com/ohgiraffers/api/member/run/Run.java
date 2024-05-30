package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        // | 기준으로 분리
        String[] firstSplitArr = data.split("\\|");

        // 배열 안에 있는 내용 출력
        System.out.println(Arrays.toString(firstSplitArr));

        // , 기준으로 분리
        // firstSplitArr[0] : 1,김연아,165,47,19900905

        //멤버 객체 배열
        Member[] members = new Member[firstSplitArr.length];

        for (int i = 0; i < firstSplitArr.length; i++) {
            String[] secondSplitArr = firstSplitArr[i].split(",");
            Member member = new Member();
            // 분리해서 나온 데이터들을 Memer 라는 클래스의 필드값으로 저장.
            member.setMemberName(secondSplitArr[1]);
            member.setMemberNo(Integer.parseInt(secondSplitArr[0]));
            member.setHeight(Integer.parseInt(secondSplitArr[2]));
            member.setWeight(Integer.parseInt(secondSplitArr[3]));
            LocalDate birt = LocalDate.parse(secondSplitArr[4], DateTimeFormatter.ofPattern("yyyyMMdd"));
            member.setBirth(birt);

            members[i] = member;
        }
        System.out.println(members[0]);
        System.out.println(members[1]);
        System.out.println(members[2]);

    }
}
