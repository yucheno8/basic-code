package cn.itcast.day11.Demo03;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class Demo02Inner {

    public static void main(String[] args) {

        // �ⲿ������.�ڲ������� ������ = new �ⲿ������().new �ڲ�������();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();

    }

}
