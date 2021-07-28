package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        // ������䣬�п��ܶ࣬�п����١�
        // ����1��Ǯ����಻���ࡰʣ�½��ƽ������2����
        // ��һ�η�����������Χ��0.01Ԫ~6.66Ԫ
        // ��һ�η������ʣ�µ�������3.34Ԫ��
        // ��ʱ����Ҫ�ٷ�2�����
        // ��ʱ���ٷ���ΧӦ����0.01Ԫ~3.33Ԫ��ȡ�����ұߣ�ʣ��0.01��

        // �ܽ�һ�£���Χ�ġ���ʽ���ǣ�1 + random.nextInt(leftMoney / leftCount * 2)

        Random r = new Random(); // ���ȴ���һ�������������
        // totalMoney���ܽ�totalCount���ܷ���������
        // ���ⶨ�������������ֱ����ʣ�¶���Ǯ��ʣ�¶��ٷ�
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        // �����Ǯn - 1�������һ������Ҫ���
        for (int i = 0; i < totalCount - 1; i++) {
            // ���չ�ʽ����������
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money); // ��һ�����������÷��뼯��
            leftMoney -= money; // ʣ�µĽ��Խ��Խ��
            leftCount--; // ʣ�»�Ӧ���ٷ��ĺ���������ݼ�
        }

        // ���һ���������Ҫ�����ֱ�ӷŽ�ȥ�͵���
        list.add(leftMoney);

        return list;
    }

}
