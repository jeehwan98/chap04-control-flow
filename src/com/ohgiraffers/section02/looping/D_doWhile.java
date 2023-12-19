package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    public void simpleDoWhileStatement() {

        /*
         * [do-while문 표현식]
         * 초기식
         * do {
         *   1회차에는 무조건 실행하고 이후에는 조선식을 확인하여 수행할 구문 ( = 반복할 구문 )
         *   증감식;
         *
         * } while (조건식)
         *  */


        do {
            System.out.println("동작?!");
        } while (false); // true = 계속 무한 loop
        System.out.println("끝~!"); // false이기 때문에 나와서 끝으로 print한다
    }

    public void printStartTraining() {

        /*
         * [갯수만큼 * 찍기]
         * 1. Scanner를 이용하여 row수(int) 입력 받는다. O
         * 2. 한 줄에 *이 5개인 row를 입력 받은 만큼 출력한다.
         * 단, 충첩 for문을 사용한다.
         *
         *          예시)
         *          *
         *          **
         *          ***
         *          ****
         *          *****
         *  */

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("숫자를 입력할 것 : ");
        int row = scanner1.nextInt(); // inputted into row
        String noOfStars = "*";

        for (int i = 1; i <= row; i++) {
            System.out.println(noOfStars.repeat(i)); // 1,2,3,4,5 는 출력이 잘 되는데.. *랑 곱하는 방식을 모르겠다... 됐다
        }

        /*
         * [입력받은 문자열 출력하기]
         * 1. Scanner를 이용하여 문자열을 입력 받는다. O
         * 2. 입력받은 문자열을 출력해준다. O
         * 3. 만약 "exit"가 입력되면 프로그램을 종료한다.
         *  */
        Scanner scanner = new Scanner(System.in);
        String word = "";

        do {
            System.out.print("아무런 문자열을 입력 해주세요 : ");

            System.out.print(word);
        } while(!word.equals("exit")); //"문자열".equals"문자열2"   문자열인 경우에는 그렇다. int는 == 사용을 해도 된다.
        System.out.println("프로그램을 종료합니다."); //??
    }


}


