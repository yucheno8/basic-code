package cn.itcast.day10.demo01Abstract;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Aniaml(); // 错误写法！不能直接创建抽象类对象。

        Cat cat = new Cat();
        cat.eat();

    }
}
