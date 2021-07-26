package cn.itcast.day09.demo11Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/
public class Zi extends Fu {
    public void methodZi() {
        System.out.println("子类方法执行！");
    }

    public void method() {
        System.out.println("子类重名方法执行！");
    }
}
