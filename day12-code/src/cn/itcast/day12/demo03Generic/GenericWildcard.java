package cn.itcast.day12.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ���͵�ͨ�����
        ?�������������������
    ʹ�÷�����
        ���ܴ�������ʹ��
        ֻ����Ϊ�����Ĳ���ʹ��
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

        // ArrayList<?> list = new ArrayList<>(); // ����д����

        print(list1);
        print(list2);
    }

    /*
        ����һ���������ܱ����������͵�ArrayList����
        ��ʱ�����ǲ�֪��ArrayList����ʹ��ʲô�������ͣ����Է��͵�ͨ�������������������
        ע�⣺
            ����û�н��̸����
     */
    public static void print(ArrayList<?> list) {
        // ʹ�õ�������������
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            // it.next()������ȡ������Object
            Object obj = it.next();
            System.out.println(obj);
        }

        // ʹ��forѭ����������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
