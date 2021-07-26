package cn.itcast.day10.demo03;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误写法！

//        Dog dog = new Dog(); // 错误，这也是抽象类。

        Dog2Ha ha = new Dog2Ha(); // 这是普通类，可以直接new对象。
        ha.eat();
        ha.sleep();
        System.out.println("==============");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }
}
