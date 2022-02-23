package cn.itcast.day17.demo09ConstructorMethodReference;

/**
 * @author yucheno8
 * @date 2022/2/23/023
 **/
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
