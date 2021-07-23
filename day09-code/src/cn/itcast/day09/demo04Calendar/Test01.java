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
        // 空参构造方法
        Date d = new Date(3000L);
        System.out.println(d.toLocaleString());

        // 创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月ss日 HH时mm分钟ss秒");
        String format = sdf.format(d);
        System.out.println(format); // 1970年01月03日 08时00分钟03秒

        // 根据指定格式解析字符串
        String str = "2088年01月03日 08时00分钟03秒";
        Date parse = sdf.parse(str);
        System.out.println(parse);


    }
}
