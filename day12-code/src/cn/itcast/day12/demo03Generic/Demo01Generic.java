package cn.itcast.day12.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/
public class Demo01Generic {

    public static void main(String[] args) {
        show02();
    }

    /*
        �������϶���ʹ�÷���
        �ô���
            1.����������ת�����鷳���洢����ʲô���ͣ�ȡ���ľ���ʲô����
            2.���������쳣����������֮����׳����쳣�����������˱����ڣ�д�����ʱ��ᱨ��
        �׶ˣ�
            ������ʲô���ͣ�ֻ�ܴ洢ʲô���͵�����
     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        // list.add(12); // Required type : String    Provided : int

        // ʹ�õ���������list����
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + "->" + s.length());
        }

    }

    /*
        �������϶��󣬲�ʹ�÷���
        �ô���
            ���ϲ�ʹ�÷��ͣ�Ĭ�ϵ����;���Object���ͣ����Դ洢�������͵�����
        �׶ˣ�
            ����ȫ���������쳣
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        // ʹ�õ���������list����
        // ��ȡ������
        Iterator it = list.iterator();
        // ʹ�õ������еķ���hasNext��next��������
        while (it.hasNext()) {
            // ȡ��Ԫ��Ҳ��Object����
            Object obj = it.next();
            System.out.println(obj);

            // ��Ҫʹ��String�����еķ�����length��ȡ�ַ����ĳ��ȣ�����ʹ�� ��̬ Object obj = "abc";
            // ��Ҫ����ת��
            // ���׳�ClassCastException����ת���쳣�����ܰ�Integer����ת��ΪString����
            String s = (String) obj;
            System.out.println(s.length());
        }
    }

}
