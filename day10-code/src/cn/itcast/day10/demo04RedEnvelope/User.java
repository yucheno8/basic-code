package cn.itcast.day10.demo04RedEnvelope;

/**
 * @author yucheno8
 * @date 2021/7/26/026
 **/
public class User {
    private String name; // ����
    private int money; // Ҳ����Ҳ���ǵ�ǰ�û�ӵ�е�Ǯ��

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // չʾһ�µ�ǰ�û��ж���Ǯ
    public void show() {
        System.out.println("�ҽУ�" + name + "�����ж���Ǯ��" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
