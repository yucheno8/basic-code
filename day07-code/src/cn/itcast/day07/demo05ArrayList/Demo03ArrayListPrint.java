package cn.itcast.day07.demo05ArrayList;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2020/5/5/005
 **/

/*
集合作为方法参数

题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔每个元素。
格式参照{元素@元素@元素}。

System.out.println(list);           [10,20,30]
printArrayList(list);               {10@20@30}
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list); // [张三丰, 宋远桥, 张无忌, 张翠山]

        printArrayList(list);
    }

    /*
    定义方法的三要素
        返回值类型：只是进行打印而已，没有运算，没有结果；所以用void
        方法名称：printArraylist
        参数列表：Arraylist
     */
    public static void printArrayList(ArrayList<String> l) {
        // 格式： {10@20@30}
        System.out.print("{");
        for (int i = 0; i < l.size(); i++) {
            if (i == l.size() - 1) {
                System.out.println(l.get(i) + "}");
            } else {
                System.out.print(l.get(i) + "@");
            }
        }
    }
}
