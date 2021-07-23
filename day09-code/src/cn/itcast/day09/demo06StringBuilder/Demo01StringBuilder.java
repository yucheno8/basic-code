package cn.itcast.day09.demo06StringBuilder;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/

/*
String�ࣺ
    �ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ��ġ�
    �ַ����ĵײ���һ����final���ε����飬���ܸı䣬��һ��������
    private final byte[] value��

    �����ַ�������ӣ��ڴ��оͻ��ж���ַ�����ռ�ÿռ�࣬Ч�ʵ���
    String s = "a" + "b" + "c";
        "a", "b", "c" -- 3���ַ���
        "a" + "b" "ab" -- 1���ַ���
        "ab" + "c" "abc" -- 1���ַ���

StringBuilder�ࣺ
    �ַ�������������������ַ����Ĳ���Ч�ʣ����Կ�����һ�����ȿ��Ա仯���ַ�����
    �ײ�Ҳ��һ�����飬����û�б�final���Σ����Ըı䳤��
    byte[] value = new byte[16];

    "a" +"b" + "c" = "abc"
    StringBuilder���ڴ���ʼ����һ�����飬ռ�õĿռ��٣�Ч�ʸ�
    ���������StringBuilder�����������Զ�����
 */

/*
    java.lang.StringBuilder��:�ַ���������,��������ַ�����Ч��
    ���췽��:
        StringBuilder() ����һ�������κ��ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
        StringBuilder(String str) ����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ�
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1" + sb1); // ���հף�

        StringBuffer sb2 = new StringBuffer("itcast");
        System.out.println("sb1" + sb2);
    }
}
