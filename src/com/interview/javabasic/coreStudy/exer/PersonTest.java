package com.interview.javabasic.coreStudy.exer;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 12;
        p.sex = 1;
        p.name = "哈啰";
        p.showAge();

        int newAge = p.addAge(2);
        System.out.println("新年龄为：" + newAge);
        System.out.println("age的值为：" + p.age);

        //
        Person p2=new Person();
        p2.showAge();// 0
    }
}
