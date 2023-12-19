package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void simpleIfElseIfStatement () {

        /*
         * [if-elseIf문 표현식
         * if(조건식) {
         *   조건식1이 true일 때 싱핼할 명령문;
         * } else if (조건식2) {
         *   조건식1은 false이고, 조건식2는 true일 때 실행할 명령문
         * } else {
         *   조건식1,2 모두 false인 경우 실행할 명령문;
         * }
         * */

        System.out.println("펑~! 상신령이 나타났다!");
        System.out.print("어느 도끼가 네 도끼니? (1. 금도끼 / 2. 은도끼 / 3. 쇠도끼) : ");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if (answer == 1)
        {
            System.out.println("거짓말치지 말거라! 욕심이 과하구나 네 이놈~!");

        } else if (answer == 2) { // else가 실행이 안된다
            System.out.println("욕심을 크게 부리지는 않았으나 거짓말을 하는구나, 네 이놈!");
        }
        else {
            System.out.println("너는 정말 정직한 나무꾼이로구나, 옛다 다 가지렴~");
        }

            System.out.println("산신령은 다시 연못으로 사라진다,,, 펑~!");

        }

        public void nestedIfElseIfStatement() {

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("학생의 이름 : ");
            String name = scanner1.nextLine();
            System.out.print("학생의 점수 : ");
            int score = scanner1.nextInt();

            String grade = ""; /////// 굉장히 중요합니다.. if we type anything into the "", it would be inputted into the variable "grade"
//  지역변수
            if (score >= 90) {
                grade = "A"; // 다시 봐
                if (score > 95) {
                    grade = grade + "+"; // or grade += "+";
                }

            } else if (score >= 80) {
                grade = "B";
                if (score > 85) {
                    grade = grade + "+";
                }
            } else if (score >= 70) {
                grade = "C";
                if (score > 75) {
                    grade = grade + "+";
                }
            } else if (score >= 60) {
                grade = "D";
                if (score > 65) {
                    grade = grade + "+";
                }
            } else { // if (score <= 60) { >>> redeundant
                grade = "F";
            }
            System.out.println(name + " 학생의 점수는 " + score + " 이고, 등급은 " + grade + " 입니다.");

            // index!


        }
    }
