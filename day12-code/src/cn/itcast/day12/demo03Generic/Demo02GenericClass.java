package cn.itcast.day12.demo03Generic;

/**
 * @author yucheno8
 * @date 2021/7/31/031
 **/
public class Demo02GenericClass {
    public static void main(String[] args) {
        // ��д����Ĭ��ΪObject����
        GenericClass gc = new GenericClass();
        gc.setName("ֻ�����ַ���");
        Object obj = gc.getName();

        // ����GenericClass���󣬷���ʹ��Integer����
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("С��");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}
