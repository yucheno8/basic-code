package cn.itcast.day10.demo07;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
这个子接口当中有几个方法？答：4个
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A和B
method 来源于我自己

 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("覆盖重写了接口A和B中冲突的默认方法");
    }
}
