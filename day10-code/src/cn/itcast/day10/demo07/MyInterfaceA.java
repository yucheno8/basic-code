package cn.itcast.day10.demo07;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("AAA");
    }
}
