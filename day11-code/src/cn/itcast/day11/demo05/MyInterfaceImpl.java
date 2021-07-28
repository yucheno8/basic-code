package cn.itcast.day11.demo05;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class MyInterfaceImpl implements MyInterface {

    @Override
    public void method1() {
        System.out.println("实现类覆盖重写了方法！111");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写了方法！222");
    }
}
