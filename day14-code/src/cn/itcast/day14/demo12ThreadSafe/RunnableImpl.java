package cn.itcast.day14.demo12ThreadSafe;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

/*
    实现卖票案例
 */
public class RunnableImpl implements Runnable {

    // 定义一个多个线程共享的票源
    private int ticket = 100;

    // 设置线程任务：买票
    @Override
    public void run() {
        // 使用死循环，让买票操作重复执行
        while (true) {

            // 先判断票是否存在
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 票存在，票--
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
