package cn.itcast.day10.demo07;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
1. 类与类之间是单继承的。直接父类只有一个。
2. 类与接口之间是多继承的。一个类可以实现多个接口。
3. 接口与接口之间是多继承的。

注意事项：
    1. 多个父接口当中的抽象方法如果重复，没关系。
    2. 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且要带着default关键字】。

 */
public class Demo07Relations {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();
        impl.methodA();
        impl.methodB();
        impl.methodCommon();
        impl.methodDefault();
    }

}
