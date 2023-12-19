package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {

        A_if a = new A_if();

//        a.simpleIfStatement(); // method 사용법

//        a.nestedIfStatement();

//        B_ifElse b = new B_ifElse(); // making B_ifElse >> b
//        b.simpleIfElseStatement(); // 실행한다
//        b.nestedIfElseStatement();

//        C_ifElseIf c = new C_ifElseIf();
//        c.simpleIfElseIfStatement();

//        C_ifElseIf c = new C_ifElseIf();
//        c.nestedIfElseIfStatement();

        D_switch d = new D_switch();
//        d.simpleSwitchStatement();
        d.switchVendingMachine();
    }
}
