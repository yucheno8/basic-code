package cn.itcast.day09.demo15super;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/

/*
super�ؼ��ֵ��÷������֣�
1.������ĳ�Ա�����У����ʸ���ĳ�Ա������
2.������ĳ�Ա�����У����ʸ���ĳ�Ա������
3.������Ĺ��췽���У����ʸ���Ĺ��췽����
 */
public class Zi extends Fu {
    int num = 20;

    public Zi() {
        super(); // ��дsuperĬ�ϴ���
    }

    public void methodZi() {
        System.out.println(super.num); // �����е�num
    }

    public void method() {
        super.method(); // ���ʸ�����method
        System.out.println("���෽����");
    }
}
