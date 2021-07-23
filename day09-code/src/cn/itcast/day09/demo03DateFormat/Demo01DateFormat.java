package cn.itcast.day09.demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yucheno8
 * @date 2021/7/21/021
 **/

/*
    java.text.DateFormat��������/ʱ���ʽ������ĳ�����
    ���ã�
        ��ʽ����Ҳ�������� -> �ı������������ı� -> ���ڣ�
    ��Ա������
        String format(Date date) ����ָ����ģʽ����Date���ڣ���ʽ��Ϊ����ģʽ���ַ���
        Date parse(String source) �ѷ���ģʽ���ַ���������ΪDate����
    DateFormat����һ�������࣬�޷�ֱ�Ӵ�������ʹ�ã�����ʹ��DateFormat������

    java.text.SampleDateFormat extends DateFormat
    SimpleDateFormat
        ��һ��������࣬�����������������еķ�ʽ��ʽ���ͽ������ڡ� �������ʽ���������ı������������ı����ڣ��͹�һ����
    ���췽����
        SimpleDateFormat(String pattern) ʹ�ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDateFormat
        ������
            String pattern������ָ����ģʽ
        ģʽ�����ִ�Сд��
            y   ��
            M   ��
            d   ��
            H   ʱ
            m   ��
            s   ��
        д��Ӧ��ģʽ�����ģʽ�滻Ϊ��Ӧ�����ں�ʱ��
            "yyyy-MM-dd HH:mm:ss"
            "yyyy��MM��dd�� HHʱmm����ss��"
        ע�����
            ģʽ�е���ĸ���ܸ��ģ�����ģʽ�ķ��ſ��Ըı�

*/
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }

    /*
        ʹ��DateFormat���еķ���parse�����ı�����Ϊ����
        Date parse(String source) �ѷ���ģʽ���ַ���������ΪDate����
        ʹ�ò��裺
            1.����SimpleDateFormat���󣬹��췽���д���ָ����ģʽ
            2.����SimpleDateFormat�����еķ���parse���ѷ��Ϲ��췽����ģʽ���ַ�������ΪDate����
        ע�⣺
            public Date parse(String source) throws ParseException
            parse����������һ���쳣��ParseException�����쳣
            ����ַ����͹��췽���е�ģʽ��һ������ô����ͻ��׳����쳣
            ����һ���׳����쳣�ķ������ͱ���ô�������쳣��Ҫôthrows���������׳�����쳣��Ҫôtry...catch�Լ���������쳣
     */
    private static void demo02() throws ParseException {
        // 1.����SimpleDateFormat���󣬹��췽���д���ָ����ģʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm����ss��");
        // 2.����SimpleDateFormat�����еķ���parse���ѷ��Ϲ��췽����ģʽ���ַ�������ΪDate����
        Date date = sdf.parse("2021��07��22�� 09ʱ21����13��");
        System.out.println(date);
    }

    /*
        ʹ��DateFormat���еķ���format�������ڸ�ʽ��Ϊ�ı�
        String format(Date date) ����ָ����ģʽ����Date���ڣ���ʽ��Ϊ����ģʽ���ַ���
        ʹ�ò��裺
            1.����SimpleDateFormat���󣬹��췽���д���ָ����ģʽ
            2.����SimpleDateFormat�����еķ���format�����չ��췽����ָ����ģʽ����Date���ڸ�ʽ��Ϊ����ģʽ���ַ������ı���

     */
    private static void demo01() {
        // 1.����SimpleDateFormat���󣬹��췽���д���ָ����ģʽ
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm����ss��");
        // 2.����SimpleDateFormat�����еķ���format�����չ��췽����ָ����ģʽ����Date���ڸ�ʽ��Ϊ����ģʽ���ַ������ı�)
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }
}
