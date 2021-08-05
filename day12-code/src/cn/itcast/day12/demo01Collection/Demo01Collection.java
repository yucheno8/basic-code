package cn.itcast.day12.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yucheno8
 * @date 2021/7/30/030
 **/

/*
java.util.Collection接口
    所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
    任意的单列集合都可以使用collection接口中的方法

共性的方法：
    public boolean add(E e);       向集合中添加元素
    public boolean remove(E e);    删除集合中的某个元素
    public void clear();           清空集合所有的元素
    public boolean contains(E e);  判断集合中是否包含某个元素
    public boolean isEmpty();      判断集合是否为空
    public int size();             获取集合的长度
    public Object[] toArray();     将集合转成一个数组
 */
public class Demo01Collection {

    public static void main(String[] args) {
        // 创建集合对象,可以使用对象
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); // 重写了toString方法
        coll.add("hello");
        coll.add("world");
        coll.add("heima");
        coll.add("java");
        System.out.println(coll); // [hello, world, heima, java]

        // boolean remove(E e);    删除集合中的某个元素
        /*boolean result = coll.remove("hello");
        System.out.println(result); // false
        System.out.println(coll); // [hello, world, heima, java]*/

        // void clear();           清空集合所有的元素
        /*coll.clear();
        System.out.println(coll); // []*/

        // boolean contains(E e);  判断集合中是否包含某个元素
        /*boolean result = coll.contains("world");
        System.out.println(result); // true*/

        // boolean isEmpty();      判断集合是否为空
        /*boolean result = coll.isEmpty();
        System.out.println(result); // false*/

        // int size();             获取集合的长度
        /*int result = coll.size(); // 4
        System.out.println(result);*/

        // Object[] toArray();     将集合转成一个数组
        Object[] arr = coll.toArray();
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i ]);
        }

    }
}
