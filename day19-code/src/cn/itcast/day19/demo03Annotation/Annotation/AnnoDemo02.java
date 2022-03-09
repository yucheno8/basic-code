package cn.itcast.day19.demo03Annotation.Annotation;

/**
 * @Author YUCHENO8
 * @Date 2022年03月07日 16:03
 * @Description
 */

import java.util.Date;

/**
 * JDK中预定义的一些注解
 * * @Override：检测被该注解标注的方法是否是继承自父类（父接口）的
 * * @Deprecated：该注解标注的内容已过时
 * * @SuppressWarnings：压制警告
 */

@SuppressWarnings("all")
public class AnnoDemo02 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        // 有缺陷
    }


    public void show2() {
        // 替代show1方法
    }

    public void demo() {
        show1();
        Date date = new Date();

    }
}
