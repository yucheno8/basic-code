package cn.itcast.day10.demo06;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class MyInterfaceImpl /* extends Object */ implements MyInterfaceA, MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("������д��A����");
    }


    @Override
    public void methodB() {
        System.out.println("������д��B����");
    }

    @Override
    public void methodAbs() {
        System.out.println("������д��AB�ӿڶ��еĳ��󷽷�");
    }

    @Override
    public void methodDefault() {
        System.out.println("�Զ���ӿڵ��г�ͻ��Ĭ�Ϸ��������˸�����д");
    }
}
