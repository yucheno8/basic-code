package cn.itcast.day14.demo06Thread;

/**
 * @author yucheno8
 * @date 2021/10/28/028
 **/

/*
    JVM执行main方法，main方法会进入到栈内存JVM会找操作系统开辟一条main方法通向cpu的执行路径
    cpu就可以通过这个路径来执行main方法，而这个路径有一个名字，叫main（主）线程
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();

        Person p2 = new Person("旺财");
        p2.run();
    }
}
