package cn.itcast.day10.demo10;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
向上转型一定是安全的。没有问题的，正确的。但是也有一个弊端：
对象一旦向上转型，那么就无法调用子类原本特有的内容。

解决方案：用对象的向下转型【还原】。
 */
public class Demo01Main {

    public static void main(String[] args) {
        // 对象的向上转型，就是：父类引用指向子类对象。
        Animal animal = new Cat(); // 本来创建的时候是一只猫
        animal.eat(); // 猫吃鱼

//        animal.catchMouse(); // 错误写法！

        // 向下转型，进行“还原”动作
        Cat cat = (Cat) animal;
        cat.catchMouse(); // 猫捉老鼠

        // 下面是错误的向下转型
        // 本来new的时候是一只猫，现在非要当做狗
        /*Dog dog = (Dog) animal; // 错误写法！编译不会报错，但是运行会出现异常：ClassCastException（类转换异常）。
        dog.watchHouse();*/
    }
}
