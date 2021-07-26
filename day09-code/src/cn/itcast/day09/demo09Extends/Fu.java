package cn.itcast.day09.demo09Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/
public class Fu {
    int numFu = 10;
    int num = 100;

    public void methodFu(){
        // 使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
