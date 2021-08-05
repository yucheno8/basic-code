package cn.itcast.day09.demo06StringBuilder;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    StringBuilder��ĳ�Ա������
        public StringBuilder append(...)����������������ݵ��ַ�����ʽ�������ص�ǰ��������
        ������
            �������������������

 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        // ����һ��StringBuilder����
        StringBuffer bu1 = new StringBuffer();
        // ʹ��append������StringBuilder���������
        // append�������ص���this�����÷����Ķ���bu1
        StringBuffer bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1 == bu2); // true ��������ʱͬһ������

        // ʹ��append����������շ���ֵ
        /*
        bu1.append("abc");
        bu1.append(1);
        bu1.append(true);
        bu1.append(8.8);
        bu1.append('��');
        System.out.println(bu1); // abcabc1true8.8��
        */

        /*
            ��ʽ��̣������ķ���ֵ��һ�����󣬿��Ը��ݶ���������÷���
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase().toUpperCase());
        bu1.append("abc").append(1).append(true).append(8.8).append("哈哈");
        System.out.println(bu1);
    }
}
