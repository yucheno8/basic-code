package cn.itcast.day14.demo02Exception;

import java.util.Objects;

/**
 * @author yucheno8
 * @date 2021/10/8/008
 **/

/*
    Objects类中的静态方法
    public static <T> T requireNonNulL(T obj)：查看指定引用对象不是null。
    源码：
        public static <T> T requireNonNUll(T obj) {
            if (obj == null)
                throw new NullPointerException();
            return obj;
        }
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj) {
        // 对传递过来的参数进行合法性判断，判断是否为null
        /*if (obj == null) {
            throw new NullPointerException("传递的对象的值是null");
        }*/

//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象的值是null");
    }

}
