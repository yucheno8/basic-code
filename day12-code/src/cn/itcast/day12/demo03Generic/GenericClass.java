package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ����һ�����з��͵��࣬ģ��ArrayList����
    ������һ��δ֪���������ͣ������ǲ�ȷ��ʲô�������͵�ʱ�򣬿���ʹ�÷���
    ���Ϳ��Խ���������������ͣ�����ʹ��Integer��String��Student��...
    ���������ʱ��ȷ�����͵���������
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
