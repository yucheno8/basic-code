package cn.itcast.day10.demo07;

/**
 * @author yucheno8
 * @date 2021/7/27/027
 **/

/*
1. ������֮���ǵ��̳еġ�ֱ�Ӹ���ֻ��һ����
2. ����ӿ�֮���Ƕ�̳еġ�һ�������ʵ�ֶ���ӿڡ�
3. �ӿ���ӿ�֮���Ƕ�̳еġ�

ע�����
    1. ������ӿڵ��еĳ��󷽷�����ظ���û��ϵ��
    2. ������ӿڵ��е�Ĭ�Ϸ�������ظ�����ô�ӽӿڱ������Ĭ�Ϸ����ĸ�����д��������Ҫ����default�ؼ��֡���

 */
public class Demo07Relations {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();
        impl.methodA();
        impl.methodB();
        impl.methodCommon();
        impl.methodDefault();
    }

}
