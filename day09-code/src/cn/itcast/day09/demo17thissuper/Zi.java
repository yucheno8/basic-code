package cn.itcast.day09.demo17thissuper;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        super.method(); // �����˸��෽��
        System.out.println("���෽����");
    }

    public void show() {
        int num = 30;
        System.out.println(num); // 30
        System.out.println(this.num); // 20
        System.out.println(super. num); // 10
    }
}
