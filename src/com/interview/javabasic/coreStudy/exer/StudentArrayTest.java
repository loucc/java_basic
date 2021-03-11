package com.interview.javabasic.coreStudy.exer;

public class StudentArrayTest {
    public static void main(String[] args) {
        // 声明student对象数组
        Student[] st = new Student[20];

        for (int i = 0; i < st.length; i++) {
            //给数组元素赋值
            st[i] = new Student();
            // 年级
            st[i].className = (int) (Math.random() * (6 - 1 + 1) + 1);
            // 成绩
            st[i].score = (int) (Math.random() * (100 - 0 + 1));
            // 学号
            st[i].number = i + 1;


        }
        // 声明类的实例，调用类中的方法
        StudentArrayTest st1 = new StudentArrayTest();
        // 打印student的信息
        st1.print(st);

        // 进行按成绩排序
        st1.sort(st);
        System.out.println("************************************************");
        // 打印出排序后的数据
        st1.print(st);
        System.out.println("************************************************");
        // 打印一年级的所有学生成绩
        st1.searchClassName(st,1);
    }

    /**
     * 打印对象信息
     *
     * @param st
     */
    public void print(Student[] st) {
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].info());
        }
    }

    /**
     * 查询学生的年级
     *
     * @param st
     * @param className
     */
    public void searchClassName(Student[] st, int className) {
        for (int i = 0; i < st.length; i++) {
            if (st[i].className == className) {
                System.out.println(st[i].info());
            }

        }
    }

    /**
     * 冒泡排序成绩  从小到大排序
     *
     * @param st
     */
    public void sort(Student[] st) {
        for (int i = 0; i < st.length - 1; i++) {
            for (int j = 0; j < st.length - 1 - i; j++) {
                if (st[j].score > st[j + 1].score) {
                    // 如果需要换序，交换的是数组的元素，Student对象！！！
                    Student temp = st[j]; // 声明一个临时变量
                    st[j] = st[j + 1];
                    st[j + 1] = temp;
                }
            }
        }
    }

}


class Student {
    int number; // 学号
    int className;// 年级
    int score; // 分数

    public String info() {
        return className + "年级 " + "学号为：" + number + " ,的学生成绩为：" + score;
    }
}