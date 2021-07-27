package cn.itcast.day10.demo06;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public interface MyInterface {

    public default void method() {
        System.out.println("默认接口的方法");
    }
}
