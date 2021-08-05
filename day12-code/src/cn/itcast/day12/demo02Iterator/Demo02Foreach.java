package cn.itcast.day12.demo02Iterator;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ��ǿforѭ�����ײ�ʹ�õ�Ҳ�ǵ�������ʹ��forѭ���ĸ�ʽ�����˵���������д
    ��JDK1.5֮����ֵ�������
    Collection<E> extends Iterable<E>�����еĵ��л��Ͷ�����ʹ����ǿfor
    public interface Iterable<T>ʵ������ӿ���������Ϊ"foreach"����Ŀ�ꡣ

    ��ʽ��
        for(����/������������� ������ : ������/������) {
            System.out.println(������);
        }
 */
public class Demo02Foreach {
    public static void main(String[] args) {

        demo02();

    }

    // ʹ����ǿforѭ����������
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
