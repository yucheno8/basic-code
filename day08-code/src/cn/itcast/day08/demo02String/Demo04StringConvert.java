package cn.itcast.day08.demo02String;

/**
 * @author yucheno8
 * @date 2020/5/5/005
 **/

/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节效数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
 */
public class Demo04StringConvert {

    public static void main(String[] args) {
        // 转换成字符数组
        char[] chars = "hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "\t");
        }
        System.out.println(); // 战术换行
        System.out.println(chars.length); // 5
        System.out.println("===========");

        // 转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "\t");
        }
        System.out.println();
        System.out.println(bytes.length);
        System.out.println("===========");

        // 将所有出现的老字符串替换成新的字符串
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1); // How do you do?
        System.out.println(str2); // H*w d* y*u d*?
        System.out.println("===========");

        String lang1 = "会不会玩啊！你大爷的！你大爷的！你大爷的！你大爷的！！！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang1); // 会不会玩啊！你大爷的！你大爷的！你大爷的！你大爷的！！！
        System.out.println(lang2); // 会不会玩啊！****！****！****！****！！！
    }
}
