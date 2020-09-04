package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author yucheno8
 * @date 2020/5/5/005
 **/

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。

分析：
1. 需要创建一个大集合，用来存储int数字：<Integer>
2. 随机数字就用 Random nextInt
3. 循环20次，把随机数字放入大集合：for循环、add方法
4. 定义一个方法，用来进行筛选。
筛选：根据大集合，筛选符合要求的元素，得到小集合。
三要素
返回值类型： Arraylist小集合（里面元素个数不确定)
方法名称： getSmallList
参数列表： ArrayList。大集合（装着20个随机数字)
5.判断（if）是偶数：num%2 == 0
6.如果是偶数，就放到小集合当中，否则不放。
 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(20) + 1;
            bigList.add(num);
        }

        System.out.print("大集合：");
        System.out.println(bigList);

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.print("小集合：");
        System.out.println(smallList);

        // 遍历集合
        System.out.println("偶数总共有：" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i) + "\t");
        }
    }

    /* 这个方法，接受大集合参数，返回小集合结果 */
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }

}
