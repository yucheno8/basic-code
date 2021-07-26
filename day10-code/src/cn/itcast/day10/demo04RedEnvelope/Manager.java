package cn.itcast.day10.demo04RedEnvelope;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

// Ⱥ������
public class Manager extends User {

    public Manager() {}

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // ������Ҫһ�����ϣ������洢���ɸ�����Ľ��
        ArrayList<Integer> redList = new ArrayList<>();

        // ���ȿ�һ��Ⱥ���Լ��ж���Ǯ
        int leftMoney = super.getMoney(); // Ⱥ����ǰ���
        if (totalMoney > leftMoney){
            System.out.println("����");
            return redList; // ���ؿռ���
        }

        // ��Ǯ����ʵ���������������
        super.setMoney(leftMoney - totalMoney);

        // �������Ҫƽ����ֳ�Ϊcount��
        int avg = totalMoney / count;
        int mod = totalMoney % count; // ������Ҳ����˦�µ���ͷ

        // ����������ͷ���������һ���������
        // ����Ѻ��һ��һ���ŵ����ϵ���
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // ���һ�����
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
