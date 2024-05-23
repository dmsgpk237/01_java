package com.dmsgpk.section02.encapsulation.problem1;

public class Monster {
//    String name; //몬스터 이름
//    int hp; //몬스터 체력

    // hp에 음수가 저장되는 것을 막고자 hp가 양수인 경우에만 입력하는 hp로 변경하고
    // 0보다 작은 경우 0으로 변경할 수 있게 하는 기능이 필요하다.

    String name;
    int hp;

    // 클래스에 자료형들이 들어가는데, 그래서 이 안에 메소드를 넣을 겁니다.

    public void setHp(int hp) {
        // hp를 매개변수로 받아서 사용

        /*
        * this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
        * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
        * 전역변수에 접근하기 위해서는 this.를 명시해야 한다.
        * */

        if (hp > 0 ) {
            System.out.println("양수값이 입력되었습니다. 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp =hp;
            // 지역변수 hp가 이미 있기 때문에 활성화되지 않는다. 지역변수는 해당 지역변수를 우선시하는 경향이 있다.
            // 여기서 this를 사용해주는 거다.
        } else {
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
            this.hp = 0;
        }

    }






}
