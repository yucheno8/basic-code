package cn.itcast.day11.Demo03;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

// �������������������ô��ʽ�ǣ��ⲿ������.this.�ⲿ���Ա������
public class Outer {

    int num = 10; // �ⲿ��ĳ�Ա����

    public class Inner {

        int num = 20; // �ڲ���ĳ�Ա����

        public void  methodInner() {
            int num = 30; // �ڲ��෽���ľֲ�����
            System.out.println(num); // �ֲ��������ͽ�ԭ��
            System.out.println(this.num); // �ڲ���ĳ�Ա����
            System.out.println(Outer.this.num); // �ⲿ��ĳ�Ա����
        }

    }
}
