package cn.itcast.day08.demo04ArraysMath;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/

/*
java.util.Math������ѧ��صĹ����࣬�����ṩ�˴����ľ�̬�������������ѧ������صĲ�����

public static double abs(double num)����ȡ����ֵ���ж������ء�
public static double ceil(double num)������ȡ����
public static double floor(double num)������ȡ����
public static long round(double num)���������롣

Math.PI������Ƶ�Բ���ʳ�����double����
 */
public class Demo03Math {

    public static void main(String[] args) {
        // ��ȡ����ֵ
        System.out.println(Math.abs(3.14)); // 3.14
        System.out.println(Math.abs(0)); // 0
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println("================");

        // ����ȡ��
        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0
        System.out.println("================");

        // ����ȡ����Ĩ��
        System.out.println(Math.floor(30.1)); // 30.0
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("================");

        System.out.println(Math.round(20.4)); // 20
        System.out.println(Math.round(10.5)); // 11
    }

}

