package cn.itcast.day10.demo05;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother() {
        // 直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();

    }
}
