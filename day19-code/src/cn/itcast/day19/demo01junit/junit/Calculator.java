package cn.itcast.day19.demo01junit.junit;

/**
 * @author yucheno8
 * @date 2022/3/4/004
 **/

/*
    计算器类
 */
public class Calculator {

    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        //int i = 3 / 0;
        return a - b;
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    public int sub(int a, int b) {
        return a - b;
    }

}
