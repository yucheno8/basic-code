package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ���庬�з��͵ķ��������Ͷ����ڷ��������η��ͷ���ֵ����֮��

    ��ʽ��
        ���η� <����> ����ֵ���� ������(�����б�ʹ�÷��ͣ�) {
            ������;
        }

    ���з��͵ķ������ڵ��÷�����ʱ��ȷ�����͵���������
    ����ʲô���͵Ĳ��������;���ʲô����

 */
public class GenericMethod {
    // ����һ�����з��͵ķ���
    public <M> void method01(M m) {
        System.out.println(m);
    }

    // ����һ�����з��͵ľ�̬����
    public static <S> void method02(S s) {
        System.out.println(s);
    }
}
