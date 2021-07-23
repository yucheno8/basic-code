package cn.itcast.day09.demo04Calendar;

import java.util.Calendar;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    java.util.Calender类：日历类
    Calender类是一个抽象类，里边提供了很多操作日历字段的方法
    Calender类无法直接创建对象使用，里边有一个静态方法叫getInstance()，该方法返回了Calendar类的子类对象
    static Calendar getInstance() 使用默认时区和区域设置获取日历。
 */
public class Demo01Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // 多态
        System.out.println(c);
    }
}
