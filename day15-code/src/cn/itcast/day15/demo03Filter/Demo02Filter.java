package cn.itcast.day15.demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

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

    我们可以使用过滤器来实现
    在File类中有两个和listFiles重载的方法，方法的参数传递的就是过滤器
    File[] listFiles(FileFilter filter)
    java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器。
        作用：用于过滤文件（File对象）
        抽象方法:用于过滤文件的方法
            boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数：
                File pathname：使用listFiles方法遍历目录，得到的每一个对象
    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤文件名。
        作用：用于过滤文件名称
        抽象方法：用于过滤文件的方法
        boolean accept(File dir, String name) 测试指定文件是否应该包含在某一个列表中。
        参数：
            File dir：构造方法中传递被遍历的目录
            String name：使用listFiles方法遍历目录，获取到每一个文件/文件夹的名称
    注意：
        两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
 */
public class Demo02Filter {

    public static void main(String[] args) {
        File file = new File("G:\\workstation\\IdeaProjects\\heima_video\\basic-code\\day15-code\\src\\cn\\itcast\\day15");
        getAllFile(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法对目录进行遍历
     */
    public static void getAllFile(File dir) {
        // 传递过滤器对象 使用匿名内部类
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // 过滤规则，pathname是文件夹或者是.java结尾的文件返回true
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/

        // 使用Lambda表达式优化匿名内部类（接口中只有一个抽象方法）
        File[] files = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));

        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // 过滤规则，pathname是文件夹或者是.java结尾的文件返回true
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/

        // 使用Lambda表达式优化匿名内部类（接口中只有一个抽象方法）
        /*File[] files = dir.listFiles((File d, String name) -> {
            // 过滤规则，pathname是文件夹或者是.java结尾的文件返回true
            return new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java");
        });*/

        // 继续简化Lambda表达式
//        File[] files = dir.listFiles((d, name) -> new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java"));

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
