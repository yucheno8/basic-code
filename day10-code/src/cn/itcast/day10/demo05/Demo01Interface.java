package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
�ӿھͶ����Ĺ����淶��
�ӿ���һ�������������ͣ�����Ҫ�����ݾ������еģ����󷽷���
��ζ���һ���ӿڵĸ�ʽ��
public interface �ӿ����� {
    // �ӿ�����
}

��ע�������˹ؼ���interface֮�󣬱������ɵ��ֽ����ļ���Ȼ�ǣ�.java --> .class��
�����Java 7����ô�ӿ��п��԰����������У�
    1.����
    2.���󷽷�

�����Java 8�������Զ�������У�
    3.Ĭ�Ϸ���
    4.��̬����

�����Java 9�������Զ�������У�
    5.˽�з���

�ӿ�ʹ�ò��裺
    1.�ӿڲ���ֱ��ʹ�ã�������һ����ʵ���ࡱ����ʵ�֡��ýӿڡ�
        ��ʽ��
            public class ʵ�������� implements �ӿ����� {
                // ...
            }
    2.�ӿڵ�ʵ������븲����д��ʵ�֣��ӿ������еĳ��󷽷���
        ʵ�֣�ȥ��abstract�ؼ��֣����Ϸ���������š�
    3.����ʵ����Ķ��󣬽���ʹ�á�
ע�����
   ���ʵ���ಢû�и�����д�ӿ������еĳ��󷽷�����ô���ʵ�����Լ������ǳ����ࡣ
 */
public class Demo01Interface {
    public static void main(String[] args) {
        // ����д��������ֱ��new�ӿڶ���ʹ�á�
//        MyInterfaceAbstract inter = new MyInterAbstract();
        // ����ʵ����Ķ���ʹ��
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();

        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }

}
