package com.dmsgpk.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
        monster1.setInfo("도라에몽");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster2.setInfo("노진구");
        monster2.setHp(100);

        Monster monster3 = new Monster();
        monster3.setInfo("퉁퉁이");
        monster3.setHp(500);

        Monster monster4 = new Monster();
        monster4.setInfo("비실이");
        monster4.setHp(120);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        /*
         1. 사람이 실수해서 hp를 음수로 만드는 문제를 해결
         -> 음수를 입력하면 0으로 입력되게 함

         2. 필드명을 수정했을 때 필드를 직접적으로 사용하는 다른 클래스들에서
            compile error가 나와 유지보수가 어려워지는 문제를 해결
         -> 필드에 직접적으로 접근하지 않고 간접적으로 접근함.

         하지만 여전히 직접접근이 가능하기 때문에 완벽한 유지보수는 아님
         -> 정보를 보안하면서 유지보수가 가능하게 해야 함.
         */


    }



}
