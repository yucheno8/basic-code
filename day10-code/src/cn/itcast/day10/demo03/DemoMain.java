package cn.itcast.day10.demo03;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // ����д����

//        Dog dog = new Dog(); // ������Ҳ�ǳ����ࡣ

        Dog2Ha ha = new Dog2Ha(); // ������ͨ�࣬����ֱ��new����
        ha.eat();
        ha.sleep();
        System.out.println("==============");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }
}
