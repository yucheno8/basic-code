package cn.itcast.day09.demo07Integer;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    �Զ�װ����Զ����䣺
        �������͵����ݺͰ�װ��֮������Զ����໥ת��
        JDK1.5֮����ֵ�������
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
            �Զ�װ�䣺ֱ�Ӱ�int���͵�������ֵ����װ��
            Integer in = 1; ���൱�� Integer in = new Integer(1);
         */
        Integer in = 1;

        /*
            �Զ����䣺in�ǰ�װ�࣬�޷�ֱ�Ӳ������㣬�����Զ�ת��Ϊ�������͵����ݣ��ٲ������
            in + 2; ���൱�� in.intValue() + 2 = 3;
            in = in + 2; ���൱�� in = new Integer(3); �Զ�װ��
         */
        in = in + 2;
        System.out.println(in);

        // ArrayList�����޷�ֱ�Ӵ洢���������Դ洢Integer��װ��
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // �Զ�װ�� list.add(new Integer(1));

        int i = list.get(0); // �Զ����� list.get(0).inValue();

    }
}
