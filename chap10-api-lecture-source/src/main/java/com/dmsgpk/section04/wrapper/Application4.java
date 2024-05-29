package com.dmsgpk.section04.wrapper;

import java.util.Date;

public class Application4 {

    public static void main(String[] args) {

        /*
        * Date 클래스
        * JDK 1.0 부터 날짜를 취급하기 위해 사용되던 클래스
        * => 생성자를 비롯해 대부분의 메서드가 Deprecated 되어 있다.
        *
        * Date는 java.sql.Date와 jaca.util.Date가 존재한다.
        * 한 클래스 안에서 두 개의 타입을 전부 사용하게 되면 import를 하더라도
        * 사용하는 타입이 어느 패키지에 있는 Date 클래스인지 모호하기 때문에
        * import해도 풀 클래스 네임을 작성해줘야 한다.
        * */

        /*
        * Deprecated란?
        * 향후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적 사용하지 말라는 의미
        * => 하위 버전 호환성 때문에 한 번에 제거되지 않고 남겨두었다.
        * */

        // java.util.Date;

        //1. 기본생성자를 사용하는 방법
        //   기본 생성자로 인스턴스를 생성하면 운영체제의 날짜 / 시간 / 정보를 이용해서
        //   인스턴스를 만들게 된다.

        Date today = new Date();

        System.out.println(today);

        // 2. Date(Long date) 사용하는 방법
        // getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을
        //             millisecond로 계산해서 long타입으로 반환한다.
        System.out.println(today.getTime()); //1716962208607

        // Wed May 29 14:58:26 KST 2024
        Date time = new Date(1716962306729L);
        System.out.println(time);
    }
}
