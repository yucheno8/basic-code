package cn.itcast.day03.demo15;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/
/*
��һ��ѭ�����������continue�ؼ��֡�
һ��ִ�У�����������ǰ��ѭ��ʣ�����ݣ����Ͽ�ʼ��һ��ѭ����
*/
public class Demo15Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) { // �����ǰ�ǵ�4��
                continue; // ��ô������ǰ��ѭ�������Ͽ�ʼ��һ�Σ���5�㣩
            }
            System.out.println(i + "�㵽�ˡ�");
        }
    }
}
