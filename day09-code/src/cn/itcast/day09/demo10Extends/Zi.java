package cn.itcast.day09.demo10Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/
public class Zi extends Fu {
    int num = 20;
    public void method() {
        int num = 30;
        System.out.println(num); // 30���ֲ�����
        System.out.println(this.num); // 20������ĳ�Ա����
        System.out.println(super.num); // 10������ĳ�Ա����
    }
}
