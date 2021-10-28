package cn.itcast.day14.demo11Runnable;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

// 1. 创建一个Runnable接口的实现类
public class RunnableImpl2 implements Runnable {

    // 2. 在实现类中重写Runnable接口的run()方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello World");
        }
    }
}
