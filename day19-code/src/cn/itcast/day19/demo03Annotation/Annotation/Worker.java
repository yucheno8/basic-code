package cn.itcast.day19.demo03Annotation.Annotation;

import cn.itcast.day19.demo03Annotation.Annotation.MyAnno;
import cn.itcast.day19.demo03Annotation.Annotation.MyAnno2;
import cn.itcast.day19.demo03Annotation.Annotation.MyAnno3;
import cn.itcast.day19.demo03Annotation.Annotation.Person;

/**
 * @Author YUCHENO8
 * @Date 2022年03月07日 16:58
 * @Description
 */

@MyAnno(value = 12, per = Person.p1, anno2 = @MyAnno2, strs = {"abc", "bbb"})
@MyAnno3
public class Worker {
    @MyAnno3
    public String name = "aaa";
    @MyAnno3
    public void show() {

    }
}
