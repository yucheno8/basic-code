package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ���Ժ��з��͵Ľӿ�
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        // ����GenericInterfaceImpl1����
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("�ַ���");

        // ����GenericInterfaceImpl2����
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.8);

    }
}
