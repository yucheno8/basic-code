package cn.itcast.day11.demo01;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
���ڳ�Ա������˵�����ʹ��final�ؼ������Σ���ô�������Ҳ�����ǲ��ɱ䡣

1.���ڳ�Ա��������Ĭ��ֵ����������final֮������ֶ���ֵ�������ٸ�Ĭ��ֵ�ˡ�
2.����final�ĳ�Ա������Ҫôʹ��ֱ�Ӹ�ֵ��Ҫôͨ�����췽����ֵ������ѡ��һ��
3.���뱣֤�൱���������صĹ��췽���������ն�final�ĳ�Ա�������и�ֵ��
 */
public class Person {

    private final String name/* = "¹��"*/;

    public Person() {
        name = "����ͮ";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/
}
