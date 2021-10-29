package cn.itcast.day14.demo14Synchronized;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的一种方案：使用同步方法
    使用步骤：
        1. 把访问了共享数据的代码抽取出来，放到一个方法中
        2. 在方法上添加一个synchronized的修饰符
    格式：定义方法的格式
    修饰符 synchronized 返回值类型 方法名(参数列表){
        可能出现线程安全问题的代码（访问了共享数据的代码）
    }
 */
public class RunnableImpl implements Runnable {

    // 定义一个多个线程共享的票源
    private static int ticket = 100;

    // 设置线程任务：买票
    @Override
    public void run() {
        System.out.println("this:" + this); // this:cn.itcast.day14.demo14Synchronized.RunnableImpl@1b6d3586

        // 使用死循环，让买票操作重复执行
        while (true) {
            payTicketStatic();
        }
    }

    /*
        静态的同步方法
            锁对象是谁？
            不能是this
            this是创建对象之后产生的，静态方法优先于对象
            静态方法的锁对象是本类的class属性 --> class文件对象
     */

    public static /*synchronized*/ void payTicketStatic() {

        synchronized (RunnableImpl.class){
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

    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步方法的锁对象是谁？
        就是实现类对象 new RunnableImpl()
        也就是this
     */
    public /*synchronized*/ void payTicket() {

        synchronized (this) {
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
