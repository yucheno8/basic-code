package cn.itcast.day11.Demo03;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class Body { // �ⲿ��

    public class  Heart { // ��Ա�ڲ���

        // �ڲ���ķ���
        public void beat() {
            System.out.println("�����������ııģ�");
            System.out.println("�ҽУ�" + name);
        }
    }

    // �ⲿ��ĳ�Ա����
    private String name;

    // �ⲿ��ķ���
    public void methodBody() {
        System.out.println("�ⲿ�ķ���");
        new Heart().beat();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
