package cn.itcast.day09.demo07Integer;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    װ�䣺�ѻ������͵����ݣ���װ����װ���У���������->��װ�ࣩ
        ���췽����
            Integer(int value) ����һ���·���� Integer���󣬸ö����ʾָ���� intֵ��
            Integer(String s) ����һ���·��� Integer���󣬱�ʾ int��ָʾֵ String������
                ���ݵ��ַ����������ǻ������͵��ַ�����������׳��쳣 ��100�� ��ȷ ��a�� ���쳣
        ��̬����:
            static Integer valueOf(int i) ����һ�� Integerָ���� intֵ�� Integerʵ����
            static Integer valueOf(String s) ����һ�� Integer���󣬱���ָ����ֵΪ String ��

    ���䣺�ڰ�װ����ȡ���������͵����ݣ���װ��->�������͵����ݣ�
        ��Ա������
            int intValue() �� Integer��ֵ��Ϊ int ��
 */
public class Demo01Integer {
    public static void main(String[] args) {
        // װ�䣺�ѻ������͵����ݣ���װ����װ���У���������->��װ�ࣩ
        // ���췽��
        Integer in1 = new Integer(1);
        System.out.println(in1); // 1 ��д��toString����

        Integer in2 = new Integer("1");
        System.out.println(in2);

        // ��̬����
        Integer in3 = Integer.valueOf(12);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("12");
        System.out.println(in4);

        // ���䣺�ڰ�װ����ȡ���������͵����ݣ���װ��->�������͵����ݣ�
        int i = in1.intValue();
        System.out.println(i);
    }
}
