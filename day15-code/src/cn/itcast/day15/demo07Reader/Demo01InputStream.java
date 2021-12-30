package cn.itcast.day15.demo07Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author:GUDM
 * @Date:2021/12/8
 * @Time:16:36
 * @Description:
 */

/*
    使用字节流读取中文文件
    1个中文
        GBK：占用两个字节
        UTF-8：占用3个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day15-code/src/cn/itcast/day15/demo07Reader/c.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }
        fis.close();
    }
}


