package cn.itcast.day09.demo04Calendar;

import java.time.Month;
import java.util.Calendar;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/
public class Test02 {
    public static void main(String[] args) {
        // ��ȡ���������
        Calendar c = Calendar.getInstance();

        // get����
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);

        System.out.println("--------");
        // set����
        c.set(Calendar.YEAR, 2088);
        year = c.get(Calendar.YEAR);
        System.out.println(year );

        System.out.println("--------");
        // add����
        c.add(Calendar.YEAR, -2);
        year = c.get(Calendar.YEAR);
        System.out.println(year );

    }
}
