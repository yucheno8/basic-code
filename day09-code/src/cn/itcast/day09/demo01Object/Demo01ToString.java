package cn.itcast.day09.demo01Object;

/**
 * @author yucheno8
 * @date 2021/7/14/014
 **/

/*
 * java.lang.Object��
 * �� Object �����νṹ�ĸ�����㣩�ࡣÿ���඼ʹ�� Object ��Ϊ����������
 * ���ж��󣨰������飩��ʵ�������ķ���
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object
    �� Object �����νṹ�ĸ�(��)�ࡣ
    ÿ����(Person,Student...)��ʹ�� Object ��Ϊ��(��)�ࡣ
    ���ж��󣨰������飩��ʵ�������ķ�����
 */
public class Demo01ToString{
    public static void main(String[] args) {
        /*
            Person��Ĭ�ϼ̳���Object��,���Կ���ʹ��Object���е�toString����
            String toString() ���ظö�����ַ�����ʾ��
            ��дǰ����ӡ���ǰ�������@��ֵַ
            ��д�󣺴�ӡ���Ƕ����е�����ֵ
         */
        Person p = new Person("小明",18);
        String s = p.toString();
        System.out.println(s);//cn.itheima.demo01.Object.Person@75412c2f | abc | Person{name=���� ,age=18}

        //ֱ�Ӵ�ӡ���������,��ʵ���ǵ��ö����toString  p=p.toString();
        System.out.println(p);//cn.itheima.demo01.Object.Person@5f150435 | abc | Person{name=���� ,age=18}

        //��һ�����Ƿ���д��toString,ֱ�Ӵ�ӡ�����Ķ��󼴿�,���û����дtoString������ô��ӡ���Ƕ���ĵ�ֵַ
        Random r = new Random();
        System.out.println(r);//java.util.Random@3f3afe78  û����дtoString����

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//java.util.Scanner[delimiters=\p{javaWhitespace}+..  ��дtoString����

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3]  ��дtoString����
    }
}
