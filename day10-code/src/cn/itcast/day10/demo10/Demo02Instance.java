package cn.itcast.day10.demo10;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
��β���֪��һ���������õĶ��󣬱�����ʲô���ࣿ
��ʽ��
    ���� instanceOf ������
�⽫�õ�һ��booleanֵ�����Ҳ�����ж�ǰ��Ķ����ܲ��ܵ����������͵�ʵ����
 */
public class Demo02Instance {

    public static void main(String[] args) {
        Animal animal = new Dog(); // ������һֻ��
        animal.eat(); // ����SHIT

        // ���ϣ�������������з�������Ҫ����ת��
        // �ж�һ�¸�������animal�����ǲ���Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }


}
