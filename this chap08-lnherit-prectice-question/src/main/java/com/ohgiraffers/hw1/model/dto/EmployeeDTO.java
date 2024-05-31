package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    private int salary;
    private String dept;

    public EmployeeDTO() {

    }

    public EmployeeDTO(String name, int age, Double height, Double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        this.getAge();
    }

    @Override
    public void setHeigth(double heigth) {
        this.getHeigth();
    }

    @Override
    public void setWeigth(double weigth) {
        this.getWeigth();
    }

    @Override
    public String toString() {
        return "사원들의 정보입니다. {" +
                "name: '" + super.name + "'" +
                ", age: " + super.getAge() +
                ", heigth: " + super.getHeigth() +
                ", weigth: " + super.getWeigth() +
                ", salary: " + salary +
                ", dept: '" + dept + '\'' +
                '}';
    }
}
