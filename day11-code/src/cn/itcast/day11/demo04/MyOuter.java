package cn.itcast.day11.demo04;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
�ֲ��ڲ��࣬���ϣ���������ڷ����ľֲ���������ô����ֲ����������ǡ���Чfinal�ġ���

��ע����Java 8+��ʼ��ֻ�оֲ�������ʵ���䣬��ôfinal�ؼ��ֿ���ʡ�ԡ�

ԭ��
1. new�����Ķ����ڶ��ڴ浱�С�
2. �ֲ������Ǹ��ŷ����ߵģ���ջ�ڴ浱�С�
3. �������н���֮�����̳�ջ���ֲ�������ʧ��
4. new�����Ķ�����ڶѵ��г������ڣ�ֱ������������ʧ��
 */
public class MyOuter {

    public void methodOuter() {
        int num = 10;

        class MyInner { // �ֲ��ڲ���
            public void methodInner() {
                System.out.println(num);
            }
        }
    }

}
