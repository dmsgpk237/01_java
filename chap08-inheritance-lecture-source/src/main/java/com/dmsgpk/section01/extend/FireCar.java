package com.dmsgpk.section01.extend;

// 상속할 때 쓰는 키워드 : extends, Car라는 객체를 확장시키고 기능을 추가해서 FireCar라는 객체를 만들어주겠어!
public class FireCar extends Car  {

    /*
    * FireCar extends Car
    * Car 클래스를 부모클래스로, FireCar를 자식클래스로 사용한다는 뜻.
    * Car의 모든 멤버 -> FireCar로 상속받음
    * 생성자는 상속받지 못한다.
    * 부모의 private 멤버는 접근이 불가하다.
    * */

    // 기본생성자
    public FireCar() {

        //부모클래스의 생성자를 호출하는 것
        super();
        // 컴파일러가 자동으로 추가해줘서 명시적, 묵시적 작성 가능

        System.out.println("FireCar 기본 생성자 호출함...");
    }

    //FireCar 목적에 맞게 메소드 재정의 = overriding
    // 우선 메소드 구조를 똑같이 해야 함, 메소드 시그니처를 맞춰주는 것임.
    // 컴파일러가 인식하기에 메소드가 재정의 했다고 인식함.

    // 메소드 재정의를 인식하게 하려면 -> @, 어노테이션을 붙여줘야 함
    /*
    * @Override
    * 오버라이딩이 정상적으로 작성된 것인지 체크해주는 기능
    * 오버라이딩 하는 메소드는 기본적으로 부모 메소드의 선언 내용을 그대로 작성해야 한다.
    * */

    @Override
    public void soundHorn() {

        /*
        * isRunning은 private일때는 사용이 불가능 했다.
        * 하지만 protected 접근제한자로 바꿔 사용이 가능하게 함.
        * (캡슐화 위배)를 했지만 그나마 범위가 좁은 것으로 대체 했다.
        * */

        if (isRunning()) {
            System.out.println("빠ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ아아아아아아아앙!!!!!!!!!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비켜주세요오");
        }
    }

    //물뿌리는 기능 추가
    public void sprayWater() {

        System.out.println("=========== 불난 곳을 발견했습니다. 물을 뿌립니다 쑤아ㅏㅏㅏㅏㅏ===========");

    }





}
