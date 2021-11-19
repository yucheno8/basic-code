package cn.itcast.day15.demo01File;

import java.io.File;

/**
 * @author yucheno8
 * @date 2021/10/30/030
 **/

/*
    java.io.File类
    文件和目录路径名的抽象表现形式，
    java把电脑中的文件和文件夹（目录）封装为一个File类，我们可以使用FIle类对文件和文件夹进行操作
    我们可以使用FIle类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹是否存在
        对文件夹进行遍历
        获取文件的大小
    File类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法

    重点：记住这三个单词
        file：文件
        directory：文件夹/目录
        path：路径
 */
public class Demo01File {
    public static void main(String[] args) {
        /*
            static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
            static char pathSeparatorChar 与系统有关的路径分隔符。

            static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            static char separatorChar 与系统有关的默认名称分隔符。

            操作路径：不能写死了
            c:\develop\a\a.txt windows
            c:/develop/a/a.txt linux
            "c: +File.separator+ develop +File.separator+ a +File.separator+ a.txt"
         */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // 路径分隔符 Windows：分号; Linux：冒号:

        String separator = File.separator;
        System.out.println(separator); // 文件名称分隔符 Windows：反斜杠\ Linux：正斜杠/


    }
}
