package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    定义含有泛型的接口
 */
public interface GenericInterface<I> {
    public abstract void method(I i);
}
