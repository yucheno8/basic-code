package cn.itcast.day08.demo02;

/**
 * @author yucheno8
 * @date 2020/5/5/005
 **/

/*
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf( String str)：査找参数字符串在本字符串当中首次出现的素引位置，如果没有返回-1值。
 */
public class Demo02StringGet {

    public static void main(String[] args) {
        // 获取字符串的长度
        String str = "Hello";
        System.out.println("字符串的长度是：" + str.length());

        // 拼接字符串
        String newStr = str.concat("World");
        System.out.println("新的字符串是：" + newStr); // HelloWorld

        // 获取指定索引位置的单个字符。（索引从0开始。）
        System.out.println("第三个字符是：" + str.charAt(3)); // l

        // 査找参数字符串在本字符串当中首次出现的素引位置
        // 如果根本没有，返回-1值
        System.out.println("字符串ell在字符串中首次出现的位置是：" + str.indexOf("ell")); // 1
        System.out.println("HelloWorld".indexOf("abc")); // -1
    }
}
