package cn.itcast.day14.demo13Synchronized;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的一种方案：使用同步代码块
    格式：
        synchronized(锁对象) {
            可能出现线程安全问题的代码（访问了共享数据的代码）
        }

    注意事项：
        1. 同步代码块中的对象，可以是任意的对象
        2. 但是必须保证多个线程使用的是同一个锁对象
        3. 锁对象作用：
            把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable {

    // 定义一个多个线程共享的票源
    private int ticket = 100;

    // 创建一个锁对象
    Object obj = new Object();

    // 设置线程任务：买票
    @Override
    public void run() {
        // 使用死循环，让买票操作重复执行
        while (true) {
            // 同步代码块
            synchronized (obj) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 先判断票是否存在
                if (ticket > 0) {
                    // 票存在，票--
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
