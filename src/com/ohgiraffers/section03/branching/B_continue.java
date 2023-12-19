package com.ohgiraffers.section03.branching;

public class B_continue {

    public void simpleContinueStatement() {

        /*
        * [continue]
        * continue는 반복문 내에서 사용한다.
        * 반복문의 해당 회차를 넘기고, 증감식으로 이동하게 한다.
        * 일반적으로 if(조건식) {continue; } 이런 식으로 사용한다.
        * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용한다.
        * */

        for (int i = 1; i <= 100; i++) {
            if(i % 4 != 0) { // 4의 배수가 아니면 건넌다
                continue; // continue 라는 조건을 걸어준다
            }
            System.out.println(i);
        }

    }

    public void testJumpContinue() {
        label1:
        for(int dan = 2; dan < 10; dan++) { //얘는 처음부터 끝 까지 다 돌아감

            System.out.println("===== " + dan + "단 =====");
            label2:
            for (int su = 1; su < 10; su++) {
                if (su % 2 != 0) {
                    continue label1; // 다 무시하고 증감식으로 가 >> 아무것도 출력이 안된다 ??? :: 처음부터 1이라 바로 label1로 돌아간다,,,
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
                if (su > 5) {
                }
            }

            System.out.println("====================");

        }

        /*
        * 구구단
        * 중첩된 while문을 활용하여 구구단을 출력한다. */
    }
    public void testWhileSample3() {

        /*
        * [문자열을 문자형으로 쪼개어 출력하기]
        * 1. Scanner를 이용하여 문자열을 입력받는다.
        * 2. 입력한 문자열의 인덱스를 활용하여 한 글자씩 문자형으로 출력한다.
        * (참고) 문자열에서 인덱스에 해당하는 문자형을 반환하는 기능 charAt(인덱스)를 사용하고,
        *       문자열의 길이를 정수형으로 반환하는 기능 length()를 사용하면 된다.
        * */
    }
}
