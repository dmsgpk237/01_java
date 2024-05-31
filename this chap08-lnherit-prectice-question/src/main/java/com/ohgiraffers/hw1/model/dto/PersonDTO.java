package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {

    protected String name; // 프라이빗 타입으로 멤버변수를 생성했다.
    private int age;
    private double heigth;
    private double weigth;

    public PersonDTO() {

    }

    public PersonDTO(int age, double heigth, double weigth) {
        this.age = age;
        this.heigth = heigth;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                ", weigth=" + weigth +
                '}';
    }



}
