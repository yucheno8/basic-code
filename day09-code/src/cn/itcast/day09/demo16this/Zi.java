package cn.itcast.day09.demo16this;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
super�ؼ����������ʸ������ݣ���this�ؼ����������ʱ������ݡ�
�÷�Ҳ�����֣�
    1.�ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա������
    2.�ڱ���ĳ�Ա�����У����ʱ������һ����Ա������
    3.�ڱ���Ĺ��췽���У����ʱ������һ�����췽��
        �ڵ������÷�����Ҫע�⣺
        A.this��...)����Ҳ�����ǹ��췽���ĵ�һ����䣬Ψһһ����
        B.super��this���ֹ�����ã�����ͬʱʹ�á�
 */
public class Zi extends Fu {
    int num = 20;

    public Zi() {
//        super(); // ��һ�в�������
        this(123); // ������޲ι��죬���ñ�����вι���
//        this(1,2) // ����д����
    }

    public Zi(int n) {
        this(1, 2);
    }

    public Zi(int n, int m) {
    }

    public void showNum() {
        int num = 10;
        System.out.println(num); // �ֲ�����
        System.out.println(this.num); // �����еĳ�Ա����
        System.out.println(super.num); // �����еĳ�Ա����
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
