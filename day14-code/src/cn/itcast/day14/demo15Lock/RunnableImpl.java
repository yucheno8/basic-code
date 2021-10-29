package cn.itcast.day14.demo15Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的第三种方案：使用Lock锁
    java.util.concurrent.locks.Lock接口
    Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
    Lock接口中的方法：
        void lock() 获取锁。
        void unlock() 释放锁。
    java.util.concurrent.Locks.ReentrantLock implements Lock接口

    使用步骤：
        1. 在成员位置创建一个ReentrantLock对象
        2. 在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
        3. 在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁

 */
public class RunnableImpl implements Runnable {

    // 定义一个多个线程共享的票源
    private int ticket = 100;

    // 1. 在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    // 设置线程任务：买票
    @Override
    public void run() {
        // 使用死循环，让买票操作重复执行
        while (true) {

            // 2. 在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
            l.lock();

            // 先判断票是否存在
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    // 票存在，票--
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 3. 在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    l.unlock(); // 无论程序是否异常，都会把锁释放
                }
            }
        }
    }

    /*// 设置线程任务：买票
    @Override
    public void run() {
        // 使用死循环，让买票操作重复执行
        while (true) {

            // 2. 在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
            l.lock();

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

            // 3. 在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
            l.unlock();
        }
    }*/
}