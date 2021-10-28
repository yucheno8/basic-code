package cn.itcast.day14.demo09SetName;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/
public class Demo01SetThreadName {
    public static void main(String[] args) {
        // 开启新线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        // 开启多线程
        new MyThread("旺财").start();
    }
}
