package cn.itcast.day17.demo06StaticMethodReference;

/**
 * @author yucheno8
 * @date 2022/2/23/023
 **/
@FunctionalInterface
public interface Calcable {
    // 定义一个抽象方法，传递一个整数，对整数进行绝对值计算并返回
    int calcAbs(int number);
}
