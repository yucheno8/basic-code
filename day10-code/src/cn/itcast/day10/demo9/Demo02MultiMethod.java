package cn.itcast.day10.demo9;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
�ڶ����Ĵ��뵱�У���Ա�����ķ��ʹ����ǣ�
    ��new����˭����������˭��û���������ҡ�
�ھ������뿴��ߣ����п��ұߡ�

�Ա�һ�£�
    ��Ա���������뿴��ߣ����л�����ߡ�
    ��Ա���������뿴��ߣ����п��ұߡ�
 */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi(); // ��̬
        obj.method(); // ���Ӷ��У�������������
        obj.methodFu(); // ����û�У������У������ҵ�����

        // ���뿴�������Fu��Fu����û��methodZi���������Ա��뱨��
//        obj.methodZi(); // ����д����

    }

}
