package cn.itcast.day10.demo10;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
����ת��һ���ǰ�ȫ�ġ�û������ģ���ȷ�ġ�����Ҳ��һ���׶ˣ�
����һ������ת�ͣ���ô���޷���������ԭ�����е����ݡ�

����������ö��������ת�͡���ԭ����
 */
public class Demo01Main {

    public static void main(String[] args) {
        // ���������ת�ͣ����ǣ���������ָ���������
        Animal animal = new Cat(); // ����������ʱ����һֻè
        animal.eat(); // è����

//        animal.catchMouse(); // ����д����

        // ����ת�ͣ����С���ԭ������
        Cat cat = (Cat) animal;
        cat.catchMouse(); // è׽����

        // �����Ǵ��������ת��
        // ����new��ʱ����һֻè�����ڷ�Ҫ������
        /*Dog dog = (Dog) animal; // ����д�������벻�ᱨ���������л�����쳣��ClassCastException����ת���쳣����
        dog.watchHouse();*/
    }
}
