package com.dmsgpk.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    //Computer는 하나의 Product이지만, 모든 Product는 computer가 아니다.

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    // 기본 생성자


    public Computer() {

        //super();

        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    // Computer만의 필드를 초기화하는 생성자
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    //    @Override
//    public String getInfo() {
//        // 부모클래스의 필드까지 다 출력을 하려면 다 써줬어야 했음.
//
//        return "Computer ["
//                + "code = " + super.getCode()
//                + ", name = " + super.getName()
//                + ", price = " + super.getPrice()
//                + ", brand = " + super.getBrand()
//                + ", manufactureingDate = " + super.getManufacturingDate()
//                + ", cpu = " + this.cpu
//                + ", hdd = " + this.hdd
//                + ", ram = " + this.ram
//                + ", operationSystem = " + this.operationSystem
//                + "]";
//    }

    /*
    * super.getInformation() : 정상적으로 부모의메소드를 호출
    * this.getInformation() : 스스로 자기 자신을 계속 부르는 재귀호출이 일어남. stackOverflow 발생
    * getInformation() : this. 가 자동으로 추가돼 재귀호출이 일어난다.
    *
    * => 부모클래스에 있는 메소드를 사용하고 싶다면, super.를 명시 해줘야 한다.
    * */

    @Override
    public String getInfo() {
        return super.getInfo()
                + "Computer ["
                + ", cpu = " + this.cpu
                + ", hdd = " + this.hdd
                + ", ram = " + this.ram
                + ", operationSystem = " + this.operationSystem
                + "]";
    }
}
