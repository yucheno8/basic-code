package cn.itcast.day10.demo02;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class Zi extends Fu {

    public Zi() {
//        super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
