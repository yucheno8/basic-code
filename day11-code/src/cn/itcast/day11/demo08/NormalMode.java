package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount; // ƽ��ֵ
        int mod = totalMoney % totalCount; // ������ģ����ͷ

        // ע��totalCount - 1�������һ��������
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }

        // ����ͷ����Ҫ�������һ���������
        list.add(avg + mod);

        return list;
    }
}
