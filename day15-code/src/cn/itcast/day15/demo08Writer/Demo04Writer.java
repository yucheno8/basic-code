package cn.itcast.day15.demo08Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yucheno8
 * @date 2022/1/7/007
 **/

/*
    续写和换行
    续写，追加写：使用两个参数的构造方法
        FileWriter(String fileName, boolean append) 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
        FileWriter(File file, boolean append) 根据给定的 File 对象构造一个 FileWriter 对象。
        参数：
            String fileName，File file：写入数据的目的地
            boolean append：续写开关 true：不会创建新的文件覆盖源文件，可以续写；false：创建新的文件，覆盖源文件
    换行：换行符号
        windows：\r\n
        linux：/n
        mac：/r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day15-code/src/cn/itcast/day15/demo08Writer/g.txt", true);
        for (int i = 0; i < 10; i++) {
            fw.write("helloworld" + i + "\r\n");
        }

        fw.close();
    }
}
