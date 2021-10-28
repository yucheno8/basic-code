package cn.itcast.day14.demo08GetName;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

/*
    获取线程的名称：
        1. 使用Thread类中的方法getName()
            String getName() 返回线程的名称。
        2. 可以先获取当前正在执行的线程，使用线程中的方法getName()获取线程的名称。
            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */

// 定义一个Thread的子类
public class MyThread extends Thread {

    // 重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {
        // 获取线程的名称
        /*String name = getName();
        System.out.println(name);*/

        /*Thread t = Thread.currentThread();
        System.out.println(t); // Thread[Thread-0,5,main]
        String name = t.getName();
        System.out.println(name);*/

        // 链式编程
        System.out.println(Thread.currentThread().getName());

    }
}
