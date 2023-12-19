package com.ohgiraffers.section02.looping;

import java.util.Arrays;
import java.util.Scanner;

public class A_for {
    Scanner scanner = new Scanner(System.in);

    public void simpleForStatement() {

        /* [for문 표현식]
         * for(초기식; 조건시기 증감식) {
         *   조건을 만족하는 경우 수행할 구문 ( = 반복할 구문) */

        for (int i = 1; i <= 10; i++) { // i = 1 ~ 10 // for( ; ; ) = infinite result... therefore print "unreachable statement"!
            System.out.println(i);
        }
        System.out.println("끝~!");
    }

    public void testForExample1() {

        System.out.print("먹고 싶은 메뉴를 입력하세요 : ");
        String menu1 = scanner.nextLine();
        System.out.println(menu1 + "번을 1순위로 먹고 싶습다!");

        /* [반복문으로 개선]
         * 1. 안내 문구 출력
         * 2. 메뉴 이름으로 받아 변수에 저장
         * 3. 저장한 메뉴 이름을 출력
         * */

        for (int i = 1; i <= 10; i++) { // i,j,k,l 를 많이 사용한다.
            System.out.print("먹고 싶은 메뉴를 입력하세요 : ");
            String menu = scanner.nextLine();
            System.out.println(menu + " 를 " + i + "순위로 먹고 싶습니다");
        }

        System.out.println("먹고 싶은 메뉴가 너무 많다, 뭐 먹지...");

    }

    public void testForExample2() {
        /* [1부터 10까지 더해서 출력하기]
         * 1. 1부터 10까지의 정수를 변수에 저장한다.
         * 2. sum이라는 이름을 가진 int형 변수에 1에서 만든 변수의 값을 누산한다.
         * 3.1부터 10까지 더한 결과를 출력한다. */

//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 3;
//        int num4 = 4;
//        int num5 = 5;
//        int num6 = 6;
//        int num7 = 7;
//        int num8 = 8;
//        int num9 = 9;
//        int num10 = 10;
//
//        int sum = 0; // 0 으로 초기화를 시켜줘야한다
//        sum += num1;
//        sum += num2;
//        sum += num3;
//        sum += num4;
//        sum += num5;
//        sum += num6;
//        sum += num7;
//        sum += num8;
//        sum += num9;
//        sum += num10;

//        System.out.println(sum);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            /*
             * [반복할 내용]
             * 1. 변수에 1씩 증가하는 값 담기 (1~10)
             * 2. 저장된 값을 sum에 누산하기 => 반복횟수는 10번
             *
             * [반복하지 않을 내용]
             * 1. 값을 누적해서 저장하기 위한 sum 초기화
             * 2. sum에 누적된 값 출력 */
        }
        System.out.println(sum);

    }

    public void testForExample3() {
        /*
         * [1부터 난수까지 더해서 출력하기]
         * 1. 5~10 사이의 난수를 발생시킨다.
         * 2. 1부터 위에서 발생시킨 난수까지의 합계를 구한다.
         * 3. 2에서 구한 합계를 출력한다. */

        int random = (int) (Math.random() * 6) + 5;
        int sumOfNumbers = 0;

        for (int a = 1; a <= random; a++) {
            sumOfNumbers += a;
        }
        System.out.println("random : " + random);
        System.out.println("sum of the numbers : " + sumOfNumbers);

    }

    public void testforExample4() {
        /*
         * [두 수의 합]
         * 1. Scanner를 이용하여 두 개의 정수르 입력받는다.
         * (단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 진행한다._
         * 2. 입력된 두 수 중, 작은 수부터 큰 수까지의 합계를 구한다.
         * 3. 2에서 구한 값을 출력한다 */




















        Scanner scanner2 = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int firstNum = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int secondNum = scanner.nextInt();
        int sumOfBothNumbers = 0;

//        if (firstNum == secondNum) {
//            System.out.print("정수를 다시 입력 해주세요 : ");
//            return ; // 왜 끝나는지.... void네...


        if (firstNum > secondNum) {
            for (int i = secondNum; i <= firstNum; i++) {
                sumOfBothNumbers += i;
            }
        } else {
            for (int i = firstNum; i <= secondNum; i++) {
                sumOfBothNumbers += i;
            }
        }
        System.out.println("두 정수의 더한 값은 : " + sumOfBothNumbers);

        /* 방법 2. */
        int sum2 = 0;

        int min = Math.min(firstNum, secondNum);
        int max = Math.max(firstNum, secondNum);

        for(int i = min; i <= max; i++) {
            sum2 += i;
        }
        System.out.println("두 정수의 더한 값은 : " + sum2); // 밖에다가 써야 can add all the numbers into one

    }
}