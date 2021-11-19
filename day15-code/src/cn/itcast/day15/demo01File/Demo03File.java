package cn.itcast.day15.demo01File;

import java.io.File;

/**
 * @author yucheno8
 * @date 2021/10/31/031
 **/

/*
    File获获取功能的方法
        - public String getAbsolutePath()：返回此File的绝对路径名字符串。
        - public String getPath()：将此File转换为路径名字符串。
        - public String getName()：返回由此File表示的文件或目录的名称。
        - public long length()：返回由此File表示的文件的长度。
 */
public class Demo03File {
    public static void main(String[] args) {
        show04();
    }

    /*
        public long length()：返回由此File表示的文件的长度。
        获取的是构造方法指向的文件的大小，以字节为单位
        注意：
            文件夹是没有大小概念的，不能获取文件夹的大小
            如果构造方法中给出的路径不存在，那么length()方法返回0
     */
    private static void show04() {
        File f1 = new File("F:\\Picture\\头像\\yucheno8.jpg");
        long l1 = f1.length();
        System.out.println(l1); // 15768（字节）

        File f2 = new File("F:\\Picture\\头像\\8.jpg");
        long l2 = f2.length();
        System.out.println(l2); // 0

        File f3 = new File("F:\\Picture\\a");
        System.out.println(f3.length()); // 0 文件夹没有大小概念的
    }

    /*
        public String getName()：返回由此File表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分（文件/文件夹）
     */
    private static void show03() {
        File f1 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1); // a.txt

        File f2 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code");
        String name2 = f2.getName();
        System.out.println(name2); // basic-code
    }

    /*
        public String getPath()：将此File转换为路径名字符串。
        获取的是构造方法中传递的路径

        toString调用的就是getPath方法
        源码：
            public String toString(){
                return getPath();
            }

     */
    private static void show02() {
        File f1 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\a.txt");
        String path1 = f1.getPath();
        System.out.println(path1); // G:\workstation\IdeaProjects\heima_video\basic-code\a.txt
        File f2 = new File("a.txt");
        String path2 = f2.getPath();
        System.out.println(path2); // a.txt

        System.out.println(f1); // G:\workstation\IdeaProjects\heima_video\basic-code\a.txt
        System.out.println(f1.toString()); // G:\workstation\IdeaProjects\heima_video\basic-code\a.txt
    }

    /*
        public String getAbsolutePath()：返回此File的绝对路径名字符串。
        获取的是构造方法中传递的路径
        无论路径是相对的，getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        File f1 = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1); // G:\workstation\IdeaProjects\heima_video\basic-code\a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2); // G:\workstation\IdeaProjects\heima_video\basic-code\a.txt
    }
}
