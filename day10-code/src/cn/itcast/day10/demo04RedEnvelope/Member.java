package cn.itcast.day10.demo04RedEnvelope;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

// ��ͨ��Ա
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // �Ӷ�������������ȡһ���������Լ�
        // �����ȡһ�����ϵ��е��������
        int index = new Random().nextInt(list.size());
        // �����������Ӽ��ϵ���ɾ�������ҵõ���ɾ���ĺ���������Լ�
        int delta = list.remove(index);
        // ��ǰ��Ա�Լ������ж���Ǯ
        int money = super.getMoney();
        // �ӷ��������������û�ȥ
        super.setMoney(money + delta);

    }

}
