package cn.itcast.day09.demo06StringBuilder;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    StringBuilder和String可以相互转换：
        String --> StringBuilder：可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder --> String：可以使用StringBuilder中toString方法
            public String toSring()：将当前StringBuilder对象转换为String对象。
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        // String --> StringBuilder：可以使用StringBuilder的构造方法
        String str = "hello";
        System.out.println("str：" + str);
        StringBuffer bu = new StringBuffer(str);
        // 往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu：" + bu);

        // StringBuilder --> String：可以使用StringBuilder中toString方法
        String s = bu.toString();
        System.out.println("s：" + s);
    }
}
