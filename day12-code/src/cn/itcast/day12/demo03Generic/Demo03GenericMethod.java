package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ���Ժ��з��͵ķ���
 */
public class Demo03GenericMethod {

    public static void main(String[] args) {
        // ����GenericMethod����
        GenericMethod gm = new GenericMethod();

        /*
            ���ú��з��͵ķ���method01
            ����ʲô���ͣ����;���ʲô����
         */
        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        gm.method02("��̬�����������鴴������ʹ��");

        // ��̬������ͨ������.������(����)����ֱ��ʹ��
        GenericMethod.method02("��̬����");
        GenericMethod.method02(1);

    }
}
