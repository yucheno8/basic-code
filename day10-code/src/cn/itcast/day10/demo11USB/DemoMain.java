package cn.itcast.day10.demo11USB;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class DemoMain {

    public static void main(String[] args) {
        // ����һ���ʼǱ�����
        Computer computer = new Computer();
        computer.powerOn();

        // ׼��һ����꣬������ʹ��
//        Mouse mouse = new Mouse();
        // ���Ƚ�������ת��
        USB usbMouse = new Mouse();
        // ������USB���ͣ������ô��ݽ�ȥ�ľ���USB���
        computer.useDevice(usbMouse);

        // ����һ��USB����
        Keyboard keyboard = new Keyboard(); // û��ʹ�ö�̬д��
        // ����������USB���ͣ����ݽ�ȥ����ʵ�������
        computer.useDevice(keyboard); // ��ȷд����Ҳ����������ת��
        // ʹ�����������������Ҳ����
//        computer.useDevice(new Keyboard()); // Ҳ����ȷд��

        computer.powerOff();
        System.out.println("==============");

        method(10.0 ); // ��ȷд����double --> double
        method(20); // Ҳ����ȷд����int ---> double
        int a = 30;
        method(a); // ��ȷд����int --> double

    }

    public static void method(double num) {
        System.out.println(num);
    }
}
