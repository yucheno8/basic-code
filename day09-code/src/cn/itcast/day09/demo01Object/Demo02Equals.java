package cn.itcast.day09.demo01Object;

import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
            Person��Ĭ�ϼ̳���Object��,���Կ���ʹ��Object���equals����
            boolean equals(Object obj) ָʾ����ĳ�������Ƿ���˶�����ȡ���
            Object��equals����Դ��:
                public boolean equals(Object obj) {
                    return (this == obj);
                }
                ����:
                    Object obj:���Դ�������Ķ���
                �����壺
                    == �Ƚ������,���ص���һ������ֵ true false
                    ������������:�Ƚϵ���ֵ
                    ������������:�Ƚϵ�����������ĵ�ֵַ
               this��˭?�Ǹ�������õķ���,�����е�this�����Ǹ�����;p1���õ�equals��������this����p1
               obj��˭?���ݹ����Ĳ���p2
               this==obj -->p1==p2
               ��дǰ���Ƚϵ��Ƕ���ĵ�ֵַ
               ��д�󣺱Ƚϵ��Ƕ��������ֵ
         */
        Person p1 = new Person("�����Ȱ�",18);
        //Person p2 = new Person("��������",19);
        Person p2 = new Person("�����Ȱ�",18);
        System.out.println("p1:"+p1);//p1:com.itheima.demo01.Object.Person@58ceff1
        System.out.println("p2:"+p2);//p2:com.itheima.demo01.Object.Person@7c30a502

        //p1=p2;//��p2�ĵ�ֵַ��ֵ��p1
        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(p2); // ��д������true
        System.out.println(b);
    }
}
