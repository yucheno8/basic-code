package cn.itcast.day09.demo09Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/

/*
�ڸ�����ļ̳й�ϵ���У������Ա�����������򴴽��������ʱ�����������ַ�ʽ��
    ֱ��ͨ�����������ʳ�Ա������
        �Ⱥ������˭����������˭��û���������ҡ�
    ���ͨ����Ա������λ��Ա������
        ��������˭����������˭��û���������ҡ�

 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu(); // �����������
        System.out.println(fu.numFu); // ֻ��ʹ�ø���Ķ�����û���κ���������
        System.out.println("========");

        Zi zi = new Zi();
        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("========");

        System.out.println(zi.num); // �������࣬200
        System.out.println(fu.num); // ���ȸ��࣬100
//        System.out.println(zi.abc); // ������û�У����뱨��
        System.out.println("========");

        // ���������zi��ģ�����������ģ�û����������
        zi.methodZi(); // 200
        // ����������ڸ����ж���ģ�
        zi.methodFu(); // 100

    }
}
