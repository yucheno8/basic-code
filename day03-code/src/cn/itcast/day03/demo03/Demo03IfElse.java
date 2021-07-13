package cn.itcast.day03.demo03;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/
// 标准的if-else语句
public class Demo03IfElse {
    public static void main(String[] args) {
        int num = 666;

        if (num % 2 == 0) { // 如果除以2能够余数为0，说明是偶数
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}