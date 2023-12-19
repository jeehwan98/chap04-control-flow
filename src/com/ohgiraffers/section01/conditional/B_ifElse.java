package com.ohgiraffers.section01.conditional;

import java.util.Scanner; // 중간에 위치한다

public class B_ifElse { // 마지막에 class 이름...!

    public void simpleIfElseStatement() {
        /*
         * [if-else문 표현식]
         * if (조건식) {
         * 조건식이 true일 때 실행할 명령문;
         * } else {
         * 조건이 false일 때 실행할 명령문;
         * }
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
                System.out.println("짝수로구나~!");
            } else {
            System.out.println("홀수로구나~!");
        }
        System.out.println("끝~!");
    }

    public void nestedIfElseStatement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("0이다");
        } else if (num != 0) {
            if (num > 0) {
                System.out.println("양수고...");
            }
            if (num < 0) {
                System.out.println("음수고...");
            }

            if (num % 2 == 0) {
                System.out.println("짝수다");
            } else {
                System.out.println("음수다");
            }
        }
        System.out.println("끝~"); // ctrl + alt + l >> 깔끔하게 정리 해줌...!
    }
}

