package cn.itcast.day09.demo11Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/

/*
在父子类的继承关系中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有就向上找。

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。

重写（Override）
概念：在继承关系中，方法的名称一样，参数类别也一样。
重写（Override）：方法的名称一样，参数类别【也一样】。覆盖、覆写。
重载（Overload）：方法的名称一样，参数类别【不一样】。

方法的覆盖重写特点：创建的子类对象，则优先用子类方法。
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        // 创建的new了子类对象，所以优先用子类方法
        zi.method();
    }
}
