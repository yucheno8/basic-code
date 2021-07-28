package cn.itcast.day11.demo01;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class Zi extends Fu {
    @Override
    public void methodAbs() {

    }

    // 不能覆盖重写父类当中final的方法
    /*@Override
    public void method() {
        System.out.println("子类覆盖重写父类的方法！");
    }*/
}
