package cn.itcast.day05.demo03;

public class Demo05ArrayMax {

    public static void main(String[] args) {
        int[] array = {1, 15, 30, 20, 10000, 30, 50};

        int max = array[0]; // 比武擂台
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        //谁最后厉害，就能在max当中留下自己的战斗值
        System.out.println("最大值：" + max);


    }
}
