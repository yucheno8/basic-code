package cn.itcast.day09.demo01Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        //String s1 = null;
        String s2 = "abc";
        //boolean b = s1.equals(s2); // NullPointerException null�ǲ��ܵ��÷�����,���׳���ָ���쳣
        //System.out.println(b);
        /*
            Objects���equals����:������������бȽ�,��ֹ��ָ���쳣
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }

            equals()����
                �Ƚ����������Ƿ���ͬ�����Ǽ���һЩ��׳�Ե��жϣ�
         */
        boolean b2 = Objects.equals(s1, s2); //true
        System.out.println(b2);

    }
}
