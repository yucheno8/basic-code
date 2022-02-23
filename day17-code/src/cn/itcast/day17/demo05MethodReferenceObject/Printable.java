package cn.itcast.day17.demo05MethodReferenceObject;

/**
 * @author yucheno8
 * @date 2022/2/23/023
 **/

/*
    定义一个打印的函数式接口
 */
@FunctionalInterface
public interface Printable {
    // 打印字符串的抽象方法
    void print(String s);
}
