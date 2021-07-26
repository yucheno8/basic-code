package cn.itcast.day10.demo03;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

// 子类也是一个抽象类
public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();
}
