package cn.itcast.day16.demo01FunctionalInterface;

/**
 * @author yucheno8
 * @date 2022/2/20/020
 **/

/*
    @Override注解
    监测方法是否为重写的方法
        是：编译成功
        否：编译失败
 */
public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

    @Override
    public void method() {
        System.out.println("使用接口的实现类重写接口中的抽象方法");
    }

    /*@Override
    public void method2() {

    }*/

    /*@Override
    public void method3() {

    }*/
}
