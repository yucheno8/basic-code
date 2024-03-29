package cn.itcast.day19.demo02Reflect.reflect;

import cn.itcast.day19.demo02Reflect.domain.Person;

import java.lang.reflect.Field;

/**
 * @Author YUCHENO8
 * @Date 2022年03月05日 17:21
 * @Description
 */
public class ReflectDemo02 {
    /*
        * Class对象功能：
            * 获取功能
                1. 获取成员变量们
                    * Field[] getFields()
                    * Field getField(String name)

                    * Field[] getDeclaredFields()
                    * Field getDeclaredField(String name)
                2. 获取构造方法们
                    * Constructor<?>[] getConstructors()
                    * Constructor<T> getConstructor(类<?>... parameterTypes)

                    * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
                    * Constructor<?>[] getDeclaredConstructors()
                3. 获取成员方法们
                    * Method[] getMethods()
                    * Method getMethod(String name, 类<?>... parameterTypes)

                    * Method[] getDeclaredMethods()
                    * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
                4. 获取类名
                    * String getName()
     */

    public static void main(String[] args) throws Exception {
        // 0. 获取Person的Class对象
        Class personClass = Person.class;

        /*
            1. 获取成员变量们
                    * Field[] getFields()
                    * Field getField(String name)

                    * Field[] getDeclaredFields()
                    * Field getDeclaredField(String name)
         */
        // Field[] getFields()  获取所有Public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("------------");

        // Field getField(String name)  获取指定名称的Public修饰的成员变量
        Field a = personClass.getField("a");
        // 获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        // 设置成员变量a的值
        a.set(p, "Hello");
        System.out.println(p);
        System.out.println("============");

        // Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        // Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); // 暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
