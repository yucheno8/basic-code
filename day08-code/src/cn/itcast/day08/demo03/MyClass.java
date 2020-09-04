package cn.itcast.day08.demo03;

/**
 * @author yucheno8
 * @date 2020/5/12/012
 **/
public class MyClass {

    int num; // 成员变量
    static int numStatic; // 静态变量
    public void method() {
        System.out.println("这是一个普通成员方法。");
        // 成员方法可以访问成员变量
        System.out.println(num);
        // 成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法。");
        // 静态方法可以访问静态变量
        System.out.println(numStatic);
        // 静态不能直接访问非静态【错误写法】
//        System.out.println(num); // 错误写法！
//        System.out.println(this); // 错误写法！
    }


}
