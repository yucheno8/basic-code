package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法：通过接口名称，直接调用其中的静态方法。
格式：
接口名称.静态方法名(参数);
 */
public class Demo03Interface {
    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl(); // 静态方法和对象没用关系，之和类有关系。这种写法不需要。

        // 错误写法！
//        impl.methodStatic();
        MyInterfaceStatic.methodStatic();
    }
}
