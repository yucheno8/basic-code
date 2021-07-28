package cn.itcast.day11.Demo03;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class Demo02Inner {

    public static void main(String[] args) {

        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();

    }

}
