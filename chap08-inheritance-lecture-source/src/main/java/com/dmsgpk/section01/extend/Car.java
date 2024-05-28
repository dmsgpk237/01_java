package com.dmsgpk.section01.extend;

public class Car {
    // 부모클래스

    // 자동차의 달리는 상태를 확인할 수 있는 필드
    private boolean runningStatus;

    // 기본생성자 만드는 방법: public + 클래스 이름
    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨...");


    }

    // 자동차 딜리기
    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다...");
    }

    // 자동차 경적
    public void soundHorn() {
        // 자동차가 주행중일 때만 경적을 울리게 한다.
        if(isRunning()) {
            System.out.println("뛰~뛰~빵!빵!");
        } else {
            System.out.println("주행중인 상태가 아니면 경적을 울릴 수 없습니다.");
        }


    }
    // protected -> 같은 패키지 내에서 자유롭게 사용가능  + 자식도 자유롭게 사용 가능
    // 의인화를 이용한 추상화, 자기 자신이 자기를 관리할 수 있음.
    protected boolean isRunning() {
        return runningStatus;
    }

    // 자동차 멈추기
    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");


    }


}
