package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
ע�⣺����ͨ���ӿ�ʵ����Ķ��������ýӿڵ��еľ�̬������
��ȷ�÷���ͨ���ӿ����ƣ�ֱ�ӵ������еľ�̬������
��ʽ��
�ӿ�����.��̬������(����);
 */
public class Demo03Interface {
    public static void main(String[] args) {
        // ������ʵ�������
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl(); // ��̬�����Ͷ���û�ù�ϵ��֮�����й�ϵ������д������Ҫ��

        // ����д����
//        impl.methodStatic();
        MyInterfaceStatic.methodStatic();
    }
}
