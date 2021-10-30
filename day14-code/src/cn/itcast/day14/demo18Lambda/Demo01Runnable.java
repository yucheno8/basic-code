package cn.itcast.day14.demo18Lambda;

/**
 * @author yucheno8
 * @date 2021/10/29/029
 **/

/*
    使用实现Runnable接口的方式实现多线程程序
 */
public class Demo01Runnable {

    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 创建Thread类对象，构造方法中传递Runnable接口的实现类
        Thread t = new Thread(run);
        // 调用start方法开启新线程，执行run方法
        t.start();

        // 简化代码，使用匿名内部类，实现多线程程序
        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        };
        new Thread(r).start();

        // 简化代码
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        }).start();

    }
}
