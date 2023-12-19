package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudan() {

        for (int dan = 2; dan < 10; dan++) { // prints a line from 2 to 10

            System.out.println("== " + dan + "단 ==");
            for (int su = 1; su < 10; su++) { // dan x (1~9)
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println("=========");
        }
    }

    public void printStarInputRow() {
        /*
         * [별 5개씩 찍기]
         * 1. Scanner를 이용하여 row수(int) 입력 받는다.
         * 2. 한 줄에 *이 5개인 row를 입력 받은 만큼 출력한다.
         * 단, 충첩 for문을 사용한다. */


        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 수 : ");
        int row = scanner.nextInt();

        String hihi = "*****";
        for (int i = 5; i < row; i++) {

            for (int j = 0; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

}
