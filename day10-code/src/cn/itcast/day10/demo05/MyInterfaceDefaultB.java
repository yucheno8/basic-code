package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class MyInterfaceDefaultB implements MyInterfaceDefault {


    @Override
    public void methodAbs() {
        System.out.println("实现类抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
