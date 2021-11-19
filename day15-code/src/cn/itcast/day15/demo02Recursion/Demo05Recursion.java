package cn.itcast.day15.demo02Recursion;

import java.io.File;


/**
 * @author yucheno8
 * @date 2021/11/1/001
 **/

/*
    练习：
        递归打印多级目录
    需求：
        遍历文件夹及文件夹下的所有有目录和文件
        只要.java结尾的文件

        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\1.txt
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\111
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\111\222
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\111\222\333
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\2.txt
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\aaa
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\Demo01File.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\Demo02File.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\Demo03File.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\Demo04File.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\Demo05File.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\Demo06File.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\我是一个隐藏文件.txt
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo01File\我是一个隐藏文件夹
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo02Recursion
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo02Recursion\Demo01Recursion.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo02Recursion\Demo02Recursion.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo02Recursion\Demo03Recursion.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo02Recursion\Demo04Recursion.java
        G:\workstation\IdeaProjects\heima_video\basic-code\day15-code\src\cn\itcast\day15\demo02Recursion\Demo05Recursion.java
 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\day15-code\\src\\cn\\itcast\\day15");
        getAllFile(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法对目录进行遍历
     */
    public static void getAllFile(File dir) {
//        System.out.println(dir); // 打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断，判断是否是文件夹
            if(f.isDirectory()){
                //f是一个文件夹，则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹，遍历文件夹的方法
                //所以直接调用getAllFile方法即可：递归（自己调用自己）
                getAllFile(f);
            } else {
                //f是一个文件，直接打印
                /*
                    只要.java结尾的文件
                    1. 把File对象f，转换为字符串对象
                 */
//                String name = f.getName(); // abc.java
//                String path = f.getPath(); // c://abc//abc.java
//                String s = f.toString(); // c://abc//abc.java

                // 把字符串转换为小写
//                s = s.toLowerCase();

                // 2.调用String类中的方法endsWith判断字符串是否是以.java结尾
//                boolean b = s.endsWith(".java");

                // 3. 如果是以.java结尾的文件，则输出
                /*if (b) {
                    System.out.println(f);
                }*/

                // 连式编程
                if (f.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(f);
                }
            }
        }
    }

}
