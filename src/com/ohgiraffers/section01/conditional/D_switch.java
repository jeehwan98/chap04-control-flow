package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void simpleSwitchStatement() {
        /*
         * [switch문 표현식]
         * switch(비교할변수) { == variable 만 들어간다
         *   case 비교값1 : 비교할변수의 값 == 비교값1 인 경우 실행할 구문; break;
         *   case 비교값2 : 비교할변수의 값 == 비교값2 인 경우 실행할 구문; break;
         *   default : 위 case에 모두 해당하지 않는 경우 실행할 구문; break;
         * }
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int firstNum = scanner.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int secondNum = scanner.nextInt();
        System.out.print("연산 기호 입력 (+ - * %) : ");
        char operator = scanner.next().charAt(0); // 문자 형으로 했기 때문에 값이 이상하게 나오는 것이다

        int result = 0;

        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break; // break를 없애면 "잘못된 연산자를 입력하였습니다" 가 뜬다
            case '-':
                result = firstNum - secondNum;
                break;// 걸지 않으면 case 가 쭉 이어진다
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            default:
                System.out.println("잘못된 연산자를 입력하였습니다.");
                break;
        }
        System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result); // 왜 ""을 input 하는 것인지?
        // String으로 반환을 해서 그런 것인가
    }

        public void switchVendingMachine() {

            System.out.println(" === Ohgiraffers Vending Machine === ");
            System.out.println("코카콜라   펩시   칠성사이다   피크닉   핫식스");
            System.out.println(" ===================================== ");
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("음료를 선택해 주세요 : ");
            String drinks = scanner2.nextLine();
            System.out.print("개수 : ");
            int numberOfDrinks = scanner2.nextInt();

            int price = 0;

            switch (drinks) {
                case "코카콜라":
                    price = 1700;
                    break;

                case "칠성사이다":
                    price = 1500;
                    break;

                case "펩시":
                    price = 1800;
                    break;

                case "피크닉":
                    price = 1000;
                    break;

                case "핫식스":
                    price = 2100;
                    break;
                default:
                    System.out.println("없어요");
            }
                    System.out.println(drinks + "를 " + numberOfDrinks + "개 선택하셨습니다. 가격은 " + (price * numberOfDrinks) + "원입니다");

            }

        }

