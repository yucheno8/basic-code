package cn.itcast.day09.demo06StringBuilder;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
    StringBuilder��String�����໥ת����
        String --> StringBuilder������ʹ��StringBuilder�Ĺ��췽��
            StringBuilder(String str) ����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ�
        StringBuilder --> String������ʹ��StringBuilder��toString����
            public String toSring()������ǰStringBuilder����ת��ΪString����
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        // String --> StringBuilder������ʹ��StringBuilder�Ĺ��췽��
        String str = "hello";
        System.out.println("str��" + str);
        StringBuffer bu = new StringBuffer(str);
        // ��StringBuilder���������
        bu.append("world");
        System.out.println("bu��" + bu);

        // StringBuilder --> String������ʹ��StringBuilder��toString����
        String s = bu.toString();
        System.out.println("s��" + s);
    }
}
