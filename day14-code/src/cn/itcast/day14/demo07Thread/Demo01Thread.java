package cn.itcast.day14.demo07Thread;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

/*
    创建多线程程序的第一种方式：创建Thread的子类
    java.lang.Thread类：是描述线程的类，我们要实现多线程程序，就必须继承Thread类

    实现步骤：
        1. 创建一个Thread类的子类
        2. 在Thread类的子类中重写Thread类的run()方法，设置线程任务（开启线程要做什么？）
        3. 创建Thread类的子类对象
        4. 调用Thread类中方法start()方法，开启新的线程，执行run()方法
            void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法。
                结果是两个线程同时运行：当前线程（main线程，从调用返回到start方法）和另一个线程（创建的新线程，执行其run方法）。
                多次启动一个线程是不合法的。 特别地，一旦线程完成执行就可能不会重新启动。
    Java程序属于抢占式调度，那个线程的优先级高，那个线程优先执行；同一个优先级，随机选择一个执行。


 */
public class Demo01Thread {
    public static void main(String[] args) {
        // 3. 创建Thread类的子类对象
        MyThread mt = new MyThread();
        // 4. 调用Thread类中方法start()方法，开启新的线程，执行run()方法
        mt.start();

        // 主线程会继续执行主方法中的代码
        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
