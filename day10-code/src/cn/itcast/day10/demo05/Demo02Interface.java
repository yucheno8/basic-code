package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
1.�ӿڵ�Ĭ�Ϸ���������ͨ���ӿ�ʵ�������ֱ�ӵ��á�
2.�ӿڵ�Ĭ�Ϸ�����Ҳ���Ա��ӿ���������и�����д��
 */
public class Demo02Interface {

    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); // ���ó��󷽷���ʵ�����е����Ҳ��ʵ���ࡣ

        // ����Ĭ�Ϸ��������ʵ���൱��û�У��������ҽӿ�
        a.methodDefault(); // ��������ӵ�Ĭ�Ϸ���
        System.out.println("================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault(); // ʵ����B������д�˽ӿڵ�Ĭ�Ϸ���

    }
}
