package cn.itcast.day03.demo06;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/
// ��Ŀ��ʹ����Ԫ������ͱ�׼��if-else���ֱ�ʵ�֣�ȡ�������ֵ��е����ֵ
public class Demo06Max {
    public static void main(String[] args) {
        int a = 105;
        int b = 20;

        // ����ʹ����Ԫ�����
        // int max = a > b ? a : b;

        // ʹ�ý����if���
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("���ֵ��" + max);
    }
}
