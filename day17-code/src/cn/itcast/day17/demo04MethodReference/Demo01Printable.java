package cn.itcast.day17.demo04MethodReference;

/**
 * @author yucheno8
 * @date 2022/2/23/023
 **/

public class Demo01Printable {
    // 定义一个方法，参数传递Printable接口，对字符串进行打印
    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        // 调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递Lambda
        printString((String s)->{
            System.out.println(s);
        });

        /*
            分析：
                Lambda表达式的目的，打印参数传递的字符串
                把参数s，传递给了System.out对象，调用out对象中的方法println对字符串进行输出
                注意：
                    1. System.out对象是存在的
                    2. println方法也是已经存在的
                所以我们可以使用方法引用优化Lambda表达式
                可以使用System.out直接引用（调用）println方法
         */
        printString(System.out::println);
    }
}
