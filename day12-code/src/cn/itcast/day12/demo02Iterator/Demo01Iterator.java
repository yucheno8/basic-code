package cn.itcast.day12.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yucheno8
 * @date 2021/7/30/030
 **/

/*
    java.util.Iterator�ӿڣ����������Լ��Ͻ��б�����
        ���������õķ�����
            boolean hasNext()   �������Ԫ�ؿ��Ե������򷵻� true��
                �жϼ����л���û����һ��Ԫ�أ��оͷ���true��û�оͷ��� false��
            E next()    ���ص�������һ��Ԫ�ء�
                ȡ�������е���һ��Ԫ��
    Iterator��������һ���ӿڣ������޷�ֱ��ʹ�ã���Ҫʹ��Iterator�ӿڵ�ʵ������󣬻�ȡʵ����ķ�ʽ�Ƚ�����
    Collection�ӿ�����һ����������iterator()������������صľ��ǵ�������ʵ�������
        Iterator<E> iterator() �����ڴ� collection ��Ԫ���Ͻ��е����ĵ�������

    ��������ʹ�ò��裨�ص㣩��
        1. ʹ�ü����еķ���iterator()��ȡ��������ʵ�������ʹ��Iterator�ӿڽ��գ���̬��
        2. ʹ��Iterator�ӿ��еķ���hasNext�жϻ���û����һ��Ԫ��
        3. ʹ��Iterator�ӿ��еķ���nextȡ�������е���һ��Ԫ��

 */
public class Demo01Iterator {

    public static void main(String[] args) {
        // ����һ�����϶���
        Collection<String> coll = new ArrayList<>();
        // �����������Ԫ��
        coll.add("Ҧ��");
        coll.add("�Ʊ�");
        coll.add("���");
        coll.add("ղķ˹");
        coll.add("����ɭ");

        /*
            1. ʹ�ü����еķ���iterator()��ȡ������ʵ�������ʹ��Iterator�ӿڽ��գ���̬��
            ע�⣺
                Iterator<E>�ӿ�Ҳ���з��͵ģ��������ķ��͸��⼯���ߣ�������ʲô���ͣ�����������ʲô����
         */
        // ��̬ �ӿ�                ʵ�������
        Iterator<String> it = coll.iterator();

        /*
            ����ʹ�õ�����ȡ��������Ԫ�صĴ��룬��һ���ظ��Ĺ���
            �������ǿ���ʹ��ѭ���Ż�
            ��֪���������ж���Ԫ�أ�ʹ��whileѭ��
            ѭ��������������hasNext()��������false
         */
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("===================");

        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
            String e = it2.next();
            System.out.println(e);
        }
        System.out.println("===================");

        /*
        ��ǿforѭ��
            ��ǿforѭ����Ҳ��for eachѭ������JDK1.5�Ժ������һ���߼�forѭ����ר��������������ͼ��ϵġ�
            �����ڲ�ԭ����ʵ�Ǹ�Iterator�������������ڱ����Ĺ����У����ܶԼ����е�Ԫ�ؽ�����ɾ������
            �����ڱ���Collection�����顣ͨ��ֻ���б���Ԫ�أ���Ҫ�ڱ����Ĺ����жԼ���Ԫ�ؽ�����ɾ������
            ʹ�÷�����
            for(�������� ������ : ��������) {
                ѭ�������;
            }
         */
        // ��ǿforѭ��
        for (String s : coll) {
            System.out.println(s);
        }
        System.out.println("==============");

        // ʹ����ǿforѭ����������
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        /*// 2. ʹ��Iterator�ӿ��еķ���hasNext�жϻ���û����һ��Ԫ��
        boolean b = it.hasNext();
        System.out.println(b); // true

        // 3. ʹ��Iterator�ӿ��еķ���nextȡ�������е���һ��Ԫ��
        String s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b); // û��Ԫ�أ�����false
        s = it.next(); // û��Ԫ�أ���ȡ��Ԫ�ػ��׳�NoSuchElementExceptionû��Ԫ���쳣
        System.out.println(s);*/
    }

}
