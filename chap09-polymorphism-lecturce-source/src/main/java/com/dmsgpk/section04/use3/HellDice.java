package com.dmsgpk.section04.use3;

/*
HellDice

    - Dice 인터페이스를 구현한 구현체
    - getNumber() 시 무조건 4를 return 해준다.
  */


public class HellDice implements Dice{

    @Override
    public int getNumber(int Number) {
        return 4;
    }

}
