package cn.itcast.day12.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    泛型的通配符：
        ?：代表任意的数据类型
    使用方法：
        不能创建对象使用
        只能作为方法的参数使用
 */
public class GenericWildcard {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        // ArrayList<?> list = new ArrayList<>(); // 错误写法！

        print(list1);
        print(list2);
    }

    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型，可以泛型的通配符？来接收数据类型
        注意：
            泛型没有进程概念的
     */
    public static void print(ArrayList<?> list) {
        // 使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            // it.next()方法，取出的是Object
            Object obj = it.next();
            System.out.println(obj);
        }

        // 使用for循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
