package cn.itcast.day08.demo04ArraysMath;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/

/*
��Ŀ��
������-10.8��5.9֮�䣬����ֵ����6����С��2.1�������ж��ٸ���

������
1. ��Ȼ�Ѿ�ȷ���˷�Χ��forѭ��
2. ���λ��-10.8Ӧ��ת����Ϊ-10�����ְ취��
    2.1 ����ʹ��Math.ceil���������ϣ���������ȡ��
    2.2 ǿת��Ϊint���Զ���������С��λ
3. ÿһ�����ֶ������������Բ������ʽӦ����num++������ÿ�ζ���+1�ġ�
4. ����õ�����ֵ��Math.abs������
5. һ��������һ�����֣���Ҫ�ü�����++����ͳ�ơ�

��ע�����ʹ��Math.ceil������-10.8���Ա��-10.0��ע��doubleҲ�ǿ��Խ���++�ġ�
 */
public class Demo04MathPractise {

    public static void main(String[] args) {
        int count = 0; // ����Ҫ�������

        double min = -10.8;
        double max = 5.9;
        // ������������i��������֮�����е�����
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i); // ����ֵ
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("�ܹ��У�" + count); // 9
    }

}

