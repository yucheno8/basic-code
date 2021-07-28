package cn.itcast.day11.demo05;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
����ӿڵ�ʵ���ࣨ�����Ǹ�������ֻࣩ��Ҫʹ��Ψһ��һ�Ρ�
��ô��������¾Ϳ���ʡ�Ե�����Ķ��壬����Ϊʹ�á������ڲ��ࡿ��

�����ڲ���Ķ����ʽ��
�ӿ����� ������ = new �ӿ�����() {
    // ������д�ӿ������г��󷽷�
};

�Ը�ʽ��new �ӿ�����() {...}�����н�����
1. new����������Ķ���
2. �ӿ����ƾ��������ڲ�����Ҫʵ���Ǹ��ӿ�
3. {...}����������ڲ��������

���⻹Ҫע�⼸�����⣺
1. �����ڲ����ڡ��������󡿵�ʱ��ֻ��Ψһʹ��һ�Ρ�
���ϣ����δ������󣬶����������һ���Ļ�����ô�ͱ���ʹ�õ��������ʵ�����ˡ�
2. ���������ڡ����÷�������ʱ��ֻ�ܵ���Ψһһ�Ρ�
���ϣ��ͬһ�����󣬵��ö�η�������ô���������������֡�
3. �����ڲ�����ʡ���ˡ�ʵ����/���ࡿ����������������ʡ���ˡ��������ơ���
ǿ���������ڲ��������������һ���£�����
*/
public class DemoMain {

    public static void main(String[] args) {
        /*MyInterface obj = new MyInterfaceImpl();
        obj.method();*/

//        MyInterface some = new MyInterface(); // ����д����

        // ʹ�������ڲ��࣬�������������󣬶������ƾͽ�objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("�����ڲ���ʵ���˷�����111-A");
            }

            @Override
            public void method2() {
                System.out.println("�����ڲ���ʵ���˷�����222-A");
            }
        };
        objA.method1();
        objA.method2();
        System.out.println("===========");

        // ʹ���������ڲ�������ʡ���˶������ƣ�Ҳ����������
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("�����ڲ���ʵ���˷�����111-B");
            }

            @Override
            public void method2() {
                System.out.println("�����ڲ���ʵ���˷�����222-B");
            }
        }.method1();

        // ��Ϊ���������޷����õڶ��η�����������Ҫ�ٴ���һ�����ڲ������������
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("�����ڲ���ʵ���˷�����111-B");
            }

            @Override
            public void method2() {
                System.out.println("�����ڲ���ʵ���˷�����222-B");
            }
        }.method2();

    }

}
