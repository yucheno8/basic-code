package cn.itcast.day09.demo04Calendar;

import java.util.Calendar;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    java.util.Calender�ࣺ������
    Calender����һ�������࣬����ṩ�˺ܶ���������ֶεķ���
    Calender���޷�ֱ�Ӵ�������ʹ�ã������һ����̬������getInstance()���÷���������Calendar����������
    static Calendar getInstance() ʹ��Ĭ��ʱ�����������û�ȡ������
 */
public class Demo01Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // ��̬
        System.out.println(c);
    }
}
