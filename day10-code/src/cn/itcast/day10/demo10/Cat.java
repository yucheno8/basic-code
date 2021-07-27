package cn.itcast.day10.demo10;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 子类特有方法
    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}
