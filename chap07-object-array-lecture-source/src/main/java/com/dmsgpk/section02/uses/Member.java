package com.dmsgpk.section02.uses;

public class Member {

    // static은 정적 키워드이기 때문에 static을 썼을 때는 바로 기본 값으로 초기화 되고 그 이후에도 동일하다.
    // 하지만 static을 쓰지 않으면 초기화가 되지 않은 상태로 우리가 초기화 해주기 전까지는 기본 값으로 초기화 된다.
    // 그리고 static을 사용하지 않은 변수들은 매번 프로그램을 실행할 때마다 새롭게 기본 값으로 초기화된다.
    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;


    // 매개변수의 값을 입력받는 생성자를 만들었다. Member 클래스 안에 있는 private 사용해 선언한 변수들에 매개변수 값을 입력하겠다!
    public Member(int num, String id, String pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        // 이건 생성자 만드는 방법을 통해 쉽게 생성할 수 있다.
    }

    // getter의 역할이 뭐지?
    // 외부에서 객체의 데이터를 읽을 때 사용하는 메소드, 메소드로 필드값을 가공해서 외부로 전달한다!
    public int getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // setter의 역할은 뭐지?
    // 외부에서 메소드를 통해 데이터에 접근하도록 유도한다! 유효한 값만 저장할 수 있도록!
    public void setNum(int num) {
        this.num = num;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInformation() {
        return "Member [num = " + num + ", id = " + id + ", pwd = " + pwd + ", " +
                "name = " + name + ", age = " + age + ", gender = " + gender + "]";
    }
    //getInfomation을 불러올 때 리턴 값을 반환할게욥
}
