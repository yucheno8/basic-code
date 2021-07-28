package cn.itcast.day11.demo06;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

// ��Ϸ���е�Ӣ�۽�ɫ��
public class Hero {

    private String name; // Ӣ������
    private int age; // Ӣ�۵�����
    private Weapon weapon; // Ӣ�۵�����

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("����Ϊ" + age + "��" + name + "��" + weapon.getCode() + "�����з�" );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
