package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
���κΰ汾��Java�У��ӿڶ��ܶ�����󷽷���
��ʽ��
public abstract ����ֵ���� ��������(�����б�);

ע�����
    1.�ӿڵ��еĳ��󷽷������η������������̶��Ĺؼ��֣�public abstract
    2.�������ؼ������η�������ѡ����ʡ�ԡ�
    3.��������Ҫ�أ��������ⶨ�塣

 */
public interface MyInterfaceAbstract {

    // ����һ�����󷽷�
    public abstract void methodAbs1();

    // ��Ҳ�ǳ��󷽷�
    abstract void methodAbs2();

    // ��Ҳ�ǳ��󷽷�
    public void methodAbs3();

    // ��Ҳ�ǳ��󷽷�
    void methodAbs4();
}
