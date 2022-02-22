package cn.itcast.day16.demo01FunctionalInterface;

/**
 * @author yucheno8
 * @date 2022/2/20/020
 **/

/*
    函数时接口的概念：有且只有一个抽象方法的接口，称之为函数式接口
    当然接口中可以包含其他的方法（默认方法、静态方法、私有方法）

    定义函数式接口的时候加上@FunctionalInterface（用于检测接口是否是函数式接口）

    @FunctionalInterface注解：
    作用：可以检测接口是否是一个函数时接口
        是：编译成功
        否：编译失败（接口中没有抽象方法/抽象方法的个数大于1个）
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    // 定义一个抽象方法
    public abstract void method(); // 抽象方法的public abstract可以省略


}
