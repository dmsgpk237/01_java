package com.dmsgpk.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster();

        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 = " + monster1.hp);

        System.out.println();

        // 어이쿠 실수 몬스터 체력이 -200이라니!?
        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2.name : " + monster2.name);
        System.out.println("monster2.hp : " + monster2.hp);

        System.out.println();

        Monster monster3 = new Monster();
        monster3.name = "아마겟돈";
        monster3.setHp(200); // hp가 200으로 설정되고, hp가 입력한 값으로 변경됐다는 아내문구가 나온다.
        System.out.println("monster3.name : " + monster3.name);
        System.out.println("monster3.hp : " + monster3.hp);

        System.out.println();

        Monster monster4 = new Monster();
        monster4.name = "미달이";
        monster4.setHp(-1000); // hp 0으로 설정;
        System.out.println("monster4.name : " + monster4.name);
        System.out.println("monster4.hp : " + monster4.hp);


    }
}
