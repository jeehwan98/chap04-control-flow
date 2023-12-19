package com.ohgiraffers.section02.looping;

public class C_while {

    public void simpleWhileStatement() {

        /* [while문 표현식]
         * 초기식;
         * while(조건식)
         *   조건식을 만족할 때 수행할 구문(= 반복할 구문);
         *   증감식;
         * }
         * */

        int i = 1;
        while (i <= 10) { // nned to write an expression
            System.out.println(i);
            i++;
        }


        }
    public void testWhileSample1() {

        int i = 1;
        int sum = 0;
        while (i<=10) { // assignment
//            sum +=  ... 10까지 더할 것이다!
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
