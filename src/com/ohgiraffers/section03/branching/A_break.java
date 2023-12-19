package com.ohgiraffers.section03.branching;

public class A_break {

    public void simpleBreakStatement() {
        /*
         * [break]
         * 반복문을 빠져나올 목적으로 사용한다.
         * 반복문의 조건식 판단 결과와 상관없이 반복문을 빠져나온다.
         * 일반적으로 if(조거식) {break;} 이런 식으로 사용된다
         * 단, swtich문은 반복문이 아니지만 예외적으로 사용된다.
         * */

        int i = 1;
        int sum = 0; //누산할 값을 미리 정해준다


        while (true) { // 조건이 맞으면 빠져 나오는 상황
            sum += i;

            if (i == 100) {
                break; // i 가 100을 도달하면 여기 method에서 빠져 나온다

            }
            i++;

        }
        System.out.println("1부터 100까지의 합 = " + sum); // break statement을 넣어야 한다
    }
    public void testJumpBreak() {

        label1: // "for문" label column을 달아준다
        for(int dan = 2; dan < 10; dan++) { //얘는 처음부터 끝 까지 다 돌아감

            System.out.println("===== " + dan + "단 =====");
            label2: //바로 위에 label 작성 해줄 수 있따.
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                if(su > 5){
                    break label1; // break 찍고 label1 에서 멈춘다
                }
            }

            System.out.println("====================");
        }
    }
}
