package cn.itcast.day17.demo09ConstructorMethodReference;

/**
 * @author yucheno8
 * @date 2022/2/23/023
 **/

/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    // 定义一个方法，根据传递的姓名，创建Person对象返回
    Person builderPerson(String name);
}
