package cn.itcast.day16.demo02lambda;

/**
 * @author yucheno8
 * @date 2022/2/20/020
 **/

/*
    日志案例

    发现一下代码存在性能浪费的问题
    调用showLog方法，传递第二个参数是一个拼接后的字符串
    先把字符串拼接好，然后再调用showLog方法
    showLog方法中如果传递的日志等级不是1级
    那么就不会输出拼接后的字符串
    所以感觉字符串就白拼接了，存在了浪费
 */
public class Demo01Logger {
    // 定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String message) {
        // 对日志的等级进行判断，如果是1级别，那么输出日志
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog方法，传递日志级别和日志信息
        showLog(1,msg1 + msg2 + msg3);
    }
}
