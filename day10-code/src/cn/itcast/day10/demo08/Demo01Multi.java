package cn.itcast.day10.demo08;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
���뵱�����ֶ�̬�ԣ���ʵ����һ�仰����������ָ���������
��ʽ��
    �������� ������ = new ��������(); // �����ӣ��ͽж�̬
    ���ߣ�
    �ӿ����� ������ = new ʵ��������();
 */
public class Demo01Multi {

    public static void main(String[] args) {
        // ��̬��д��
        // ��ุ������ã�ָ�����Ҳ�����Ķ���
        Fu obj = new Zi();

        obj.method(); // �������෽��
        obj.methodFu();

    }
}
