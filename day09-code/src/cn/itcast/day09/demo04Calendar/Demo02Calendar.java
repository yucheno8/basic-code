package cn.itcast.day09.demo04Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    Calendar��ĳ�Ա������
        public int get(int field)�����ظ��������ֶε�ֵ��
        public void set(int field, int value)���������������ֶ�����Ϊ����ֵ��
        public abstract void add(int field, int amount)�����������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
        public Date getTime()������һ����ʾ��Calendarʱ��ֵ������Ԫ�����ڵĺ���ƫ��������Date����
    ��Ա�����Ĳ���:
        int field:��������ֶ�,����ʹ��Calendar��ľ�̬��Ա������ȡ
            public static final int YEAR = 1;	��
            public static final int MONTH = 2;	��
            public static final int DATE = 5;	���е�ĳһ��
            public static final int DAY_OF_MONTH = 5;���е�ĳһ��
            public static final int HOUR = 10; 		ʱ
            public static final int MINUTE = 12; 	��
            public static final int SECOND = 13;	��
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
    }

    /*
        public Date getTime()������һ����ʾ��Calendarʱ��ֵ������Ԫ�����ڵĺ���ƫ��������Date����
        ����������ת��Ϊ���ڶ���

     */
    private static void demo04() {
        // ʹ��getInstance������ȡCalendar����
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);
    }

    /*
        public abstract void add(int field, int amount)�����������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
        ��ָ�����ֶ�����/����ָ����ֵ
        ������
            int field�����ݵ�ָ���������ֶΣ�YEAR��MONTH��...��
            int amount������/���ٵ�ֵ
                ����������
                ����������
     */
    private static void demo03() {
        // ʹ��getInstance������ȡCalendar����
        Calendar c = Calendar.getInstance();

        // ��������2��
        c.add(Calendar.YEAR, 2);
        // ���¼���3����
        c.add(Calendar.MONTH,-3);


        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH + 1);
        System.out.println(month); // �������·�0-11 �������·�1-12

        int date = c.get(Calendar.DATE);
        // int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }

    /*
        public void set(int field, int value)���������������ֶ�����Ϊ����ֵ��
        ������
            int field�����ݵ�ָ���������ֶΣ�YEAR��MONTH��...��
            int value�����ݵ��ֶ����õľ����ֵ
     */
    private static void demo02() {
        // ʹ��getInstance������ȡCalendar����
        Calendar c = Calendar.getInstance();

        // ������Ϊ9999
        c.set(Calendar.YEAR,9999);
        // ������Ϊ9
        c.set(Calendar.MONTH,9);
        // ������Ϊ9
        c.set(Calendar.DATE,9);

        // ͬʱ���������գ�����ʹ��set�����ط���
        c.set(8888,8,8);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month); // �������·�0-11 �������·�1-12

        int date = c.get(Calendar.DATE);
        // int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }

    /*
        public int get(int field)�����ظ��������ֶε�ֵ��
        ����������ָ���������ֶΣ�YEAR��MONTH��...��
        ����ֵ�������ֶδ�������ֵ
     */
    private static void demo01() {
        // ʹ��getInstance������ȡCalendar����
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1); // �������·�0-11 �������·�1-12

        int date = c.get(Calendar.DATE);
        // int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }
}
