package cn.itcast.day10.demo06;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public interface MyInterfaceB {

    // ����д�����ӿڲ����о�̬�����
//    static {
//
//    }

    // ����д�����ӿڲ����й��췽��
//    public MyInterface() {
//
//    }

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("Ĭ�Ϸ���BBB");
    }

}
