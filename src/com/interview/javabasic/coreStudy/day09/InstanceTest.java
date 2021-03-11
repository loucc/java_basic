package com.interview.javabasic.coreStudy.day09;

/**
 * 如何理解万事万物皆对象？
 * 1，在Java语言范畴中，我们将功能、结构等封装到类中，通过类的实例化，来调用具体的功能结构
 * 2，涉及到Java语言与前端HTML、后端的数据库交互时，前后端结构在Java层面交互时，都体现为类，对象
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
//        p.playGame();
//        p.sendMessage();

        // 匿名对象
        // 1,理解：  我们创建的对象，没有显示的赋给一个变量名称，即为匿名对象
        // 2，特征：匿名对象只能调用一次
        // 3，使用：如下
        new Phone().price=3.16;
        p.sendMessage(new Phone());

    }

}

class Phone {
    double price;

    public void sendMessage(Phone phone) {
        System.out.println("发送短信喽,手机价格为："+price);
    }

    public void playGame() {
        System.out.println("玩游戏喽");
    }
}
