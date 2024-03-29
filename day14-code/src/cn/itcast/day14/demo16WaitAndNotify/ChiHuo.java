package cn.itcast.day14.demo16WaitAndNotify;

/**
 * @author yucheno8
 * @date 2021/10/29/029
 **/

/*
    消费者（吃货）类：是一个线程类，可以继承Thread
    设置线程任务（run）：吃包子
    对包子的状态进行判断
    false：没有包子
        吃货调用wait方法进入等待状态
    true：有包子
        吃货吃包子
        吃货吃完包子
        修改包子的状态为false
        没有吃货唤醒包子铺线程，生产包子
 */
public class ChiHuo extends Thread {

    // 1. 需要在成员位置创建一个包子的变量
    private BaoZi bz;

    // 2. 使用带参数成员变量，为这个包子变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
    // 设置线程任务（run）：吃包子
    @Override
    public void run() {
        // 使用死循环，让吃货一直吃包子
        while (true) {
            // 必须同时同步技术保证两个线程只能有一个执行
            synchronized (bz) {
                // 对包子的状态进行判断
                if (bz.flag == false) {
                    // 吃货调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "包子");
                // 吃好吃完包子
                // 修改包子的状态为false
                bz.flag = false;
                // 没有吃货唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经把" + bz.pi + bz.xian + "吃完了，包子铺开始生产包子了");
                System.out.println("------------------------------------");
            }
        }
    }
}
