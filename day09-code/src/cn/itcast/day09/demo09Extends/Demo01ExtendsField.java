package cn.itcast.day09.demo09Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/

/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
    直接通过子类对象访问成员变量：
        等号左边是谁，就优先用谁，没有则向上找。
    简介通过成员方法方位成员变量：
        方法属于谁，就优先用谁，没有则向上找。

 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu(); // 创建父类对象
        System.out.println(fu.numFu); // 只能使用父类的东西，没有任何子类内容
        System.out.println("========");

        Zi zi = new Zi();
        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("========");

        System.out.println(zi.num); // 优先子类，200
        System.out.println(fu.num); // 优先父类，100
//        System.out.println(zi.abc); // 到处都没有，编译报错！
        System.out.println("========");

        // 这个方法是zi类的，优先用子类的，没有再向上找
        zi.methodZi(); // 200
        // 这个方法是在父类中定义的，
        zi.methodFu(); // 100

    }
}
