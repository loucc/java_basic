package com.interview.javabasic.coreStudy;

/**
 * this ,super ,static ,final abstract
 * <p>
 * 类之间的关系  ： 依赖 ，聚合， 继承
 */
public class OOPTest {
    public static void main(String[] args) {
        /**
         * 一、类和对象的使用
         *
         * 1，创建类，设计类的成员
         * 2，创建类的对象
         * 3，通过 “ 对象.属性 ” 或 “对象.方法” 来调用 对象的结构
         *
         * 二、若创建多个对象，每个对象 都独立的拥有一套类的属性
         * 意味着：如果修改一个对象的属性a的值，则另一个对象的a属性值 不受影响
         */

        // 创建类的对象 = 实例化一个类
        Person p = new Person();

        // 对象p 来调用Person的 属性 和 方法
        p.name = "李雷";
        p.isMarried = true;
        p.eat("李磊", 12);
        p.work();
    }


}

class Person {
    // 属性 或  成员变量
    boolean isMarried;
    public String name;
    public int age;

    // 构造器
    public Person() {
    }

    public Person(String n, boolean im) {
        name = n;
        isMarried = im;
    }

    // 方法 或者 函数
    public void work() {
        System.out.println("人要走路了。。。");
    }

    public String eat(String name, int age) {
        return name + " 爱吃鱼。 今年" + age + "岁了。";
    }

    public String eat(String name) {
        return name + " 爱吃鱼。 今年" + age + "岁了。";
    }
}

