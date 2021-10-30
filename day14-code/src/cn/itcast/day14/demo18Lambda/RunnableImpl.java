package cn.itcast.day14.demo18Lambda;

/**
 * @author yucheno8
 * @date 2021/10/29/029
 **/

/*
    创建Runnable接口的实现类，重写run方法，设置线程任务
 */
public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新的线程创建了");
    }
}
