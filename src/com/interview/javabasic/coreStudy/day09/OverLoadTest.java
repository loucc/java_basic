package com.interview.javabasic.coreStudy.day09;

/**
 * 方法重载
 * 1，定义：在 {同一个类} 中，允许存在一个以上的 {同名方法}，只要它们的{参数个数}或者{参数类型}不同即可
 * “两同一不同”：  同一个类、相同方法名  （重要！！！！！！）
 * 参数列表不同：参数个数不同、参数类型不同
 * <p>
 * 2，判断是否重载  ： 跟方法的 {权限修饰符}、{返回值类型}、{形参变量名}、{方法体都没有关系}
 */
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest ot = new OverLoadTest();
        ot.getSum(1,5);
    }

    // 如下的四个方法就构成了重载
    public void getSum(int i, int j) {
        System.out.println(i + j);
    }

    public void getSum(double i, double j) {
        System.out.println(i + j);
    }

    // 是重载
    public void getSum(String s, int j) {

    }

    // 是重载
    public void getSum(int j, String s) {

    }

}
