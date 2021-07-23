package cn.itcast.day09.demo07Integer;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/

/*
    �����������ַ���֮���ת��
    �������� --> �ַ���
        1.�����������ݵ�ֵ + "" ��򵥵ķ�ʽ�������г��ã�
        2.ʹ�ð�װ���еľ�̬����
            static String toString(int i) ����һ����ʾָ��������String����
        3.ʹ��String���еľ�̬����
            static String valueOf(int i) ����int�������ַ�����ʾ��ʽ��
    �ַ��� --> ��������
        ʹ�ð�װ��ľ�̬����parseXX("�ַ���")
            Integer�ࣺstatic int parseInt(String s)
            Double�ࣺstatic double parseDouble(String s)
            ...
 */
public class Demo03Integer {
    public static void main(String[] args) {
        // �������� --> �ַ���
        String s1 = 100 + "";
        System.out.println(s1 + 200); // 100200

        String s2 = Integer.toString(100); // 100200
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 100); // 100100

        // �ַ��� --> ��������
        int i = Integer.parseInt("100");
        System.out.println(i + 300); // 400

        int i2 = Integer.parseInt("a"); // java.lang.NumberFormatException: For input string: "a" ���ָ�ʽ���쳣
        System.out.println(i2);

    }
}
