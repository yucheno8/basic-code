package cn.itcast.day10.demo10;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("è����");
    }

    // �������з���
    public void catchMouse() {
        System.out.println("è׽����");
    }
}
