package cn.itcast.day11.demo06;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class DemoMain {

    public static void main(String[] args) {
        // ����һ��Ӣ�۽�ɫ
        Hero hero = new Hero();
        // ΪӢ����һ�����֣�������������
        hero.setName("����");
        hero.setAge(20);

        // ����һ����������
        Weapon weapon = new Weapon("AK47");
        // ΪӢ���䱸����
        hero.setWeapon(weapon);

        // ����Ϊ20�ĸ����ö����������з�
        hero.attack();
    }

}
