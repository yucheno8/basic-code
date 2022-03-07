package cn.itcast.day19.demo02Reflect.reflect;

import cn.itcast.day19.demo02Reflect.domain.Person;
import cn.itcast.day19.demo02Reflect.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author YUCHENO8
 * @Date 2022年03月07日 10:26
 * @Description
 */

/*
    框架类
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 可以创建任意类的对象，可以执行任意方法

        /*
            前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */
        /*Person p = new Person();
        p.eat();*/

        /*Student stu = new Student();
        stu.sleep();*/

        /*
            需求：写一个“框架”，可以帮我们创建任意类的对象，并执行其中任意方法
         */

        // 1. 加载配置文件（配置文件定义在src目录下）
        // 1.1 创建Properties对象
        Properties pro = new Properties();
        // 1.2 加载配置文件，转换为一个集合
        // 1.2.1 获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 2. 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 3. 加载该类进内存
        Class cls = Class.forName(className);

        // 4. 创建对象
        Object obj = cls.newInstance();

        // 5. 获取方法对象
        Method method = cls.getMethod(methodName);

        // 6. 执行方法
        method.invoke(obj);
    }
}
