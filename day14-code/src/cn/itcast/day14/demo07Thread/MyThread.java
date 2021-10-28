package cn.itcast.day14.demo07Thread;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

// 1. 创建一个Thread的子类
public class MyThread extends Thread {
    // 2. 在Thread类的子类中重写Thread类的run()方法，设置线程任务（开启线程要做什么？）

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }
}
