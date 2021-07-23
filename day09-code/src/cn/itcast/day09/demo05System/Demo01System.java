package cn.itcast.day09.demo05System;

import java.util.Arrays;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    java.lang.System�����ṩ�˴����ľ�̬���������Ի�ȡ��ϵͳ��ص���Ϣ��ϵͳ����������System���API�ĵ��У����õķ����У�
        - public static long currentTimeMillis()�������Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
        - public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)����������ָ�������ݿ�������һ�������С�
 */
public class Demo01System {
    public static void main(String[] args) {
        demo02();

    }

    /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            ��ָ��Դ�����е������ָ��λ�ø��Ƶ�Ŀ�������ָ��λ�á�
        ������
            src - Դ���顣
            srcPos - Դ�����е���ʼλ�á�
            dest - Ŀ�����顣
            destPos - Ŀ�ĵ������е���ʼλ�á�
            length - Ҫ���Ƶ�����Ԫ�ص�������
        ��ϰ:
            ��src������ǰ3��Ԫ�أ����Ƶ�dest�����ǰ3��λ����
                ����Ԫ��ǰ��
                src����Ԫ��[1,2,3,4,5]��dest����Ԫ��[6,7,8,9,10]
                ����Ԫ�غ�
                src����Ԫ��[1,2,3,4,5]��dest����Ԫ��[1,2,3,9,10]
     */
    private static void demo02() {
        // ����Դ����
        int[] src = {1, 2, 3, 4, 5};
        // ����Ŀ������
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("����ǰ��" + Arrays.toString(dest));
        // ʹ��System��ķ���arraycopy��src������ǰ3��Ԫ�أ����Ƶ�dest�����ǰ3��λ����
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("���ƺ�" + Arrays.toString(dest));
    }

    /*
        public static long currentTimeMillis()�����غ���Ϊ��λ�ĵ�ǰʱ��
        �������Գ����Ч��
        ��ϰ��
           ��֤forѭ����ӡ����1-9999����Ҫʹ�õ�ʱ�䣨���룩
     */
    private static void demo01() {
        // ����ִ��ǰ����ȡһ�κ���ֵ
        long s = System.currentTimeMillis();
        // ִ��forѭ��
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);
        }
        // ����ִ�к��ٻ�ȡһ�κ���ֵ
        long e = System.currentTimeMillis();
        System.out.println("���򹲺�ʱ��" + (e - s) + "����");
    }
}
