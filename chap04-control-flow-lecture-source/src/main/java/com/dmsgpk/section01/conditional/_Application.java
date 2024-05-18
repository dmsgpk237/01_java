package com.dmsgpk.section01.conditional;

public class _Application {
    // 실행용 클래스

    public static void main(String[] args) {

        A_If aIf = new A_If();

        // aIf.testSimpleIfStatement(); //단일 if문
        // aIf.testNestedIfStatement(); //중접 if문

        B_IfElse bIfElse = new B_IfElse(); // bIfelse(클래스)를 선언한 것.
        // bIfElse.testSimpleIfElseStatement(); -> 단일 if-else문
        // -> bIfelse 안에 있는 (.) 참조연산자를 사용해서 다른 클래스에 있는 (tset 뭐시기) 메소드를 불러와 사용하는 것.
        // bIfElse.testNestedIfElseStatement(); -> 중첩 if-else문

        C_IfElseIf cIfElse = new C_IfElseIf();
        // cIfElse.testSimpleIfElseIfStatement();
        // cIfElse.testNestedIfElseIfStatement2();

        D_switch dSwitch = new D_switch();
        // dSwitch.testSimpleSwitchStatement();
        // dSwitch.testSwitchVendingMachine();

        D_switch_test dSwitchTest = new D_switch_test();
        // D_switch_test.testSimpleSwitch2Statement();

        E_study eStudy = new E_study();
        eStudy.testStudyIfStatement();
        eStudy.testStudySwitchStatement();

        //이건 집에서 해보는 숙제입니담!

    }
}

