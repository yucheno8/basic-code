package cn.itcast.day19.demo02Reflect.reflect;


import cn.itcast.day19.demo02Reflect.domain.Person;
import cn.itcast.day19.demo02Reflect.domain.Student;

public class ReflectDemo01 {
    /*
        获取Class对象的方式
            1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
            2. 类名.class：通过类名的属性class获取
            3. 对象.getClass()：getClass()方法在Object类中定义着。
     */
    public static void main(String[] args) throws Exception {
        //  1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
        Class cls1 = Class.forName("cn.itcast.day19.demo02Reflect.domain.Person"); // 传递全类名
        System.out.println(cls1);

        // 2. 类名.class：通过类名的属性class获取
        Class cls2 = Person.class;
        System.out.println(cls2);

        // 3. 对象.getClass()：getClass()方法在Object类中定义着。
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        // 用==比较三个对象
        System.out.println(cls1 == cls2); // true
        System.out.println(cls1 == cls3); // true

        Class c = Student.class;
        System.out.println(c == cls1);
    }
}
