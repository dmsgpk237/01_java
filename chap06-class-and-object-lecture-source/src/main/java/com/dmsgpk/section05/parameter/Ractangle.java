package com.dmsgpk.section05.parameter;

public class Ractangle {

    // 가로 세로
    private double width;
    private double heigth;

    // 생성자
    public Ractangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    // Setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    // Getter
    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    // 사각형의 넓이를 구해서 출력하는 메소드
    public void calcArea() {
        double area = width * width;

        System.out.println("이 사각형의 넓이는 " + area + " 입니다");
    }

    // 사각형의 둘레를 구해서 출력하는 메소드
    public void calcRound() {
        double round = (width + heigth) * 2;

        System.out.println("이 사각형의 둘레는 " + round + " 입니다");

    }

}
