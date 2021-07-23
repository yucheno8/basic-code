package cn.itcast.day09.demo04Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/
public class Test01 {
    public static void main(String[] args) throws ParseException {
        // �ղι��췽��
        Date d = new Date(3000L);
        System.out.println(d.toLocaleString());

        // �������ڸ�ʽ������
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��ss�� HHʱmm����ss��");
        String format = sdf.format(d);
        System.out.println(format); // 1970��01��03�� 08ʱ00����03��

        // ����ָ����ʽ�����ַ���
        String str = "2088��01��03�� 08ʱ00����03��";
        Date parse = sdf.parse(str);
        System.out.println(parse);


    }
}
