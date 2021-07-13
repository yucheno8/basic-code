package cn.itcast.day07.demo05ArrayList;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2020/5/5/005
 **/

/*
题目：
自定义四个学生对象，添加到集合，并遍历。

思路：
1. 自定义Student学生类，四个部分（① Private类型的成员变量；② 无参构造方法；③ 全参构造方法；④ getter和setter方法）。
2. 创建一个集合，用来存储学生对象。泛型：<Student>
3. 根据类，创建4个学生对象
4. 将4个学生对象添加到集合中：add
5. 遍历集合：for、size、get
 */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公，", 20);
        Student two = new Student("欧阳锋，", 21);
        Student three = new Student("黄药师，", 22);
        Student four = new Student("段智兴，", 23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "年龄：" + stu.getAge());
        }
    }

}
