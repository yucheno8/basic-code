package cn.itcast.day19.demo01junit.junit;

/**
 * @author yucheno8
 * @date 2022/3/4/004
 **/
public class CalculatorTest {

    public static void main(String[] args) {
        // 创建对象
        Calculator c = new Calculator();
        // 调用
        /*int result = c.add(1, 2);
        System.out.println(result);*/

        int result = c.sub(1, 1);

        System.out.println(result);
    }
}
