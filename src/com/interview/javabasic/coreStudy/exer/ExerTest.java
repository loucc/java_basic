package com.interview.javabasic.coreStudy.exer;

/**
 * 方法练习
 */
public class ExerTest {
    public static void main(String[] args) {
        ExerTest et = new ExerTest();
        et.method();

    }

    public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
