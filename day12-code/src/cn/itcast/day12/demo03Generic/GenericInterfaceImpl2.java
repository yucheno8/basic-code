package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ���з��͵Ľӿڵڶ���ʹ�÷�ʽ���ӿ�ʹ��ʲô���ͣ�ʵ���������ʲô���ͣ�����Žӿ���
    ���൱�ڶ�����һ�����з��͵��࣬���������ʱ��ȷ�����͵�����
    public interface list<E> {
        boolean add(E e);
        E get(int index);
    }

    public class ArrayList<E> implements list<E> {
         public boolean add(E e) {}
         public E get(int index) {}
    }
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
