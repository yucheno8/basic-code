package cn.itcast.day11.demo01;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
��final�ؼ�����������һ��������ʱ����������������շ�����Ҳ���ǲ��ܱ�������д��
��ʽ��
    ���η� final ����ֵ���� ��������(�����б�) {
        // ������
    }

ע�����
�����ࡢ������˵��abstract�ؼ��ֺ�final�ؼ��ֲ���ͬʱʹ�ã���Ϊì�ܡ�
 */
public abstract class Fu {

    public final void method() {
        System.out.println("���෽��ִ�У�");
    }

    public abstract /*final*/ void methodAbs();

}
