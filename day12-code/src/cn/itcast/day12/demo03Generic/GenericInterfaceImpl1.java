package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/

/*
    ���з��͵Ľӿڣ���һ��ʹ�÷�ʽ������ӿڵ�ʵ���࣬ʵ�ֽӿڣ�ָ���ӿڵķ���
    public interface Iterator<E> {
        E next();
    }

    Scanner��ʵ����Iterator�ӿڣ���ָ���ӿڵķ���ΪString��������д��next��������Ĭ�Ͼ���String
    public final class Scanner implements Iterator<String> {
        public String next();
    }
 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
