package cn.itcast.day09.demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    ��ϰ��
        ��ʹ������ʱ����ص�API�������һ�����Ѿ������˶����졣
    ������
        1.ʹ��Scanner���еķ���next����ȡ��������
        2.ʹ��DateFormat���еķ���parse,���ַ����ĳ�������,����ΪDate��ʽ�ĳ�������
        3.��Date��ʽ�ĳ�������ת��Ϊ����ֵ
        4.��ȡ��ǰ������,ת��Ϊ����ֵ
        5.ʹ�õ�ǰ���ڵĺ���ֵ-�������ڵĺ���ֵ
        6.�Ѻ����ֵת��Ϊ��(s/1000/60/60/24)
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        // 1.ʹ��Scanner���еķ���next����ȡ��������
        Scanner sc = new Scanner(System.in);
        System.out.println("���������ĳ������ڣ���ʽΪyyyy-MM-dd");
        String birthdayDateString = sc.next();
        // 2.ʹ��DateFormat���еķ���parse,���ַ����ĳ�������,����ΪDate��ʽ�ĳ�������
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        // 3.��Date��ʽ�ĳ�������ת��Ϊ����ֵ
        long birthdayDateTime = birthdayDate.getTime();
        // 4.��ȡ��ǰ������,ת��Ϊ����ֵ
        long todayTime = new Date().getTime();
        // 5.ʹ�õ�ǰ���ڵĺ���ֵ-�������ڵĺ���ֵ
        long time = todayTime - birthdayDateTime;
        // 6.�Ѻ����ֵת��Ϊ��(s/1000/60/60/24)
        System.out.println(time/1000/60/60/24);
    }

}
