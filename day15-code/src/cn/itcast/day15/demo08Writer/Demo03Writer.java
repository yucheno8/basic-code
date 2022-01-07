package cn.itcast.day15.demo08Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yucheno8
 * @date 2022/1/7/007
 **/

/*
    字符输出流写数据的其他方法：
    void write(char[] cbuf) 写入字符数组。
    abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，off数组的开始索引，len写的字符个数。
    void write(String str) 写入字符串。
    void write(String str, int off, int len) 写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
 */

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day15-code/src/cn/itcast/day15/demo08Writer/f.txt");
        char[] cs = {'a', 'b', 'c', 'd', 'e'};
        // void write(char[] cbuf) 写入字符数组。
        fw.write(cs); // abcde

        // abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，off数组的开始索引，len写的字符个数。
        fw.write(cs, 1, 3); // bcd

        // void write(String str) 写入字符串。
        fw.write("传智播客");

        // void write(String str, int off, int len) 写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
        fw.write("黑马程序员", 2, 3); // 程序员

        // 释放资源
        fw.close();
    }

}
