package cn.itcast.day10.demo07;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("������д���ӽӿڵķ���");
    }

    @Override
    public void methodA() {
        System.out.println("������д�˽ӿ�A�ķ���A");
    }

    @Override
    public void methodB() {
        System.out.println("������д�˽ӿ�B�ķ���B");
    }

    // ������ӿڵ��еĳ��󷽷�����ظ���û��ϵ��
    @Override
    public void methodCommon() {
        System.out.println("������д�˽ӿ�A�ͽӿ�B�Ĺ��з���");
    }
}
