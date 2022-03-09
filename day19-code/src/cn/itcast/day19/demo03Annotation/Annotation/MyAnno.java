package cn.itcast.day19.demo03Annotation.Annotation;

/**
 * @Author YUCHENO8
 * @Date 2022年03月07日 16:28
 * @Description
 */
public @interface MyAnno {
    int value();

    Person per();
    MyAnno2 anno2();
    String[] strs();
    /*String name() default "张三";*/
    /*String show2();

    Person per();
    MyAnno2 anno2();

    String[] strs();*/



}
