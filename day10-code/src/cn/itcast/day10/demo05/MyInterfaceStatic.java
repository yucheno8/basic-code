package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
��Java 8��ʼ���ӿڵ��������徲̬������
��ʽ��
    public static ����ֵ���� ��������(�����б�) {
        ������
    }
��ʾ�����ǽ�abstract����default����static���ɣ����Ϸ����塣
 */
public interface MyInterfaceStatic {
    public static void methodStatic() {
        System.out.println("���ǽӿڵľ�̬������");
    }
}
