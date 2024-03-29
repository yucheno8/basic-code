package cn.itcast.day09.demo07Integer;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    装箱：把基本类型的数据，包装到包装类中（基本类型->包装类）
        构造方法：
            Integer(int value) 构造一个新分配的 Integer对象，该对象表示指定的 int值。
            Integer(String s) 构造一个新分配 Integer对象，表示 int由指示值 String参数。
                传递的字符串，必须是基本类型的字符串，否则会抛出异常 “100” 正确 “a” 抛异常
        静态方法:
            static Integer valueOf(int i) 返回一个 Integer指定的 int值的 Integer实例。
            static Integer valueOf(String s) 返回一个 Integer对象，保存指定的值为 String 。

    拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
        成员方法：
            int intValue() 将 Integer的值作为 int 。
 */
public class Demo01Integer {
    public static void main(String[] args) {
        // 装箱：把基本类型的数据，包装到包装类中（基本类型->包装类）
        // 构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1); // 1 重写了toString方法

        Integer in2 = new Integer("1");
        System.out.println(in2);

        // 静态方法
        Integer in3 = Integer.valueOf(12);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("12");
        System.out.println(in4);

        // 拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
        int i = in1.intValue();
        System.out.println(i);
    }
}
