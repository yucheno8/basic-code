package cn.itcast.day11.demo01;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
final�ؼ��ִ������ա����ɸı�ġ�

���������÷���
    1.������������һ���ࣻ
    2.������������һ��������
    3.��������������һ���ֲ�������
    4.��������������һ����Ա������
 */
public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        // һ��ʹ��final�������ξֲ���������ô��������Ͳ��ܽ��и��ġ�
        // ��һ�θ�ֵ���������䡱
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 250; // ����д�������ܸı䣡
//        num2 = 200; // ����д����

        // ��ȷд����ֻҪ��֤��Ψһһ�θ�ֵ���ɡ�
        final int num3;
        num3 = 30;

        // ���ڻ���������˵�����ɱ�˵���Ǳ������е����ݲ��ɸı䡣
        // ��������������˵�����ɱ�˵���Ǳ������еĵ�ֵַ���ɸı䡣

        Student stu1 = new Student("����ӱ");
        System.out.println(stu1);
        System.out.println(stu1.getName()); // ����ӱ
        stu1 = new Student("������");
        System.out.println(stu1);
        System.out.println(stu1.getName()); // ������
        System.out.println("===========");

        final Student stu2 = new Student("��ԲԲ");
        // ����д����final���������ͣ����еĵ�ַ���ɸı�
//        stu2 = new Student("����͢");
        System.out.println(stu2.getName()); // ��ԲԲ
        stu2.setName("��ԲԲԲԲԲԲ");
        System.out.println(stu2.getName()); // ��ԲԲԲԲԲԲ
    }


}
