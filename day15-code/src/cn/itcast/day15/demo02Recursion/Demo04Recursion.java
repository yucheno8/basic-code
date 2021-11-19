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
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\day15-code\\src\\cn\\itcast\\day15");
        getAllFile(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法对目录进行遍历
     */
    public static void getAllFile(File dir) {
        System.out.println(dir); // 打印被遍历的目录名称
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
                System.out.println(f);
            }
        }
    }

}
