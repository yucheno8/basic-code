package cn.itcast.day10.demo9;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
���ʳ�Ա���������ַ�ʽ��
1. ֱ��ͨ���������Ʒ��ʳ�Ա���������Ⱥ������˭��������˭��û���������ҡ�
2. ���ͨ����Ա�������ʳ�Ա���������÷�������˭��������˭��û���������ҡ�

 */
public class Demo01MultiField {

    public static void main(String[] args) {
        // ʹ�ö�̬��д������������ָ���������
        Fu obj = new Zi();
        System.out.println(obj.num); // ��Ա�����ǲ��ܽ��и�����д��
//        System.out.println(obj.age); // ����д����
        System.out.println("==============");

        // ����û�и�����д�����Ǹ���10
        // ������и�����д�������ӣ�20
        obj.showNum();

    }

}
