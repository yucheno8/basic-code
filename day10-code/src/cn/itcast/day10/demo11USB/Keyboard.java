package cn.itcast.day10.demo11USB;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
���̾���һ��USB�豸
 */
public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("�򿪼���");
    }

    @Override
    public void close() {
        System.out.println("�رռ���");
    }

    public void type() {
        System.out.println("��������");
    }
}
