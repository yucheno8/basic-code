package cn.itcast.day11.demo04;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
���һ�����Ƕ�����һ�������ڲ��ģ���ô�����һ���ֲ��ڲ��ࡣ
���ֲ�����ֻ�е�ǰ�����ķ�������ʹ���������������������Ͳ������ˡ�

�����ʽ��
���η� class �ⲿ������ {
    ���η� ����ֵ���� �ⲿ�෽������(�����б�) {
        class �ֲ��ڲ������� {
            // ...
        }
    }
}

С��һ�����Ȩ�����η���
public > protected > (default) > private
����һ�����ʱ��Ȩ�����η�����
1. �ⲿ�ࣺpublic / (default)
2. ��Ա�ڲ���:public / protected / (default) / private
3. �ֲ��ڲ���:ʲô������д
 */
public class Outer {

    public void methodOuter() {
        class Inner { // �ֲ��ڲ���
            int num = 10;

            public void methodInner() {
                System.out.println(num); // 10
            }
        }

        Inner inner = new Inner();
        inner.methodInner();

    }
}
