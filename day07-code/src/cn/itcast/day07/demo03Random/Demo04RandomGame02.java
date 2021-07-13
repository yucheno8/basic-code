package cn.itcast.day07.demo03Random;

import java.util.Random;
import java.util.Scanner;

/*
题目：用代码模拟猜数字的小游戏。

思路：
1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法（负责生成随机数字）
2. 需要键盘输入，所以用到了Scanner
3. 获取键盘输入的数字，用Scanner当中的nextInt方法（负责获取数字）
4. 已经得到了两个数字，判断（if）一下：
    如果太大了，提示太大，并且重试；
    如果太小了，提示太小，并且重试；
    如果猜中了，游戏结束。|
5. 重试就是再来一次，循环次数超过10次则游戏失败，用for循环。
 */
public class Demo04RandomGame02 {

    public static void main(String[] args) {

        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; // [1,100]
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 11; i++) {

            if (i > 10) {
                System.out.println("failure，Game Over！！！");
            } else {
                System.out.println("您仅有10次猜测机会，请输入您猜测的数字：");
                int guessNum = sc.nextInt(); // 键盘输入猜测的数字

                if (guessNum > randomNum) {
                    System.out.println("太大了，请重试。\t第" + i + "次猜测");
                } else if (guessNum < randomNum) {
                    System.out.println("太小了，请重试。\t第" + i + "次猜测");
                } else {
                    System.out.println("恭喜你，猜中了！！！");
                    break; // 猜中，循环结束
                }
            }
        }

        System.out.println("游戏结束！");
    }
}
