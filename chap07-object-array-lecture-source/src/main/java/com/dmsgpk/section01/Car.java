package com.dmsgpk.section01;

public class Car {

    // 모델 이름
    private String modelName;

    private int maxSpeed;

    public Car(String modelName, int maxSpeed)
    {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    // 필드값 출력 메소드
    public void driveMaxSpeed() {
        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed + "km/s로 달려갑니다.");
    }
}
