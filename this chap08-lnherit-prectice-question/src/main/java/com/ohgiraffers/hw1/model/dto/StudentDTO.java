package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{

    private int grade;
    private String major;

    public StudentDTO() {
        super();
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return
                "학생들의 정보입니다. { " +
                        "name: '" + super.name + "'" +
                        ", age: " + super.getAge() +
                        ", height: " + super.getHeigth() +
                        ", weight: " + super.getWeigth() +
                        ", grade: " + grade +
                        ", major: '" + major + '\'' +
                '}';
    }
}
