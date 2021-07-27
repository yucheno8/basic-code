package cn.itcast.day10.demo11USB;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/
public class Computer {

    public void powerOn() {
        System.out.println("�ʼǱ����Կ���");
    }

    public void powerOff() {
        System.out.println("�ʼǱ����Թػ�");
    }

    // ʹ���豸�ķ�����ʹ�ýӿ���Ϊ�����Ĳ���
    public void useDevice(USB usb) {
        usb.open(); // ���豸

        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb; // ����ת��
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }

        usb.close(); // �ر��豸
    }

}
