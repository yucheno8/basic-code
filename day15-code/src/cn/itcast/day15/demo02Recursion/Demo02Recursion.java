package cn.itcast.day15.demo02Recursion;

/**
 * @author yucheno8
 * @date 2021/11/1/001
 **/

/*
    使用递归计算1～n之间的和。

    注意：
        使用递归求和，main方法调用sum方法，sum方法会一直调用sum方法
        导致在内存中有多个sum方法（频繁的创建方法调用方法，销毁方法）效率低下
    所以如果仅仅是计算1-n之间的和，不推荐使用递归，使用for循环即可
 */
public class Demo02Recursion {
    public static void main(String[] args) {
        int s = sum(100);
        System.out.println(s);
    }

    /*
        定义一个方法，使用递归计算1～n之间的和。
        1+2+3+...+n
        n+(n-1)+(n-2)+...+1
       已知：
            最大值：n
            最小值：1
       使用递归必须明确：
            1. 递归结束条件
                获取到1的时候结束
            2. 递归的目的
                获取下一个被加的数字（n-1）
     */
    public static int sum(int n) {
        // 获取到1的时候结束
        if (n == 1) {
            return 1;
        }
        // 获取下一个被加的数字（n-1）
        return n + sum(n - 1);
    }

}
