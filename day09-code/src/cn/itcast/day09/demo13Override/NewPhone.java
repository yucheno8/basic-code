package cn.itcast.day09.demo13Override;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/
public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show(); // �Ѹ����show�����ù����ط�����
        // �Լ�����������Ӹ�������
        System.out.println("��ʾ����");
        System.out.println("��ʾͷ��");
    }
}
