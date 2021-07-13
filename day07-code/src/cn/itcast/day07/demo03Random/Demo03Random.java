package cn.itcast.day07.demo03Random;

import java.util.Random;

public class Demo03Random {

    public static void main(String[] args) {

        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            // 随机数获取范围在[0,n)，整体上加一，获取到的数范围在[1，n+1)，也就是[1,n]
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }


    }
}
