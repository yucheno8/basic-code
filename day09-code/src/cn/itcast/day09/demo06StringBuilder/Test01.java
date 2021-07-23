package cn.itcast.day09.demo06StringBuilder;

import java.util.Arrays;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/
public class Test01 {
    public static void main(String[] args) {
        // 获取一下当前系统毫秒值时间
        long time = System.currentTimeMillis();
        System.out.println(time);

        // arraycopy(int[] src, int srcIndex, int[] dest, int destIndex, int count) 复制数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // 将arr1中的前4个数字复制到arr2数组中
        System.arraycopy(arr1, 0, arr2, 5, 4);
        System.out.println(Arrays.toString(arr2));
    }
}
