package cn.itcast.day15.demo13ReverseStream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author yucheno8
 * @date 2022/1/21/021
 **/

/*
    FileReader可以读取IDE默认编码格式（UTF-8）的文件
    FileReader读取系统默认编码（中文GBK）会产生乱码
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day15-code/src/cn/itcast/day15/demo13ReverseStream/我是GBK格式的编码.txt");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }
        fr.close();
    }

}
