package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
java.util.list����ArrayList��ʵ�ֵĽӿ�
 */
public class DemoInterface {

    public static void main(String[] args) {

        // ����ǽӿ����ƣ��ұ���ʵ�������ƣ�����Ƕ�̬д��
        List<String> list = new ArrayList<>(); // �����ӣ���̬��д��

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static List<String> addNames(List<String> list) {
        list.add("�����Ȱ�");
        list.add("��������");
        list.add("�������");
        list.add("ɳ������");
        return list;
    }
}
