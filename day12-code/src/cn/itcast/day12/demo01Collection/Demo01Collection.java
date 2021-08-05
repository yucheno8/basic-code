package cn.itcast.day12.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yucheno8
 * @date 2021/7/30/030
 **/

/*
java.util.Collection�ӿ�
    ���е��м��ϵ����Ľӿڣ���߶��������е��м��Ϲ��Եķ���
    ����ĵ��м��϶�����ʹ��collection�ӿ��еķ���

���Եķ�����
    public boolean add(E e);       �򼯺������Ԫ��
    public boolean remove(E e);    ɾ�������е�ĳ��Ԫ��
    public void clear();           ��ռ������е�Ԫ��
    public boolean contains(E e);  �жϼ������Ƿ����ĳ��Ԫ��
    public boolean isEmpty();      �жϼ����Ƿ�Ϊ��
    public int size();             ��ȡ���ϵĳ���
    public Object[] toArray();     ������ת��һ������
 */
public class Demo01Collection {

    public static void main(String[] args) {
        // �������϶���,����ʹ�ö���
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); // ��д��toString����
        coll.add("hello");
        coll.add("world");
        coll.add("heima");
        coll.add("java");
        System.out.println(coll); // [hello, world, heima, java]

        // boolean remove(E e);    ɾ�������е�ĳ��Ԫ��
        /*boolean result = coll.remove("hello");
        System.out.println(result); // false
        System.out.println(coll); // [hello, world, heima, java]*/

        // void clear();           ��ռ������е�Ԫ��
        /*coll.clear();
        System.out.println(coll); // []*/

        // boolean contains(E e);  �жϼ������Ƿ����ĳ��Ԫ��
        /*boolean result = coll.contains("world");
        System.out.println(result); // true*/

        // boolean isEmpty();      �жϼ����Ƿ�Ϊ��
        /*boolean result = coll.isEmpty();
        System.out.println(result); // false*/

        // int size();             ��ȡ���ϵĳ���
        /*int result = coll.size(); // 4
        System.out.println(result);*/

        // Object[] toArray();     ������ת��һ������
        Object[] arr = coll.toArray();
        // ��������
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i ]);
        }

    }
}
