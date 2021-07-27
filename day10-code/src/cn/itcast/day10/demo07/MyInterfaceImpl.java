package cn.itcast.day10.demo07;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("覆盖重写了子接口的方法");
    }

    @Override
    public void methodA() {
        System.out.println("覆盖重写了接口A的方法A");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了接口B的方法B");
    }

    // 多个父接口当中的抽象方法如果重复，没关系。
    @Override
    public void methodCommon() {
        System.out.println("覆盖重写了接口A和接口B的共有方法");
    }
}
