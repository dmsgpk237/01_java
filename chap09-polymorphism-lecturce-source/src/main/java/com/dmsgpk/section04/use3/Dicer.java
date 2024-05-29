package com.dmsgpk.section04.use3;

/*
 Dicer

    - throwDice 메서드를 가지고 있는 클래스
    throwDice
    - Dice를 매개변수로 받는다.
    - 해당 Dice의 getNumber()를 통해 정수를 반환받고
    - dice Number를 출력해준다.

* */


public class Dicer{

    // Dice를 매개변수로 받아온다 Dice dice
    public void throwDice(Dice dice) {

        int diceNum = dice.getNumber();
        System.out.println(diceNum);
    }

}
