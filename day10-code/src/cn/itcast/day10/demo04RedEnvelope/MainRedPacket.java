package cn.itcast.day10.demo04RedEnvelope;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("Ⱥ��", 100);

        Member one = new Member("��ԱA", 0);
        Member two = new Member("��ԱB", 0);
        Member three = new Member("��ԱC", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==============");

        // Ⱥ���ܹ���20��Ǯ���ֳ�3�����
        ArrayList<Integer> redList = manager.send(20, 3);

        // ������ͨ��Ա�պ��
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        // 6��6��8������ָ�������
        one.show();
        two.show();
        three.show();
    }
}
