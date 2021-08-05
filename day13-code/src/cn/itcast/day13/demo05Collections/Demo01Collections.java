package cn.itcast.day13.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author yucheno8
 * @date 2021/8/3/003
 **/

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。

 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 往集合中添加多个元素
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/

        // public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        Collections.addAll(list, "a", "b", "c", "d", "e");

        System.out.println(list); // [a, b, c, d, e]

        // public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list); // [e, a, d, b, c] | [e, b, c, a, d]
    }
}
