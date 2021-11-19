package cn.itcast.day15.demo01File;

import java.io.File;

/**
 * @author yucheno8
 * @date 2021/10/31/031
 **/

/*
    File判断功能的方法
        public boolean exists()：此File表示的文件或目录是否实际存在。
        public boolean isDirectory()：此File表示的是否为目录。
        public boolean isFile()：此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        show02();
    }

    /*
        public boolean isDirectory()：此File表示的是否为目录。
            用于判断构造方法中给定的路径是否为以文件夹结尾
                是：true
                否：false
        public boolean isFile()：此File表示的是否为文件。
            用于判断构造方法中给定的路径是否为以文件夹结尾
                是：true
                否：false
        注意：
            电脑的硬盘中只有文件/文件夹，里面两个方法是互斥
            这两个方法使用前提，路径必须是存在的，否则都返回false
     */
    private static void show02() {

        File f1 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic");
        if (f1.exists()) {
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code");
        if (f2.exists()) {
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }

        File f3 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\day15-code\\day15-code.iml");
        if (f3.exists()) {
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }
    }

    /*
        public boolean exists()：此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在：true
            不存在：false
     */
    private static void show01() {
        File f1 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code");
        System.out.println(f1.exists()); // true

        File f2 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic");
        System.out.println(f2.exists()); // false

        File f3 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\day15-code\\day15-code.iml");
        System.out.println(f3.exists()); // true
    }
}
