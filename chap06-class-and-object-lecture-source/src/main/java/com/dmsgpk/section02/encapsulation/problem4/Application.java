package com.dmsgpk.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        // kinds 필드는 priavte으로 접근 제한이 되어있어 필드로 직접 접근이 안 된다
//        monster1.hp = 10;
//        monster1.kinds = "??";

        /*
        * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        * public으로 접근을 허용한 메소드만 이용할 수 있게 해 놓은 것
        * => 이걸 캡슐화(encapsulation)이라고 한다.
        * */



        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        /*
        * 클래스 작성시, 특별한 목적이 아닌 이상 캡슐화를 기본 원칙으로 사용한다.
        * */
    }

}
