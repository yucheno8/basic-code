package cn.itcast.day10.demo07;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
����ӽӿڵ����м�����������4��
methodA ��Դ�ڽӿ�A
methodB ��Դ�ڽӿ�B
methodCommon ͬʱ��Դ�ڽӿ�A��B
method ��Դ�����Լ�

 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("������д�˽ӿ�A��B�г�ͻ��Ĭ�Ϸ���");
    }
}
